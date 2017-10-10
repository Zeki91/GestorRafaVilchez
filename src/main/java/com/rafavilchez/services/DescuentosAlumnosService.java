package com.rafavilchez.services;

import com.rafavilchez.model.DescuentosAlumnosBase;
import com.rafavilchez.model.impl.*;
import com.rafavilchez.persistence.impl.DescuentosAlumnosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DescuentosAlumnosService {

    @Autowired DescuentosAlumnosMapper descuentosAlumnosMapper;
    @Autowired AlumnoService alumnoService;
    @Autowired AlumnoAsignaturaService alumnoAsignaturaService;

    public List<DescuentosAlumnos> getAll () {
        List<DescuentosAlumnosBase> listBase = descuentosAlumnosMapper.selectByExample(null);
        List<DescuentosAlumnos> list = new ArrayList<>();

        for(DescuentosAlumnosBase aa : listBase) {
            list.add(new DescuentosAlumnos(aa));
        }

        return list;
    }

    public DescuentosAlumnos getPorId(int id) {
        DescuentosAlumnosBase dab = descuentosAlumnosMapper.selectByPrimaryKey(id);
        return dab == null ? null : new DescuentosAlumnos(dab);
    }

    public List<DescuentosAlumnos> getPorIdAlumno(int idAlumno) {
        return descuentosAlumnosMapper.getPorIdAlumno(idAlumno);
    }

    public DescuentosAlumnos getPorIdAsignaturaIdAlumno(int idAsignatura, int idAlumno) {
        return descuentosAlumnosMapper.getPorIdAsignaturaIdAlumno(idAsignatura, idAlumno);
    }

    public List<DescuentosAlumnos> getDescuentosExtraPorIdAlumno (int idAlumno) {
        return descuentosAlumnosMapper.getDescuentosExtraPorIdAlumno(idAlumno);
    }

    public DescuentosAlumnos getDescuentoAmigoPorIdAlumno (int idAlumno) {
        return descuentosAlumnosMapper.getDescuentoAmigoPorIdAlumno(idAlumno);
    }

    public void eliminarDescuentos (int idAlumno, int idAsignatura) {
        descuentosAlumnosMapper.eliminarDescuentos(idAlumno, idAsignatura);
    }

    public int insert (DescuentosAlumnos d) {
        return descuentosAlumnosMapper.insert(d);
    }

    public int update (DescuentosAlumnos d) {
        return descuentosAlumnosMapper.updateByPrimaryKey(d);
    }

    public int delete (DescuentosAlumnos d) { return descuentosAlumnosMapper.deleteByPrimaryKey(d.getId()); }

    public List<DescuentosAlumnos> calcularDescuentos (int idAlumno) {

        eliminarDescuentosCD(idAlumno);

        Alumno alumno = alumnoService.getById(idAlumno);
        List<DescuentosAlumnos> descuentos = new ArrayList<>();

        if (alumno != null) {
            List<Asignatura> asignaturas = alumno.getAsignaturas();

            if (alumno.getVulebu()) {
                // Descuento VuleBú
                boolean tieneVuleBu = false;
                for (Asignatura a : asignaturas) {
                    if (a.getDescuento() && !tieneVuleBu) {

                        DescuentosAlumnos da = new DescuentosAlumnos();
                        da.setIdAlumno(idAlumno);
                        da.setIdAsignatura(a.getIdAsignatura());
                        da.setIdDescuento(Descuento.DESCUENTO_VULEBU);
                        da.setCantidad((float)5);
                        da.setActivo(true);

                        this.insert(da);

                        tieneVuleBu = true;
                    }
                }
            }

            // Eliminamos los idiomas porque no cuentan para los descuentos por número de asignaturas
            List<Asignatura> temp = new ArrayList<>(asignaturas);
            temp = eliminarIdiomas(temp);

            // Descuento por número de asignaturas
             if (temp.size() > 1) {

                 //TODO: Revisar esta funcionalidad

                 Collections.sort(temp, new Comparator<Asignatura>() {
                     @Override
                     public int compare(Asignatura a1, Asignatura a2) {
                         return a2.getPrecioBruto().compareTo(a1.getPrecioBruto());
                     }
                 });

                 if (temp.size() == 2) {

                     DescuentosAlumnos descuentoAsignatura = new DescuentosAlumnos();
                     descuentoAsignatura.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                     descuentoAsignatura.setIdAlumno(idAlumno);
                     descuentoAsignatura.setActivo(true);
                     descuentoAsignatura.setPorcentaje((float)10);

                     descuentoAsignatura.setIdAsignatura(temp.get(0).getIdAsignatura());

                     this.insert(descuentoAsignatura);

                 } else if (temp.size() == 3) {

                     DescuentosAlumnos descuento1 = new DescuentosAlumnos();
                     descuento1.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                     descuento1.setIdAlumno(idAlumno);
                     descuento1.setActivo(true);
                     descuento1.setPorcentaje((float)15);

                     DescuentosAlumnos descuento2 = new DescuentosAlumnos();
                     descuento2.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                     descuento2.setIdAlumno(idAlumno);
                     descuento2.setActivo(true);
                     descuento2.setPorcentaje((float)10);

                     descuento1.setIdAsignatura(temp.get(0).getIdAsignatura());
                     descuento2.setIdAsignatura(temp.get(1).getIdAsignatura());

                     this.insert(descuento1);
                     this.insert(descuento2);

                 } else if (temp.size() >= 4) {

                     DescuentosAlumnos descuento1 = new DescuentosAlumnos();
                     descuento1.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                     descuento1.setIdAlumno(idAlumno);
                     descuento1.setActivo(true);
                     descuento1.setPorcentaje((float)15);

                     DescuentosAlumnos descuento2 = new DescuentosAlumnos();
                     descuento2.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                     descuento2.setIdAlumno(idAlumno);
                     descuento2.setActivo(true);
                     descuento2.setPorcentaje((float)15);

                     DescuentosAlumnos descuento3 = new DescuentosAlumnos();
                     descuento3.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                     descuento3.setIdAlumno(idAlumno);
                     descuento3.setActivo(true);
                     descuento3.setPorcentaje((float)10);

                     descuento1.setIdAsignatura(temp.get(0).getIdAsignatura());
                     descuento2.setIdAsignatura(temp.get(1).getIdAsignatura());
                     descuento3.setIdAsignatura(temp.get(2).getIdAsignatura());

                     this.insert(descuento1);
                     this.insert(descuento2);
                     this.insert(descuento3);

                 }
             }
        }

        return descuentos;
    }

    public void actualizarVulebu (int idAlumno, boolean anadir) {

        List<DescuentosAlumnos> descuentos = descuentosAlumnosMapper.getPorIdAlumno(idAlumno);
        List<AlumnoAsignatura> asignaturas = alumnoAsignaturaService.getPorIdAlumno(idAlumno);

        if (anadir) {

            boolean tieneVulebu = false;
            Asignatura a = null;

            for (DescuentosAlumnos d : descuentos) {
                if (d.getIdDescuento() == 2) tieneVulebu = true;
            }

            for (AlumnoAsignatura aa : asignaturas) {
                if (aa.getAsignatura().getDescuento()) {
                    a = aa.getAsignatura();
                    break;
                }
            }

            if (!tieneVulebu & a != null) {
                DescuentosAlumnos da = new DescuentosAlumnos();
                da.setIdAlumno(idAlumno);
                da.setIdAsignatura(a.getIdAsignatura());
                da.setIdDescuento(Descuento.DESCUENTO_VULEBU);
                da.setCantidad((float)5);
                da.setActivo(true);

                this.insert(da);
            }

        } else {
            for (DescuentosAlumnos d : descuentos) {
                if (d.getIdDescuento() == 2) {
                    descuentosAlumnosMapper.deleteByPrimaryKey(d.getId());
                }
            }
        }
    }

    private List<Asignatura> eliminarIdiomas(List<Asignatura> asignaturas) {
        for (Iterator<Asignatura> it = asignaturas.iterator(); it.hasNext();) {
            Asignatura a = it.next();
            if (a.getDescuento()) {
                it.remove();
            }
        }

        return asignaturas;
    }

    private void eliminarDescuentosCD (int idAlumno) {
        List<DescuentosAlumnos> descuentos = descuentosAlumnosMapper.getPorIdAlumno(idAlumno);

        for (DescuentosAlumnos d : descuentos) {
            if (d.getIdDescuento() == Descuento.DESCUENTO_VULEBU || d.getIdDescuento() == Descuento.DESCUENTO_ASIGNATURAS) {
                descuentosAlumnosMapper.deleteByPrimaryKey(d.getId());
            }
        }

    }

}
