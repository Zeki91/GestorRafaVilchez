<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <!-- BEGIN PAGE TITLE-->
                <h3 class="page-title"> Listado de notas de pago
                </h3>
                <!-- END PAGE TITLE-->
                <!-- BEGIN PAGE BAR -->
                <div class="page-bar">
                    <ul class="page-breadcrumb">
                        <li>
                            <a href="${pageContext.request.contextPath}/dashboard">Inicio</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <li>
                            <span>Notas de pago</span>
                        </li>
                    </ul>
                </div>

                <div class="portlet box default">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-filter" aria-hidden="true"></i>Filtro
                        </div>
                    </div>
                    <div class="portlet-body form">

                        <form id="frmFilter" action="${pageContext.request.contextPath}/notas-de-pago/listado" class="form-horizontal" method="get">
                            <input type="hidden" name="page" value="${page.page}">
                            <div class="form-body">
                                <div class="row">
                                    <div class="col-md-5">
                                        <div class="form-group">
                                            <label class="control-label col-md-3" for="filtroAlumno">Alumno:</label>
                                            <div class="col-md-9">
                                                <select id="filtroAlumno" name="filtroAlumno" class="form-control select2" data-placeholder="Selecciona un alumno..." data-allow-clear="true">
                                                    <option value=""></option>
                                                    <c:forEach items="${alumnos}" var="alumno">
                                                        <option value="${alumno.idAlumno}" <c:if test="${filtroAlumno eq alumno.idAlumno}">selected</c:if>>${alumno.nombreApellidos}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="form-group">
                                            <label class="control-label col-md-3" for="filtroPagado">Pagado:</label>
                                            <div class="col-md-9">
                                                <select id="filtroPagado" name="filtroPagado" class="form-control">
                                                    <option value="0" <c:if test="${filtroPagado eq 0}">selected</c:if>>Todos</option>
                                                    <option value="1" <c:if test="${filtroPagado eq 1}">selected</c:if>>Pagados</option>
                                                    <option value="2" <c:if test="${filtroPagado eq 2}">selected</c:if>>Pendientes</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <label class="control-label col-md-3" for="filtroFecha">Mes/Año:</label>
                                        <div class="col-md-9">
                                            <div class="input-group input-medium date date-picker" data-date="${filtroFecha}" data-date-format="mm/yyyy" data-date-viewmode="years" data-date-minviewmode="months">
                                                <input id="filtroFecha" name="filtroFecha" type="text" class="form-control" value="${filtroFecha}">
                                                <span class="input-group-btn">
                                                    <button class="btn default" type="button">
                                                        <i class="fa fa-calendar"></i>
                                                    </button>
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!--/row-->

                            </div>
                            <div class="form-actions right" style="padding: 8px 15px;">
                                <button type="button" class="btn default" onclick="submitFrmFilter()">
                                    <i class="fa fa-filter"></i> Filtrar</button>
                            </div>
                        </form>

                    </div>
                </div>

                <div class="portlet box green lista-notas-de-pago">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-clone" aria-hidden="true"></i>Notas de pago emitidas
                        </div>
                        <div class="tools">
                            <a href="#" onclick="pagar(); return false;" data-original-title="Pagar" title="Pagar"><i class="fa fa-check"></i></a>
                            <a href="#" onclick="imprimir(); return false;" data-original-title="Imprimir" title="Imprimir"><i class="fa fa-print"></i></a>
                            <a href="#" onclick="eliminar(); return false;" data-original-title="Eliminar" title="Eliminar"><i class="fa fa-trash"></i></a>
                            <a href="" class="fullscreen" data-original-title="" title=""> </a>
                        </div>
                    </div>
                    <div class="portlet-body clearfix">
                        <div id="sample_2_wrapper" class="dataTables_wrapper no-footer">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                    <tr>
                                        <th> Nº recibo </th>
                                        <th> Alumno </th>
                                        <th> Importe </th>
                                        <th> Mes, Año </th>
                                        <th> Pagado </th>
                                        <th> Editar </th>
                                        <th class="marcarTodos"><input type="checkbox" name="marcarTodos"/></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${page.list}" var="recibo">
                                        <tr>
                                            <td class="codRecibo">${recibo.codRecibo}</td>
                                            <c:choose>
                                                <c:when test="${recibo.alumno.activo}">
                                                    <td><a href="${pageContext.request.contextPath}/alumno/ver?idAlumno=${recibo.alumno.idAlumno}">${recibo.alumno.nombreApellidos}</a></td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td>${recibo.alumno.nombreApellidos}</td>
                                                </c:otherwise>
                                            </c:choose>

                                            <td>${recibo.cantidadTotal} €</td>
                                            <td>${recibo.mesNombre}, ${recibo.anyo}</td>
                                            <td class="fecha-pago">
                                                <c:choose>
                                                    <c:when test="${recibo.fechaPago ne null}">
                                                        <span class="label label-info" style="text-transform: lowercase;"> <fmt:formatDate value="${recibo.fechaPago}" pattern="dd MMM yyyy" /> </span>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <span class="label label-danger"> Pediente </span>
                                                    </c:otherwise>
                                                </c:choose>
                                            </td>
                                            <td>
                                                <%--<a href="${pageContext.request.contextPath}/notas-de-pago/pagar?codRecibo=${recibo.codRecibo}" class="btn default btn-xs dark-stripe">
                                                    <span class="fa fa-check"></span>
                                                </a>
                                                <a href="${pageContext.request.contextPath}/notas-de-pago/eliminar?codRecibo=${recibo.codRecibo}" class="btn default btn-xs dark-stripe">
                                                    <span class="fa fa-trash"></span>
                                                </a>--%>
                                                <a href="${pageContext.request.contextPath}/notas-de-pago/editar?codRecibo=${recibo.codRecibo}" class="btn default btn-xs dark-stripe">
                                                    <span class="fa fa-pencil"></span>
                                                </a>
                                            </td>
                                            <td class="marca">
                                                <input type="checkbox" name="marcados[]"/>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <%@include file="/WEB-INF/views/template/pagination.jsp"%>
                    </div>
                </div>
                <!-- END PAGE BAR -->
                <!-- END PAGE HEADER-->
            </div>
        </div>
        <div class="modal fade" id="imprimir-notas" role="basic" aria-hidden="true" style="display: none;">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        <h4 class="modal-title">Se imprimirán las siguientes notas de pago...</h4>
                    </div>
                    <div class="modal-body">
                        <i class="fa fa-spin fa-circle-o-notch" aria-hidden="true"></i>
                        <span> &nbsp;&nbsp;Cargando... </span>
                    </div>
                    <div class="modal-footer">
                        <a class="btn btn-circle blue" href="#" onclick="imprimirFacturas(); return false;">
                            <i class="fa fa-print"></i> Imprimir como factura(s)
                        </a>
                        <a class="btn btn-circle blue" href="#" onclick="imprimirNotas(); return false;">
                            <i class="fa fa-print"></i> Imprimir
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </tiles:putAttribute>

    <tiles:putAttribute name="pagescript">
        <script>

            function pagar() {

                var cods = getCodsMarcados();

                NProgress.start();
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/notas-de-pago/pagar",
                    data: {
                        cods : cods.toString()
                    },
                    async: false,
                    success: function(datos){

                        $('.codRecibo').each(function() {
                            if ($.inArray($(this).text(), cods) >= 0) {
                                var $fechaPago = $(this).siblings(".fecha-pago").find("span");
                                if ($fechaPago.hasClass("label-danger")) {
                                    $fechaPago.removeClass("label-danger");
                                    $fechaPago.addClass("label-info");
                                    $fechaPago.css("text-transform", "lowercase");
                                    moment.locale("es");
                                    $fechaPago.text(moment().format('DD MMM YYYY'));
                                }
                            }

                            var $checkbox = $(this).siblings(".marca");
                            $checkbox.find("span").removeClass("checked");
                            $checkbox.find("input").prop("checked", false);
                        });

                        NProgress.done();
                        if ( datos.estado ) {
                            showToastr("success", datos.titulo, datos.mensaje);
                        } else {
                            showToastr("error", datos.titulo, datos.mensaje);
                        }
                    },
                    error: function(datos){
                        NProgress.done();
                        showToastr("error", "Ha ocurrido un error", "Inténtalo de nuevo más tarde.");
                    }

                });

            }

            function imprimir() {

                $("#imprimir-notas").modal("show")
                var cods = getCodsMarcados();

                $("#imprimir-notas .modal-body").load("${pageContext.request.contextPath}/notas-de-pago/imprimir?cods="+cods.toString());

            }

            function eliminar() {

                var cods = getCodsMarcados();

                console.log(cods.toString());

                NProgress.start();
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/notas-de-pago/eliminar",
                    data: {
                        cods : cods.toString()
                    },
                    async: false,
                    success: function(datos){

                        $('.codRecibo').each(function() {
                            if ($.inArray($(this).text(), cods) >= 0) {
                                var $row = $(this).parent();
                                $row.remove();
                            }
                        });

                        NProgress.done();
                        if ( datos.estado ) {
                            showToastr("success", datos.titulo, datos.mensaje);
                        } else {
                            showToastr("error", datos.titulo, datos.mensaje);
                        }
                    },
                    error: function(datos){
                        NProgress.done();
                        showToastr("error", "Ha ocurrido un error", "Inténtalo de nuevo más tarde.");
                    }

                });

            }

            function getCodsMarcados() {
                var cods = [];

                $("input[name^='marcados']").each(function() {
                    if ($(this).is(":checked")) {
                        var id = $(this).closest("td").siblings(".codRecibo").text();
                        cods.push(id);
                    }
                });

                return cods;
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
                <c:if test="${title ne null}">
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

                    <c:choose>
                        <c:when test="${fn:contains(title, 'error')}">
                            toastr["error"]("${msg}", "${title}");
                        </c:when>
                        <c:otherwise>
                            toastr["success"]("${msg}", "${title}");
                        </c:otherwise>
                    </c:choose>

                </c:if>
            });

            function imprimirNotas() {
                $('.datos-empresa').hide();
                $('.datos-recibo').hide();
                $('.lista-notas').print({
                    addGlobalStyles : true,
                    //stylesheet : null,
                    rejectWindow : true,
                    noPrintSelector : ".no-print",
                    iframe : true,
                    append : null,
                    prepend : null
                })
            };

            function imprimirFacturas() {
                $('.datos-empresa').show();
                $('.datos-recibo').show();
                $('.lista-notas').print({
                    addGlobalStyles : true,
                    //stylesheet : null,
                    rejectWindow : true,
                    noPrintSelector : ".no-print",
                    iframe : true,
                    append : null,
                    prepend : null
                })
            };

            function paginationPrev() {
                $("#frmFilter input[name='page']").val(parseInt($("#frmFilter input[name='page']").val())-1);
                $("#frmFilter").submit();
            }

            function paginationNext() {
                $("#frmFilter input[name='page']").val(parseInt($("#frmFilter input[name='page']").val())+1);
                $("#frmFilter").submit();
            }

            function paginationGo(page) {
                $("#frmFilter input[name='page']").val(page);
                $("#frmFilter").submit();
            }

            function submitFrmFilter() {
                $("#frmFilter input[name='page']").val(1);
                $("#frmFilter").submit();
            }

            $(function() {

               $(".marcarTodos div").click(function() {
                   $(".marca").each(function() {
                       $(this).find("span").toggleClass("checked");
                       if ( $(this).find("input[name^='marcados']").is(":checked")) {
                           $(this).find("input[name^='marcados']").prop("checked", false);
                       } else {
                           $(this).find("input[name^='marcados']").prop("checked", true);
                       }
                   });
               });
            });
        </script>

    </tiles:putAttribute>
</tiles:insertDefinition>
