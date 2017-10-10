package com.rafavilchez.controller;

import com.rafavilchez.model.impl.EntradaRecibo;
import com.rafavilchez.model.impl.Movimiento;
import com.rafavilchez.model.impl.Recibo;
import com.rafavilchez.services.*;
import com.rafavilchez.utils.Page;
import com.rafavilchez.utils.RespuestaAjax;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RecibosController {

    private final static Logger logger = LoggerFactory.getLogger(RecibosController.class);

    @Autowired
    private ReciboService reciboService;

    @Autowired
    private AlumnoService alumnoService;

    @Autowired
    private AsignaturaService asignaturaService;

    @Autowired
    private MovimientosService movimientosService;

    @Autowired
    private CajaService cajaService;

    @RequestMapping(value = "/notas-de-pago/listado", method = RequestMethod.GET)
    public String listadoRecibos (Model model
                                ,@RequestParam(value = "result", required = false) Integer result
                                ,@RequestParam(value = "page", required = false, defaultValue = "1") Integer page
                                ,@RequestParam(value = "filtroAlumno", required = false) Integer filtroAlumno
                                ,@RequestParam(value = "filtroPagado", required = false, defaultValue = "0") Integer filtroPagado
                                ,@RequestParam(value = "filtroFecha", required = false, defaultValue = "") String filtroFecha)
    {

        model.addAttribute("menuItemActive", 4);

        Integer filtroMes = null;
        Integer filtroAnyo = null;

        if (filtroFecha != null && !filtroFecha.equals("")) {
            filtroMes = Integer.valueOf(filtroFecha.split("/")[0]);
            filtroAnyo = Integer.valueOf(filtroFecha.split("/")[1]);
        }

        Page<Recibo> results = reciboService.getFiltered(page, filtroPagado, filtroMes, filtroAnyo, filtroAlumno);

        model.addAttribute("page", results);
        model.addAttribute("alumnos", alumnoService.getAll());
        model.addAttribute("filtroAlumno", filtroAlumno);
        model.addAttribute("filtroPagado", filtroPagado);
        model.addAttribute("filtroFecha", filtroFecha);

        if (result != null) {
            if (result == 1) {
                model.addAttribute("title", "Recibo pagado");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 2) {
                model.addAttribute("title", "Nota de pago eliminada");
                model.addAttribute("msg", "Cambios guardados correctamente.");

            } else {
                model.addAttribute("title", "Ha ocurrido un error");
                model.addAttribute("msg", "Inténtalo de nuevo más tarde.");
            }
        }

        return "/notas-de-pago/list";
    }

    @RequestMapping(value = "/notas-de-pago/listado", method = RequestMethod.POST)
    public String listadoRecibosPOST (Model model
                                ,@RequestParam(value = "page", defaultValue = "1") Integer page
                                ,@RequestParam(value = "filtroAlumno", required = false, defaultValue = "") Integer filtroAlumno
                                ,@RequestParam(value = "filtroPagado", required = false, defaultValue = "0") Integer filtroPagado
                                ,@RequestParam(value = "filtroFecha", required = false, defaultValue = "") String filtroFecha)
    {

        model.addAttribute("menuItemActive", 4);

        Integer filtroMes = null;
        Integer filtroAnyo = null;

        if (filtroFecha != null && !filtroFecha.equals("")) {
            filtroMes = Integer.valueOf(filtroFecha.split("/")[0]);
            filtroAnyo = Integer.valueOf(filtroFecha.split("/")[1]);
        }

        model.addAttribute("recibos", reciboService.getFiltered(page, filtroPagado, filtroMes, filtroAnyo, filtroAlumno));
        model.addAttribute("alumnos", alumnoService.getAll());
        model.addAttribute("filtroAlumno", filtroAlumno);
        model.addAttribute("filtroPagado", filtroPagado);
        model.addAttribute("filtroFecha", filtroFecha);

        return "/notas-de-pago/list";
    }

    @RequestMapping(value = "/notas-de-pago/pagar", method = RequestMethod.GET)
    public String pagar (Model model,
                         @RequestParam (value = "codRecibo") String codRecibo)
    {

        Recibo recibo = reciboService.getById(codRecibo);
        int result;
        if (recibo != null) {
            recibo.setFechaPago(new Date());
            result = reciboService.actualizarRecibo(recibo);

            if (result == 1) {

                Movimiento mov = new Movimiento();
                mov.setConcepto("Recibo pagado");
                mov.setFecha(new Date());
                mov.setImporte(recibo.getCantidadTotal());
                mov.setDescripción(recibo.getAlumno().getNombreApellidos()
                        + " [" + recibo.getMes().toString() + "/" + recibo.getAnyo() + "]");
                mov.setTipo(Movimiento.INGRESO);

                cajaService.sumarCantidad(recibo.getCantidadTotal());

                movimientosService.save(mov);

                return "redirect:/notas-de-pago/listado?result=1";

            } else {
                return "redirect:/notas-de-pago/listado?result=0";
            }
        }

        return "redirect:/notas-de-pago/listado";
    }

    @RequestMapping(value = "/notas-de-pago/pagar", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<Recibo> pagarPOST (Model model,
                            @RequestParam (value = "cods") List<String> cods)
    {

        RespuestaAjax<Recibo> respuesta = new RespuestaAjax<Recibo>();

        try {

            for (String codRecibo : cods) {
                Recibo recibo = reciboService.getById(codRecibo);
                if (recibo != null && recibo.getFechaPago() == null) {
                        recibo.setFechaPago(new Date());
                        reciboService.actualizarRecibo(recibo);

                        Movimiento mov = new Movimiento();
                        mov.setConcepto("Recibo pagado");
                        mov.setFecha(new Date());
                        mov.setImporte(recibo.getCantidadTotal());
                        mov.setDescripción(recibo.getAlumno().getNombreApellidos()
                            + " [" + recibo.getMes().toString() + "/" + recibo.getAnyo() + "]");
                        mov.setTipo(Movimiento.INGRESO);

                        cajaService.sumarCantidad(recibo.getCantidadTotal());

                        movimientosService.save(mov);
                }
            }

            respuesta.setEstado(true);
            respuesta.setTitulo("Recibos pagados");
            respuesta.setMensaje("Cambios guardados correctamente");
            respuesta.setObj(null);

            return respuesta;

        } catch (Exception e) {

            respuesta.setEstado(false);
            respuesta.setTitulo("Ha ocurrido un error");
            respuesta.setMensaje("Inténtalo de nuevo más tarde");
            respuesta.setObj(null);

            return respuesta;
        }


    }

    @RequestMapping(value = "/notas-de-pago/eliminar", method = RequestMethod.GET)
    public String eliminar (Model model,
                         @RequestParam (value = "codRecibo") String codRecibo)
    {

        Recibo recibo = reciboService.getById(codRecibo);

        if (recibo != null) {
            int result = reciboService.delete(recibo.getCodRecibo());

            if (result == 1) {
                return "redirect:/notas-de-pago/listado?result=2";
            } else {
                return "redirect:/notas-de-pago/listado?result=0";
            }
        }

        return "redirect:/notas-de-pago/listado";
    }

    @RequestMapping(value = "/notas-de-pago/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<Recibo> eliminaPOST (Model model,
                                            @RequestParam (value = "cods") List<String> cods)
    {

        RespuestaAjax<Recibo> respuesta = new RespuestaAjax<>();

        try {

            for (String codRecibo : cods) {
                Recibo recibo = reciboService.getById(codRecibo);
                if (recibo != null) {
                    reciboService.delete(recibo.getCodRecibo());

                }
            }

            respuesta.setEstado(true);
            respuesta.setTitulo("Recibos eliminados");
            respuesta.setMensaje("Cambios guardados correctamente");
            respuesta.setObj(null);

            return respuesta;

        } catch (Exception e) {

            respuesta.setEstado(false);
            respuesta.setTitulo("Ha ocurrido un error");
            respuesta.setMensaje("Inténtalo de nuevo más tarde");
            respuesta.setObj(null);

            return respuesta;
        }


    }

    @RequestMapping(value = "/notas-de-pago/imprimir", method = RequestMethod.GET)
    public String imprimirPOST (Model model,
                               @RequestParam (value = "cods") List<String> cods)
    {

        List<Recibo> recibos = new ArrayList<>();
        for (String codRecibo : cods) {
            Recibo r = reciboService.getById(codRecibo);
            recibos.add(r);
        }

        String[] nombreMeses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        model.addAttribute("nombreMeses", nombreMeses);

        model.addAttribute("recibos", recibos);

        return "/notas-de-pago/imprimir";
    }

    @RequestMapping(value = "/notas-de-pago/editar", method = RequestMethod.GET)
    public String editar (Model model,
                         @RequestParam (value = "codRecibo") String codRecibo)
    {

        Recibo recibo = reciboService.getById(codRecibo);

        String[] nombreMeses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        model.addAttribute("nombreMeses", nombreMeses);

        model.addAttribute("recibo", recibo);

        return "/notas-de-pago/edit";
    }

    @RequestMapping(value = "/notas-de-pago/editar-entrada", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<EntradaRecibo> editarEntrada (Model model
                            ,@RequestParam (value = "codRecibo") String codRecibo
                            ,@RequestParam (value = "idEntrada") Integer idEntrada
                            ,@RequestParam (value = "concepto") String concepto
                            ,@RequestParam (value = "descuento") String descuento
                            ,@RequestParam (value = "cantidad") Float cantidad)
    {

        RespuestaAjax<EntradaRecibo> res = new RespuestaAjax<>();
        EntradaRecibo er;

        if (idEntrada != null) {
            er = reciboService.getEntradaReciboPorId(idEntrada);
        } else {
            er = new EntradaRecibo();
            er.setCodRecibo(codRecibo);
        }


        if (descuento != null && !descuento.equals("")) {

            if ((descuento.contains("%") && descuento.contains("€")) || (!descuento.contains("%") && !descuento.contains("€"))) {
                res.setEstado(false);
                res.setTitulo("Error en el descuento");
                res.setMensaje("Formato de descuento incorrecto.");
                res.setObj(null);

                return res;
            } else if (descuento.contains("%")) {
                er.setTipoDescuento("porcentual");
            } else if (descuento.contains("€")) {
                er.setTipoDescuento("cantidad");
            }

            try {
                er.setDescuento(Float.parseFloat(descuento.replace("€", "").replace("%", "").replace(",", ".").trim()));
            } catch (NumberFormatException e) {
                res.setEstado(false);
                res.setTitulo("Error en el descuento");
                res.setMensaje("Formato de descuento incorrecto.");
                res.setObj(null);

                return res;
            }
        } else {
            er.setDescuento(null);
            er.setTipoDescuento(null);
        }


        er.setConcepto(concepto);
        er.setCantidad(cantidad);

        int result = reciboService.guardarEntradaRecibo(er);
        int result2 = reciboService.actualizarImporteTotal(er.getCodRecibo());

        if (result == 1 && result2 == 1) {
            res.setObj(er);
            res.setMensaje("Cambios guardados correctamente");
            res.setTitulo(idEntrada != null ? "Entrada modificada" : "Entrada añadida");
            res.setEstado(true);
        } else {
            res.setObj(null);
            res.setTitulo(idEntrada != null ?  "Error al modificar la entrada" : "Error al añadir la entrada");
            res.setMensaje("Inténtalo de nuevo más tarde");
            res.setEstado(false);
        }

        return res;
    }

    @RequestMapping(value = "/notas-de-pago/eliminar-entrada", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<EntradaRecibo> eliminarEntrada (Model model
            ,@RequestParam (value = "idEntrada") Integer idEntrada)
    {

        RespuestaAjax<EntradaRecibo> res = new RespuestaAjax<>();

        EntradaRecibo er = reciboService.getEntradaReciboPorId(idEntrada);

        int result = reciboService.eliminarEntradaRecibo(idEntrada);
        int result2 = reciboService.actualizarImporteTotal(er.getCodRecibo());

        if (result == 1 && result2 == 1) {
            res.setObj(null);
            res.setMensaje("Cambios guardados correctamente");
            res.setTitulo("Entrada eliminada");
            res.setEstado(true);
        } else {
            res.setObj(null);
            res.setTitulo("Error al eliminar la entrada");
            res.setMensaje("Inténtalo de nuevo más tarde");
            res.setEstado(false);
        }

        return res;
    }
}
