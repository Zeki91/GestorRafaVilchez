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
                    ${asignatura.nombre}
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
                        <li>
                            <span>${asignatura.nombre}</span>
                        </li>

                    </ul>
                </div>
                <div class="portlet box green">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-user" aria-hidden="true"></i> Información de la asignatura
                        </div>
                        <div class="actions">
                            <a class="btn default btn-sm" data-toggle="confirmation" data-placement="bottom" data-btn-ok-label="Sí" data-href="javascript:desmatricularAlumnos(${asignatura.idAsignatura})" data-btn-ok-icon="icon-like" data-btn-ok-class="blue" data-btn-cancel-label="No" data-btn-cancel-icon="icon-close" data-btn-cancel-class="btn-danger" data-original-title="¿Estás seguro?">
                                <i class="fa fa-user-times"></i> Desmatricular alumnos </a>
                        </div>
                    </div>
                    <div class="portlet-body form">
                        <!-- BEGIN FORM-->
                        <form id="datosAlumnoForm" action="#" class="form-horizontal">
                            <input type="hidden" name="id" value="${asignatura.idAsignatura}"/>
                            <div class="form-body">
                                <h3 class="form-section">Datos básicos</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Nombre:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${asignatura.nombre}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Precio:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${asignatura.precioBruto} €/mes</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>
                                <!--/row-->
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Profesor:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${asignatura.profesor.nombre} ${asignatura.profesor.apellidos}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="checkbox col-md-9 col-md-offset-3" style="padding: 5px">
                                            <label>
                                                <input type="checkbox" disabled <c:if test="${asignatura.descuento}">checked</c:if> name="descuento"> Descuento VULEBU aplicable a esta asignatura.
                                            </label>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>
                                <!--/row-->

                            </div>
                            <div class="form-actions right">
                                <a href="${pageContext.request.contextPath}/asignatura/editar?idAsignatura=${asignatura.idAsignatura}" class="btn blue">
                                    <i class="fa fa-pencil"></i> Editar
                                </a>
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
                        email:              { required: true },
                        telefono:           { required: true },
                        nif:                { required: true },
                        direccion:          { required: true },
                        cp:                 { required: true },
                        provincia:          { required: true },
                        poblacion:          { required: true }
                    },

                    messages: {
                        nombre:             { required : "Campo obligatorio." },
                        apellidos:          { required : "Campo obligatorio." },
                        fechaNacimiento:    { required : "Campo obligatorio." },
                        telefono:           { required : "Campo obligatorio." },
                        nif:                { required : "Campo obligatorio." },
                        direccion:          { required : "Campo obligatorio." },
                        cp:                 { required : "Campo obligatorio." },
                        provincia:          { required : "Campo obligatorio." },
                        poblacion:          { required : "Campo obligatorio." }

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

    <tiles:putAttribute name="pagescript">
        <script type="text/javascript">

            function desmatricularAlumnos(id) {
                NProgress.start();
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/asignatura/desmatricular-alumnos",
                    data: {
                        idAsignatura: id
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
                        showToastr("error", "Ha ocurrido un error de ajax", "Inténtalo de nuevo más tarde.");
                    }

                });
            }

        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>
