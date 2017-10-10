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
                        <c:when test="${asignatura == null}">
                            Nueva asignatura
                        </c:when>
                        <c:otherwise>
                            Editar asignatura
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
                            <a href="${pageContext.request.contextPath}/asignatura/listado">Listado de asignaturas</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <c:choose>
                            <c:when test="${asignatura == null}">
                                <li>
                                    <span>Nueva asignatura</span>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li>
                                    <span>Editar asignatura</span>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </ul>
                </div>
                <div class="portlet box green">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-user" aria-hidden="true"></i> Información de la asignatura
                        </div>
                    </div>
                    <div class="portlet-body form">
                        <!-- BEGIN FORM-->
                        <form id="datosAsignaturaForm" action="${pageContext.request.contextPath}/asignatura/guardar" class="form-horizontal" method="post">
                            <input type="hidden" name="idAsignatura" value="${asignatura.idAsignatura}"/>
                            <div class="form-body">
                                <h3 class="form-section">Datos básicos</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Nombre</label>
                                            <div class="col-md-9">
                                                <input type="text" name="nombre" class="form-control" value="${asignatura.nombre}">
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-4">Precio</label>
                                            <div class="col-md-8">
                                                <div class="input-group">
                                                    <input name="precio" type="number" step="any" class="form-control" aria-describedby="sizing-addon3" value="${asignatura.precioBruto}">
                                                    <span class="input-group-addon" id="sizing-addon3">€/mes</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3">Profesor</label>
                                            <div class="col-md-9">
                                                <select class="form-control" name="profesor" data-placeholder="Selecciona un profesor..." tabindex="1">
                                                    <c:forEach items="${profesores}" var="profesor">
                                                        <option value="${profesor.idProfesor}" <c:if test="${asignatura.idProfesor eq profesor.idProfesor}">selected</c:if> >${profesor.nombre} ${profesor.apellidos}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="checkbox col-md-9 col-md-offset-3" style="padding: 5px">
                                            <label>
                                                <input type="checkbox" <c:if test="${asignatura.descuento}">checked</c:if> name="descuento"> Descuento VULEBU aplicable a esta asignatura
                                            </label>
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
                $('#datosAsignaturaForm').validate({
                    errorElement: 'span', //default input error message container
                    errorClass: 'help-block', // default input error message class
                    rules: {
                    nombre:     { required: true },
                    precio:     { required: true },
                    profesor:   { required: true }
                    },

                    messages: {
                        nombre:      { required : "Campo obligatorio." },
                        precio:      { required : "Campo obligatorio." },
                        profesor:    { required : "Campo obligatorio." }

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
