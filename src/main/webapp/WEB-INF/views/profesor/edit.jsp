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
                        <c:when test="${profesor == null}">
                            Nuevo profesor
                        </c:when>
                        <c:otherwise>
                            Editar profesor
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
                            <a href="${pageContext.request.contextPath}/profesor/listado">Listado de profesores</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <c:choose>
                            <c:when test="${profesor == null}">
                                <li>
                                    <span>Nuevo profesor</span>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li>
                                    <span>Editar profesor</span>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </ul>
                        <%--<div class="page-toolbar">
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-fit-height default dropdown-toggle" data-toggle="dropdown"> Actions
                                    <i class="fa fa-angle-down"></i>
                                </button>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li>
                                        <a href="#">
                                            <i class="icon-bell"></i> Action</a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-shield"></i> Another action</a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-user"></i> Something else here</a>
                                    </li>
                                    <li class="divider"> </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-bag"></i> Separated link</a>
                                    </li>
                                </ul>
                            </div>
                        </div>--%>
                </div>
                <div class="portlet box green">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-graduation-cap" aria-hidden="true"></i> Información del profesor
                        </div>
                    </div>
                    <div class="portlet-body form">
                        <!-- BEGIN FORM-->
                        <form id="datosProfesorForm" action="${pageContext.request.contextPath}/profesor/guardar" class="form-horizontal" method="post">
                            <input type="hidden" name="id" value="${profesor.idProfesor}"/>
                            <div class="form-body">
                                <h3 class="form-section">Datos personales</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Nombre</label>
                                            <div class="col-md-9">
                                                <input type="text" name="nombre" class="form-control" value="${profesor.nombre}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Apellidos</label>
                                            <div class="col-md-9">
                                                <input type="text" name="apellidos" class="form-control" value="${profesor.apellidos}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>
                                <!--/row-->
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Fecha de nacimiento</label>
                                            <div class="col-md-9">
                                                <input name="fechaNacimiento" class="form-control date-picker" size="16" type="text" value="<fmt:formatDate value="${profesor.fechaNacimiento}" pattern="dd/MM/yyyy"/>">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Teléfono</label>
                                            <div class="col-md-9">
                                                <input type="tel" name="telefono" class="form-control" value="${profesor.telefono}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <h3 class="form-section">Datos económicos</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Sueldo bruto</label>
                                            <div class="col-md-9">
                                                <div class="input-group">
                                                    <input name="sueldo" type="number" step="any" class="form-control" aria-describedby="sizing-addon1"  value="${profesor.sueldo}">
                                                    <span class="input-group-addon" id="sizing-addon1">€/h.</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Cuenta bancaria</label>
                                            <div class="col-md-9">
                                                <input type="text" name="cuentaBancaria" class="form-control" value="${profesor.cuentaBancaria}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <!--/row-->

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
        <script>
            $(function() {

                $("input[name='cuentaBancaria']").mask("ES00 0000 0000 0000 0000 0000");

                $('#datosProfesorForm').validate({
                    errorElement: 'span', //default input error message container
                    errorClass: 'help-block', // default input error message class
                    rules: {
                        nombre:             { required: true },
                        apellidos:          { required: true },
                        fechaNacimiento:    { required: true },
                        telefono:           { required: true },
                        sueldo:             { required: true },
                        cuentaBancaria:     { required: true }
                    },

                    messages: {
                        nombre:             { required : "Campo obligatorio." },
                        apellidos:          { required : "Campo obligatorio." },
                        fechaNacimiento:    { required : "Campo obligatorio." },
                        telefono:           { required : "Campo obligatorio." },
                        sueldo:             { required : "Campo obligatorio." },
                        cuentaBancaria:     { required : "Campo obligatorio." }
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
