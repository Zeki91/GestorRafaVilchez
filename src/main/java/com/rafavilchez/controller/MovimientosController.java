package com.rafavilchez.controller;

import com.rafavilchez.model.impl.Movimiento;
import com.rafavilchez.services.CajaService;
import com.rafavilchez.services.MovimientosService;
import com.rafavilchez.utils.RespuestaAjax;
import com.rafavilchez.utils.SystemMessage;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@Controller
public class MovimientosController {

    @Autowired
    private MovimientosService movimientosService;

    @Autowired
    private CajaService cajaService;

    @RequestMapping (value = "/movimientos", method = RequestMethod.GET)
    public String movimientos (Model model)
    {

        model.addAttribute("menuItemActive", 5);

        DateTime desde = new DateTime().dayOfMonth().withMinimumValue();
        DateTime hasta = new DateTime().dayOfMonth().withMaximumValue();
        model.addAttribute("cantidadEnCaja", cajaService.getTotal());

        return "/movimientos/list";

    }

    @RequestMapping (value = "/movimientos/listado", method = RequestMethod.GET)
    public String listado(Model model,
                          @RequestParam(value = "desde") String desde
                         ,@RequestParam(value = "hasta") String hasta)
    {

        List<Movimiento> movimientos = movimientosService.selectBetweenDates(desde, hasta);
        float ingresos = 0, gastos = 0;

        for (Movimiento m : movimientos) {
            switch (m.getTipo()) {
                case "I":
                    ingresos += m.getImporte();
                    break;
                case "G":
                    gastos += m.getImporte();
                    break;
            }
        }

        model.addAttribute("movimientos", movimientos);
        model.addAttribute("ingresos", ingresos);
        model.addAttribute("gastos", gastos);

        return "/movimientos/list-details";
    }

    @RequestMapping (value = "/movimientos/nuevo", method = RequestMethod.GET)
    public String nuevoMovimiento (Model model)
    {
        model.addAttribute("menuItemActive", 5);

        return "/movimientos/nuevo";

    }

    @RequestMapping (value = "/movimientos/guardar-movimiento", method = RequestMethod.POST)
    public String anadirMovimiento (Model model
                            ,final RedirectAttributes redirectAttributes
                            ,@RequestParam (value = "id", required = false) Integer id
                            ,@RequestParam (value = "tipo") String tipo
                            ,@RequestParam (value = "concepto") String concepto
                            ,@RequestParam (value = "descripcion", required = false, defaultValue = "") String descripcion
                            ,@RequestParam (value = "fecha") String fecha
                            ,@RequestParam (value = "importe") Float importe)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Movimiento mov;

        if (id == null) {
            mov = new Movimiento();
        } else {
            mov = movimientosService.get(id);
        }

        try {

            mov.setTipo(tipo);
            mov.setConcepto(concepto);
            mov.setDescripción(descripcion);
            mov.setFecha(sdf.parse(fecha));
            mov.setImporte(importe);

            switch (tipo) {
                case "I":
                    cajaService.sumarCantidad(importe);
                    break;
                case "G":
                    cajaService.restarCantidad(importe);
                    break;
            }

            movimientosService.save(mov);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        redirectAttributes.addFlashAttribute("systemMessage", new SystemMessage(SystemMessage.Type.success, "Movimiento guardado", "Cambios realizados correctamente"));

        return "redirect:/movimientos";
    }

    @RequestMapping (value = "/movimientos/cambiar-importe")
    @ResponseBody
    public RespuestaAjax<Float> cambiarImporteCaja (Model model
                                ,@RequestParam (value = "cantidad") float cantidad)
    {
        RespuestaAjax<Float> res = new RespuestaAjax<>();

        cajaService.setImporteTotal(cantidad);

        res.setEstado(true);
        res.setTitulo("Importe en caja modificado");
        res.setMensaje("Cambios guardados correctamente");
        res.setObj(cantidad);

        return res;
    }

}
