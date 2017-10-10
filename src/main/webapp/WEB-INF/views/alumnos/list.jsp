<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <!-- BEGIN PAGE TITLE-->
                <h3 class="page-title"> Listado de alumnos
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
                            <span>Listado de alumnos</span>
                        </li>
                    </ul>
                </div>

                <div class="portlet box default">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-filter" aria-hidden="true"></i>Filtro</div>
                    </div>
                    <div class="portlet-body form">

                        <form id="filtroAlumnos" action="${pageContext.request.contextPath}/alumno/listado" class="form-horizontal" method="post">
                            <div class="form-body">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Nombre</label>
                                            <div class="col-md-9">
                                                <input type="text" name="filtroNombre" class="form-control" value="${nombreFiltrado}"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Asignatura</label>
                                            <div class="col-md-9">
                                                <select class="form-control" name="filtroAsignatura" tabindex="1">
                                                    <option value="">Todas</option>
                                                    <c:forEach items="${asignaturas}" var="asignatura">
                                                        <option value="${asignatura.idAsignatura}" <c:if test="${asignatura.idAsignatura eq asignaturaFiltrada}">selected</c:if>>${asignatura.nombre}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!--/row-->

                            </div>
                            <div class="form-actions right" style="padding: 8px 15px;">
                                <button type="submit" class="btn default">
                                    <i class="fa fa-filter"></i> Filtrar</button>
                            </div>
                        </form>

                    </div>
                </div>

                <div class="portlet box green lista-alumnos">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-users" aria-hidden="true"></i>Nº de alumnos: ${numAlumnos} </div>
                        <div class="tools" style="color: #fdfdfd">
                            <a href="${pageContext.request.contextPath}/alumno/editar" title="Nuevo alumno"><i class="fa fa-user-plus"></i></a>
                            <a href="#" onclick="eliminar(); return false;" title="Eliminar seleccionados"><i class="fa fa-trash"></i></a>
                            <a href="" class="fullscreen" data-original-title="" title=""> </a>
                        </div>
                    </div>
                    <div class="portlet-body">
                        <div id="sample_2_wrapper" class="dataTables_wrapper no-footer">
                            <div class="row">
                                <div class="col-md-12">
                                    <%--<div class="dt-buttons">
                                        <a class="dt-button buttons-print btn default" style="float: right" href="${pageContext.request.contextPath}/alumno/editar"><i class="fa fa-user-plus" aria-hidden="true"></i> Nuevo</a>
                                    </div>--%>
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                    <tr>
                                        <th style="width: 33%"> Apellidos, Nombre </th>
                                        <th> Asignaturas matriculadas </th>
                                        <th> Acciones </th>
                                        <th class="marcarTodos"><input type="checkbox" name="marcarTodos"/></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${alumnos}" var="alumno">
                                        <tr>
                                            <td class="idAlumno" style="display: none">${alumno.idAlumno}</td>
                                            <td> ${alumno.nombreApellidos} </td>
                                            <td>
                                                <c:forEach items="${alumno.asignaturasMatriculadas}" var="am" varStatus="loop">
                                                    <c:if test="${loop.index > 0}">, </c:if> ${am.asignatura.nombre}
                                                </c:forEach>
                                            </td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/alumno/ver?idAlumno=${alumno.idAlumno}" class="btn default btn-xs dark-stripe">
                                                    <i class="fa fa-eye"></i>
                                                </a>
                                                <a href="${pageContext.request.contextPath}/alumno/editar?idAlumno=${alumno.idAlumno}" class="btn default btn-xs dark-stripe">
                                                    <i class="fa fa-pencil"></i>
                                                </a>
                                                <%--<a href="${pageContext.request.contextPath}/alumno/eliminar?idAlumno=${alumno.idAlumno}" class="btn default btn-xs dark-stripe">
                                                    <i class="fa fa-trash"></i>
                                                </a>--%>
                                            </td>
                                            <td class="marca">
                                                <input type="checkbox" name="marcados[]"/>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                                <%--<div class="row">
                                    <div class="col-md-5 col-sm-12">
                                        <div class="dataTables_info" id="sample_2_info" role="status" aria-live="polite">
                                            Showing 1 to 10 of 43 entries
                                        </div>
                                    </div>
                                    <div class="col-md-7 col-sm-12">
                                        <div class="dataTables_paginate paging_bootstrap_number" id="sample_2_paginate">
                                            <ul class="pagination" style="visibility: visible;">
                                                <li class="prev disabled">
                                                    <a href="#" title="Prev"><i class="fa fa-angle-left"></i></a>
                                                </li>
                                                <li class="active"><a href="#">1</a></li>
                                                <li><a href="#">2</a></li>
                                                <li><a href="#">3</a></li>
                                                <li><a href="#">4</a></li>
                                                <li><a href="#">5</a></li>
                                                <li class="next"><a href="#" title="Next"><i class="fa fa-angle-right"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>--%>
                        </div>
                    </div>
                </div>
                <!-- END PAGE BAR -->
                <!-- END PAGE HEADER-->
            </div>
        </div>
    </tiles:putAttribute>

    <tiles:putAttribute name="pagescript">
        <script type="text/javascript">

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

            function eliminar() {

                var cods = getCodsMarcados();

                console.log(cods.toString());

                NProgress.start();
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/alumno/eliminar",
                    data: {
                        ids : cods.toString()
                    },
                    async: false,
                    success: function(response){
                        NProgress.done();
                        if ( response.estado ) {
                            $('.idAlumno').each(function() {
                                if ($.inArray(parseInt($(this).text()), response.obj) >= 0) {
                                    var $row = $(this).parent();
                                    $row.remove();
                                }
                            });
                            showToastr("success", response.titulo, response.mensaje);
                        } else {
                            if (response.obj != null) {
                                $('.idAlumno').each(function() {
                                    if ($.inArray(parseInt($(this).text()), response.obj) >= 0) {
                                        var $row = $(this).parent();
                                        $row.remove();
                                    }
                                });
                                showToastr("warning", response.titulo, response.mensaje);
                            } else {
                                showToastr("error", response.titulo, response.mensaje);
                            }
                            
                        }
                    },
                    error: function(response){
                        NProgress.done();
                        showToastr("error", "Ha ocurrido un error", "Inténtalo de nuevo más tarde.");
                    }

                });

            }

            function getCodsMarcados() {
                var cods = [];

                $("input[name^='marcados']").each(function() {
                    if ($(this).is(":checked")) {
                        var id = $(this).closest("td").siblings(".idAlumno").text();
                        cods.push(id);
                    }
                });

                return cods;
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
