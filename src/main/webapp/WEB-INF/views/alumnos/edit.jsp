<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <!-- BEGIN PAGE TITLE-->
                <h3 class="page-title">
                    <c:choose>
                        <c:when test="${alumno == null}">
                            Nuevo alumno
                        </c:when>
                        <c:otherwise>
                            Editar alumno
                        </c:otherwise>
                    </c:choose>
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
                            <a href="${pageContext.request.contextPath}/alumno/listado">Listado de alumnos</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <c:choose>
                            <c:when test="${alumno == null}">
                                <li>
                                    <span>Nuevo alumno</span>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li>
                                    <span>Editar alumno</span>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </ul>
                </div>
                <div class="portlet box green">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-user" aria-hidden="true"></i> Información del alumno
                        </div>
                    </div>
                    <div class="portlet-body form">
                        <!-- BEGIN FORM-->
                        <form id="datosAlumnoForm" action="${pageContext.request.contextPath}/alumno/guardar" class="form-horizontal" method="post">
                            <input type="hidden" name="id" value="${alumno.idAlumno}"/>
                            <input type="hidden" name="oldReferred" value="${descuentoAmigo.referidoPor}"/>
                            <div class="form-body">
                                <h3 class="form-section">Datos básicos</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Nombre</label>
                                            <div class="col-md-9">
                                                <input type="text" name="nombre" class="form-control" value="${alumno.nombre}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Apellidos</label>
                                            <div class="col-md-9">
                                                <input type="text" name="apellidos" class="form-control" value="${alumno.apellidos}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>
                                <!--/row-->
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Teléfono</label>
                                            <div class="col-md-9">
                                                <input type="tel" name="telefono" class="form-control" value="${alumno.telefono}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Email</label>
                                            <div class="col-md-9">
                                                <input type="email" name="email" class="form-control" value="${alumno.email}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <h3 class="form-section">Datos fiscales</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">NIF</label>
                                            <div class="col-md-9">
                                                <input type="text" name="nif" class="form-control" value="${alumno.nif}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Dirección</label>
                                            <div class="col-md-9">
                                                <input type="text" name="direccion" class="form-control" value="${alumno.direccion}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">C.P.</label>
                                            <div class="col-md-9">
                                                <input type="text" name="cp" class="form-control" value="${alumno.cp}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Provincia</label>
                                            <div class="col-md-9">
                                                <input type="text" name="provincia" class="form-control" value="${alumno.provincia}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Población</label>
                                            <div class="col-md-9">
                                                <input type="text" name="poblacion" class="form-control" value="${alumno.poblacion}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="checkbox col-md-9 col-md-offset-3" style="padding: 5px">
                                            <label>
                                                <input type="checkbox" <c:if test="${alumno.rrss}">checked</c:if> name="rrss"> Sigue a la academia en redes sociales.
                                            </label>
                                            <label style="margin-top: 10px">
                                                <input type="checkbox" <c:if test="${alumno.vulebu}">checked</c:if> name="vulebu"> Está registrado en la aplicación VuleBú
                                            </label>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>
                                <%--<h3 class="form-section">Descuento AMIGO</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Referido por</label>
                                            <div class="col-md-9">
                                                <select class="form-control" name="referred" tabindex="1">
                                                    <option value="" <c:if test="${descuentoAmigo eq null}">selected</c:if>>Nadie</option>
                                                    <c:forEach items="${restoAlumnos}" var="a">
                                                        <option value="${a.idAlumno}" <c:if test="${descuentoAmigo ne null && a.idAlumno eq descuentoAmigo.referidoPor}">selected</c:if> >${a.nombre} ${a.apellidos}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>--%>
                            </div>
                            <div class="form-actions right">
                                <button type="button" class="btn default" onclick="javascript:history.back();">Cancelar</button>
                                <button type="submit" class="btn blue">
                                    <i class="fa fa-check"></i> Guardar</button>
                            </div>
                        </form>
                        <!-- END FORM-->
                    </div>
                </div>
                <!-- END PAGE BAR -->
                <!-- END PAGE HEADER-->
            </div>
        </div>
    </tiles:putAttribute>

    <tiles:putAttribute name="pagescript">

        <script src="${pageContext.request.contextPath}/assets/plugins/pselect.js" type="text/javascript"></script>

        <script>
            $(function() {
                $('#datosAlumnoForm').validate({
                    errorElement: 'span', //default input error message container
                    errorClass: 'help-block', // default input error message class
                    rules: {
                        nombre:             { required: true },
                        apellidos:          { required: true },
                        telefono:           { required: true }
                    },

                    messages: {
                        nombre:             { required : "Campo obligatorio." },
                        apellidos:          { required : "Campo obligatorio." },
                        telefono:           { required : "Campo obligatorio." }

                    },

                    highlight: function (element) { // hightlight error inputs
                        $(element)
                                .closest('.form-group').addClass('has-error'); // set error class to the control group
                    },

                    success: function (label) {
                        label.closest('.form-group').removeClass('has-error');
                        label.remove();
                    },

                    errorPlacement: function (error, element) {
                        if(element.closest('.form-control').parents('.input-group').length) {
                            error.insertAfter(element.closest('.input-group'));
                        } else {
                            error.insertAfter(element.closest('.form-control'));
                        }
                    },

                    submitHandler: function (form) {
                        form.submit(); // form validation success, call ajax form submit
                    }
                });
            })
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>
