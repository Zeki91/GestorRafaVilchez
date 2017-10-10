<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="page-content-wrapper">
            <div class="page-content">
                <!-- BEGIN PAGE TITLE-->
                <h3 class="page-title"> Editar nota de pago </h3>
                <!-- END PAGE TITLE-->
                <!-- BEGIN PAGE BAR -->
                <div class="page-bar">
                    <ul class="page-breadcrumb">
                        <li>
                            <a href="${pageContext.request.contextPath}/dashboard">Inicio</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/notas-de-pago/listado">Listado de notas de pago</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <li>
                            <span> Editar nota de pago </span>
                        </li>

                    </ul>
                </div>
                <div class="portlet box green">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-user" aria-hidden="true"></i> Editar nota de pago
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div class="nota-de-pago edit">
                            <div class="row">
                                <div class="col-xs-3 col-md-3 logo">
                                    <img src="${pageContext.request.contextPath}/assets/img/logo-notas-de-pago.png" alt="Logo">
                                </div>
                                <div class="col-xs-9 col-md-9">
                                    <p class="nombre"><strong>Alumno:</strong> ${recibo.alumno.nombre} ${recibo.alumno.apellidos}</p>
                                    <p class="periodo"><strong>Mes:</strong> ${nombreMeses[recibo.mes]} </p>
                                    <form action="#">
                                        <input type="hidden" id="codRecibo" value="${recibo.codRecibo}">
                                        <table class="table listado-asignaturas">
                                            <thead>
                                            <tr>
                                                <th style="width: 50%">CONCEPTO</th>
                                                <th class="text-center">DESCUENTO</th>
                                                <th class="text-right">PRECIO</th>
                                                <th class="text-center" style="width: 90px;">Acciones</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:set var="cont" value="0"/>
                                            <c:forEach items="${recibo.entradas}" var="entrada" varStatus="status">
                                                <c:set var="cont" value="${status.count}"/>
                                                <tr class="entrada">
                                                    <input class="idEntrada" type="hidden" value="${entrada.id}">

                                                    <td><input class="form-control concepto" type="text" value="${entrada.concepto}" class="form-control"></td>
                                                    <td class="text-center">
                                                        <c:choose>
                                                            <c:when test="${entrada.descuento ne null}">
                                                                <c:choose>
                                                                    <c:when test="${entrada.tipoDescuento eq 'porcentual'}">
                                                                        <input type="text" class="form-control descuento" value="<fmt:formatNumber value="${entrada.descuento/100}" type="percent"/>">
                                                                    </c:when>
                                                                    <c:when test="${entrada.tipoDescuento eq 'cantidad'}">
                                                                        <input type="text" class="form-control descuento" value="<fmt:formatNumber value="${entrada.descuento}" type="currency"/>">
                                                                    </c:when>
                                                                </c:choose>
                                                            </c:when>
                                                            <c:otherwise><input type="text" class="form-control descuento" value=""></c:otherwise>
                                                        </c:choose>
                                                    </td>
                                                    <td class="text-right">
                                                        <div class="input-group">
                                                            <input type="number" step="any" class="form-control cantidad" aria-describedby="sizing-addon1" value="${entrada.cantidad}">
                                                            <span class="input-group-addon" id="sizing-addon1">€</span>
                                                        </div>
                                                    </td>
                                                    <td>
                                                        <a href="#" onclick="guardarEntrada(${entrada.id}, -1); return false;" class="btn default btn-xs dark-stripe">
                                                            <span class="fa fa-check"></span>
                                                        </a>
                                                        <a href="#" onclick="eliminarEntrada(${entrada.id}, -1); return false;" class="btn default btn-xs dark-stripe">
                                                            <span class="fa fa-times"></span>
                                                        </a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            <c:forEach begin="${cont+1}" end="4" varStatus="loop">
                                                <tr class="entrada">
                                                    <input class="idEntrada" type="hidden" value="">
                                                    <input class="cont" type="hidden" value="${loop.index}">
                                                    <td><input type="text" class="form-control concepto" value=""></td>
                                                    <td><input type="text" class="form-control descuento" value=""></td>
                                                    <td>
                                                        <div class="input-group">
                                                            <input type="number" step="any" class="form-control cantidad" aria-describedby="sizing-addon1" value="">
                                                            <span class="input-group-addon" id="sizing-addon1">€</span>
                                                        </div>
                                                    </td>
                                                    <td>
                                                        <a href="#" onclick="guardarEntrada('', ${loop.index}); return false;" class="btn default btn-xs dark-stripe">
                                                            <span class="fa fa-check"></span>
                                                        </a>
                                                        <a href="#" onclick="eliminarEntrada('', ${loop.index}); return false;" class="btn default btn-xs dark-stripe">
                                                            <span class="fa fa-times"></span>
                                                        </a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            <tr>
                                                <td></td>
                                                <td class="text-center bold">TOTAL:</td>
                                                <td class="text-right bold"><input type="number" step="any" class="form-control total" value="${recibo.cantidadTotal}"></td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- END PAGE BAR -->
                <!-- END PAGE HEADER-->
            </div>
        </div>
    </tiles:putAttribute>

    <tiles:putAttribute name="pagescript">
        <script>
            function guardarEntrada(id, cont) {
                if (id != "") {
                    $(".idEntrada").each(function() {
                        if ($(this).val() == id) {
                            var parent = $(this).parent();
                            var concepto = parent.find(".concepto").val();
                            var descuento = parent.find(".descuento").val();
                            var cantidad = parent.find(".cantidad").val();
                            var codRecibo = $("#codRecibo").val();

                            NProgress.start();
                            $.ajax({
                                type: "POST",
                                url: "${pageContext.request.contextPath}/notas-de-pago/editar-entrada",
                                data: {
                                    codRecibo : codRecibo,
                                    idEntrada : id,
                                    concepto : concepto,
                                    descuento : descuento,
                                    cantidad : cantidad
                                },
                                async: false,
                                success: function(datos){
                                    NProgress.done();
                                    if ( datos.estado ) {
                                        showToastr("success", datos.titulo, datos.mensaje);
                                    } else {
                                        showToastr("error", datos.titulo, datos.mensaje);
                                    }

                                },
                                error: function(datos){
                                    NProgress.done();
                                    showToastr("error", "Error al guardar la entrada", "Inténtalo de nuevo más tarde");
                                }

                            });
                        }
                    });
                } else {
                    $(".cont").each(function() {
                        if ($(this).val() == cont) {
                            var parent = $(this).parent();
                            var concepto = parent.find(".concepto").val();
                            var descuento = parent.find(".descuento").val();
                            var cantidad = parent.find(".cantidad").val();
                            var codRecibo = $("#codRecibo").val();

                            NProgress.start();
                            $.ajax({
                                type: "POST",
                                url: "${pageContext.request.contextPath}/notas-de-pago/editar-entrada",
                                data: {
                                    codRecibo : codRecibo,
                                    idEntrada : id,
                                    concepto : concepto,
                                    descuento : descuento,
                                    cantidad : cantidad
                                },
                                async: false,
                                success: function(datos){
                                    NProgress.done();
                                    if ( datos.estado ) {
                                        showToastr("success", datos.titulo, datos.mensaje);
                                    } else {
                                        showToastr("error", datos.titulo, datos.mensaje);
                                    }

                                },
                                error: function(datos){
                                    NProgress.done();
                                    showToastr("error", "Error al guardar la entrada", "Inténtalo de nuevo más tarde");
                                }

                            });
                        }
                    });
                }

            }

            function eliminarEntrada(id, cont) {

                if (id != "") {
                    $(".idEntrada").each(function() {
                        if ($(this).val() == id) {

                            var $this = $(this);

                            NProgress.start();
                            $.ajax({
                                type: "POST",
                                url: "${pageContext.request.contextPath}/notas-de-pago/eliminar-entrada",
                                data: {
                                    idEntrada : id
                                },
                                async: false,
                                success: function(datos){
                                    NProgress.done();
                                    if ( datos.estado ) {
                                        showToastr("success", datos.titulo, datos.mensaje);
                                        var parent = $this.parent();
                                        parent.find(".concepto").val("");
                                        parent.find(".descuento").val("");
                                        parent.find(".cantidad").val("");
                                        $(".cantidad").trigger("input");
                                    } else {
                                        showToastr("error", datos.titulo, datos.mensaje);
                                    }

                                },
                                error: function(datos){
                                    NProgress.done();
                                    showToastr("error", "Error al eliminar la entrada", "Inténtalo de nuevo más tarde");
                                }

                            });
                        }
                    });
                } else {
                    $(".cont").each(function() {
                        if ($(this).val() == cont) {

                            var $this = $(this);

                            NProgress.start();
                            $.ajax({
                                type: "POST",
                                url: "${pageContext.request.contextPath}/notas-de-pago/eliminar-entrada",
                                data: {
                                    idEntrada : id
                                },
                                async: false,
                                success: function(datos){
                                    NProgress.done();
                                    if ( datos.estado ) {
                                        showToastr("success", datos.titulo, datos.mensaje);
                                        var parent = $this.parent();
                                        parent.find(".concepto").val("");
                                        parent.find(".descuento").val("");
                                        parent.find(".cantidad").val("");
                                        $(".cantidad").trigger("input");
                                    } else {
                                        showToastr("error", datos.titulo, datos.mensaje);
                                    }

                                },
                                error: function(datos){
                                    NProgress.done();
                                    showToastr("error", "Error al eliminar la entrada", "Inténtalo de nuevo más tarde");
                                }

                            });
                        }
                    });
                }


            }

            function showToastr (tipo, titulo, mensaje) {
                toastr.options = {
                    "closeButton": true,
                    "debug": false,
                    "positionClass": "toast-top-right",
                    "onclick": null,
                    "showDuration": "1000",
                    "hideDuration": "1000",
                    "timeOut": "5000",
                    "extendedTimeOut": "1000",
                    "showEasing": "swing",
                    "hideEasing": "linear",
                    "showMethod": "fadeIn",
                    "hideMethod": "fadeOut"
                };
                toastr[tipo](mensaje, titulo);
            }

            $(function() {


                $(".cantidad").bind('input', function() {
                    var total = 0;
                    $(".cantidad").each(function() {
                        if ($(this).val() != "") {
                            total += parseFloat($(this).val());
                        }
                    });

                    $(".total").val(total);
                });
            });

        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>