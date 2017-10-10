package com.rafavilchez.services;

import com.rafavilchez.model.ReciboBase;
import com.rafavilchez.model.impl.*;
import com.rafavilchez.persistence.impl.*;
import com.rafavilchez.utils.Page;
import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ReciboService {

    @Autowired ReciboMapper reciboMapper;
    @Autowired EntradaReciboMapper entradaReciboMapper;
    @Autowired AlumnoMapper alumnoMapper;
    @Autowired DescuentosAlumnosMapper descuentosAlumnosMapper;
    @Autowired HorasExtraMapper horasExtraMapper;


    public List<Recibo> getAll() {
        return reciboMapper.selectAll();
    }

    public Page<Recibo> getFiltered (Integer page, Integer filtroPagado, Integer filtroMes, Integer filtroAnyo, Integer filtroAlumno) {
        int offset = (page-1)*10;
        List<Recibo> recibos = reciboMapper.getFiltered(offset, filtroPagado, filtroAnyo, filtroMes, filtroAlumno);

        Page<Recibo> result = new Page();
        result.setPage(page);
        result.setList(recibos);
        result.setTotal((long)reciboMapper.getFiltered(null, filtroPagado, filtroAnyo, filtroMes, filtroAlumno).size());
        result.setSize(50);

        return result;
    }

    public Recibo getById(String codRecibo) {

        Recibo recibo = reciboMapper.getReciboPorId(codRecibo);
        return recibo == null ? null : recibo;

    }

    public List<Recibo> getRecibosPorIdAlumno (int idAlumno) {
        return reciboMapper.getRecibosPorIdAlumno(idAlumno);
    }

    public int actualizarRecibo (Recibo recibo) {
        return reciboMapper.updateByPrimaryKey(recibo);
    }

    public int guardarRecibo (Recibo recibo) {
        return reciboMapper.insert(recibo);
    }

    public int guardarEntradaRecibo (EntradaRecibo entradaRecibo) {
        if (entradaRecibo.getId() == null) {
            return entradaReciboMapper.insert(entradaRecibo);
        } else {
            return entradaReciboMapper.updateByPrimaryKey(entradaRecibo);
        }
    }

    public List<EntradaRecibo> getEntradasReciboPorCodRecibo (String codRecibo) {
        return entradaReciboMapper.getEntradasReciboPorCodRecibo(codRecibo);
    }

    public EntradaRecibo getEntradaReciboPorId (int id) {
        return entradaReciboMapper.getEntradaReciboPorId(id);
    }

    public int delete (String codRecibo) {
        int result = entradaReciboMapper.deleteWithCodRecibo(codRecibo);
        if (result >= 0) return reciboMapper.deleteByPrimaryKey(codRecibo);

        return -1;

    }

    public int actualizarImporteTotal (String codRecibo) {
        return reciboMapper.actualizarImporteTotal(codRecibo);
    }

    @Transactional (rollbackFor = Exception.class)
    public Recibo generarRecibo (int idAlumno, int mes) {

        List<Recibo> recibosAnteriores = reciboMapper.getRecibosPorIdAlumno(idAlumno);
        DateFormat df = new SimpleDateFormat("yy");
        int annoActual = Integer.valueOf(df.format(Calendar.getInstance().getTime()));
        List<AlumnoAsignatura> asignaturas = alumnoMapper.getAsignaturasMatriculadas(idAlumno);
        String oldCodRecibo = "";
        Date oldFechaPago = null;

        for (Recibo r : recibosAnteriores) {
            if (r.getCodRecibo().split("/")[0].equals(String.valueOf(annoActual)) && r.getMes() == mes) {
                oldCodRecibo = r.getCodRecibo();
                oldFechaPago = r.getFechaPago();
                delete(r.getCodRecibo());
                break;
            }
        }

        Recibo recibo = new Recibo();
        Alumno alumno = alumnoMapper.getAlumnoPorId(idAlumno);

        List<DescuentosAlumnos> descuentosExtra = descuentosAlumnosMapper.getDescuentosExtraPorIdAlumno(idAlumno);
        List<HorasExtra> horasExtra = horasExtraMapper.getPorIdAlumno(idAlumno);
        List<EntradaRecibo> entradas = new ArrayList<>();
        float cantidadTotal = 0;

        recibo.setCodRecibo(!"".equals(oldCodRecibo) ? oldCodRecibo : generarCodRecibo());
        recibo.setIdAlumno(idAlumno);
        recibo.setAlumno(alumno);
        recibo.setMes(mes);
        recibo.setAnyo(Calendar.getInstance().get(Calendar.YEAR));
        recibo.setFechaEmision(Calendar.getInstance().getTime());

        if (oldFechaPago != null) recibo.setFechaPago(oldFechaPago);

        // Entradas referentes a asignaturas
        for (AlumnoAsignatura as : asignaturas) {
            EntradaRecibo er = new EntradaRecibo();
            boolean tieneDescuento = false;

            er.setCodRecibo(recibo.getCodRecibo());
            er.setConcepto(as.getAsignatura().getNombre());
            er.setTipoEntrada(EntradaRecibo.TIPO_ASIGNATURA);

            DescuentosAlumnos da = descuentosAlumnosMapper.getPorIdAsignaturaIdAlumno(as.getIdAsignatura(), idAlumno);

            if (da != null) {
                tieneDescuento = true;
                String tipoDescuento = da.getPorcentaje() != null ? Descuento.TIPO_DESCUENTO_PORCENTUAL : Descuento.TIPO_DESCUENTO_CANTIDAD;
                er.setTipoDescuento(tipoDescuento);
                er.setDescuento(tipoDescuento.equals(Descuento.TIPO_DESCUENTO_CANTIDAD) ? da.getCantidad() : da.getPorcentaje());
            }

            if (as.getImporteEditado() != null) {

                er.setCantidad(as.getImporteEditado());
                cantidadTotal += as.getImporteEditado();

            } else {

                if (tieneDescuento) {
                    if (er.getTipoDescuento().equals(Descuento.TIPO_DESCUENTO_CANTIDAD)) {
                        er.setCantidad(as.getAsignatura().getPrecioBruto() - er.getDescuento());
                    } else {
                        er.setCantidad(as.getAsignatura().getPrecioBruto() - (as.getAsignatura().getPrecioBruto() * (er.getDescuento()/100)));
                    }
                } else {
                    er.setCantidad(as.getAsignatura().getPrecioBruto());
                }

                cantidadTotal += er.getCantidad();
            }


            entradas.add(er);
        }

        //Entradas referentes a horas extra
        for (HorasExtra he : horasExtra) {

            if (he.getMes() == mes && he.getAnyo() == new DateTime().getYear()) {
                EntradaRecibo er = new EntradaRecibo();
                float precio = he.getNumHoras() * he.getPrecio();

                er.setCodRecibo(recibo.getCodRecibo());
                er.setConcepto(he.getAsignatura().getNombre() + " (" + he.getNumHoras() + "h extra)");
                er.setTipoEntrada(EntradaRecibo.TIPO_HORAS_EXTRA);

                er.setCantidad(precio);

                cantidadTotal += precio;
                entradas.add(er);
            }
        }

        // Entradas referentes a descuento absolutos
        for (DescuentosAlumnos de : descuentosExtra) {

            if (de.getCantidad() != null && de.getActivo()) {
                EntradaRecibo er = new EntradaRecibo();

                er.setCodRecibo(recibo.getCodRecibo());
                er.setConcepto(de.getDescuento().getNombre());
                er.setTipoDescuento(Descuento.TIPO_DESCUENTO_CANTIDAD);
                er.setDescuento(de.getCantidad());
                er.setCantidad(de.getCantidad() * -1);
                er.setTipoEntrada(EntradaRecibo.TIPO_DESCUENTO);

                cantidadTotal += er.getCantidad();

                entradas.add(er);

                if (de.getIdDescuento().equals(Descuento.DESCUENTO_AMIGO)) {
                    // Si es descuento AMIGO lo desactivamos
                    de.setActivo(false);
                    descuentosAlumnosMapper.updateByPrimaryKey(de);
                }
            }

        }

        // Entradas referentes a descuentos porcentuales
        for (DescuentosAlumnos de : descuentosExtra) {

            if (de.getPorcentaje() != null) {
                EntradaRecibo er = new EntradaRecibo();

                er.setCodRecibo(recibo.getCodRecibo());
                er.setConcepto(de.getDescuento().getNombre());
                er.setTipoDescuento(Descuento.TIPO_DESCUENTO_PORCENTUAL);
                er.setDescuento(de.getPorcentaje());
                er.setCantidad(cantidadTotal*(de.getPorcentaje()/100) * -1);
                er.setTipoEntrada(EntradaRecibo.TIPO_DESCUENTO);

                cantidadTotal += er.getCantidad();

                entradas.add(er);
            }

        }

        recibo.setCantidadTotal(cantidadTotal > 0 ? cantidadTotal : 0);
        recibo.setEntradas(entradas);

        reciboMapper.insert(recibo);
        for (EntradaRecibo er : entradas) {
            entradaReciboMapper.insert(er);
        }

        return recibo;
    }

    public int eliminarEntradaRecibo (int idEntrada) {
        return entradaReciboMapper.deleteByPrimaryKey(idEntrada);
    }

    public boolean tieneRecibosSinPagar (int idAlumno) {
        List<Recibo> recibos = getRecibosPorIdAlumno(idAlumno);

        for (Recibo recibo : recibos) {
            if (recibo.getFechaPago() == null) return true;
        }

        return false;
    }

    private String generarCodRecibo() {
        boolean valido = false;
        String codRecibo;
        DateFormat df = new SimpleDateFormat("yy");
        do {
            codRecibo = df.format(Calendar.getInstance().getTime()) + "/" + RandomStringUtils.random(6, false, true);
            if (reciboMapper.getReciboPorId(codRecibo) == null) valido = true;
        } while (!valido);

        return codRecibo;

    }

}
