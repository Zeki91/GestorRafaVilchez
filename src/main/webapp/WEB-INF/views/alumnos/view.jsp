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
                <h3 class="page-title">
                    Perfil de: ${alumno.nombre} ${alumno.apellidos}
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
                        <li>
                            <span>${alumno.nombre} ${alumno.apellidos}</span>
                        </li>

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
                        <form id="datosAlumnoForm" action="#" class="form-horizontal">
                            <input type="hidden" name="id" value="${alumno.idAlumno}"/>
                            <div class="form-body">
                                <h3 class="form-section">Datos básicos</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Nombre:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.nombre}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Apellidos:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.apellidos}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>
                                <!--/row-->
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Teléfono:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.telefono}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Email:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.email}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <h3 class="form-section">Datos fiscales</h3>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">NIF:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.nif}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Dirección:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.direccion}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">C.P.:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.cp}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Provincia: </label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.provincia}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                </div>

                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label col-md-3 bold">Población:</label>
                                            <div class="col-md-9">
                                                <p class="form-control-static">${alumno.poblacion}</p>
                                            </div>
                                        </div>
                                    </div>
                                    <!--/span-->
                                    <div class="col-md-6">
                                        <div class="checkbox col-md-9 col-md-offset-3" style="padding: 5px">
                                            <label>
                                                <input type="checkbox" disabled <c:if test="${alumno.rrss}">checked</c:if> name="rrss"> Sigue a la academia en redes sociales.
                                            </label>
                                            <label style="margin-top: 10px">
                                                <input type="checkbox" disabled <c:if test="${alumno.vulebu}">checked</c:if> name="vulebu"> Está registrado en la aplicación VuleBú
                                            </label>
                                        </div>
                                    </div>
                                </div>

                                <!--/row-->

                            </div>
                            <div class="form-actions right">
                                <a href="${pageContext.request.contextPath}/alumno/editar?idAlumno=${alumno.idAlumno}" class="btn blue">
                                    <i class="fa fa-pencil"></i> Editar
                                </a>
                            </div>
                        </form>
                        <!-- END FORM-->
                    </div>
                </div>
                <div class="tabbable-custom ">
                    <ul class="nav nav-tabs ">
                        <li class="active">
                            <a href="#tabAsignaturas" data-toggle="tab" aria-expanded="true"> Asignaturas matriculadas </a>
                        </li>
                        <li>
                            <a href="#tabDescuentos" data-toggle="tab" aria-expanded="true"> Descuentos extra </a>
                        </li>
                        <li>
                            <a href="#tabHorasExtra" data-toggle="tab" aria-expanded="true"> Horas extra </a>
                        </li>
                        <li>
                            <a href="#tabRecibos" data-toggle="tab" aria-expanded="true"> Recibos </a>
                        </li>
                        <li>
                            <a href="#tabHistorico" data-toggle="tab" aria-expanded="true"> Histórico de asignaturas </a>
                        </li>
                    </ul>
                    <div class="tab-content">

                        <div class="tab-pane active" id="tabAsignaturas" name="tabAsignaturas">
                            <c:choose>
                                <c:when test="${fn:length(alumno.asignaturasMatriculadas) eq 0}">
                                        <p><i class="fa fa-warning"></i> El alumno no está matriculado en ninguna asignatura.</p>
                                </c:when>
                                <c:otherwise>
                                    <div class="table-responsive">
                                        <table class="table table-condensed">
                                            <thead>
                                            <tr>
                                                <th> Nombre </th>
                                                <th> Precio bruto </th>
                                                <th> Descuento </th>
                                                <th> Precio neto </th>
                                                <th> Fecha de inicio </th>
                                                <%--<th> Observaciones </th>--%>
                                                <th> Acciones </th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${alumno.asignaturasMatriculadas}" var="asignaturaMatriculada">
                                                <tr id="am-${asignaturaMatriculada.id}">
                                                    <td> ${asignaturaMatriculada.asignatura.nombre} </td>
                                                    <td> ${asignaturaMatriculada.asignatura.precioBruto} €/mes </td>
                                                    <c:set var="tieneDescuento" value="false" />
                                                    <c:forEach items="${alumno.descuentos}" var="descuento">
                                                        <c:if test="${descuento.idAsignatura eq asignaturaMatriculada.idAsignatura}">
                                                            <c:set var="tieneDescuento" value="true" />
                                                            <c:choose>
                                                                <c:when test="${descuento.cantidad ne null}">
                                                                    <td>${descuento.cantidad} €</td>
                                                                    <c:choose>
                                                                        <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.importeEditado} €/mes</td>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <c:set var="precioNeto" value="${asignaturaMatriculada.asignatura.precioBruto - descuento.cantidad}" />
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${precioNeto} €/mes</td>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <td>${descuento.porcentaje} %</td>
                                                                    <c:choose>
                                                                        <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.importeEditado} €/mes</td>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <c:set var="precioNeto" value="${asignaturaMatriculada.asignatura.precioBruto - (asignaturaMatriculada.asignatura.precioBruto * (descuento.porcentaje/100))}" />
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${precioNeto} €/mes</td>
                                                                        </c:otherwise>
                                                                    </c:choose>

                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:if>
                                                    </c:forEach>
                                                    <c:if test="${not tieneDescuento}">
                                                        <td> - </td>
                                                        <c:choose>
                                                            <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                <td class="editado" id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.importeEditado} €/mes</td>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <td class="no-editado" id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.asignatura.precioBruto} €/mes</td>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </c:if>
                                                    <td id="fechaInicio-${asignaturaMatriculada.id}"> <fmt:formatDate value="${asignaturaMatriculada.fecha_inicio}" pattern="dd/MM/yyyy" /> </td>
                                                    <%--<td> - </td>--%>
                                                    <td>
                                                       <%-- <a href="${pageContext.request.contextPath}/asignatura/ver?idAsignatura=${asignaturaMatriculada.asignatura.idAsignatura}" class="btn default btn-xs dark-stripe">
                                                            Ver
                                                        </a>--%>
                                                        <a href="#" onclick="mostrarEdicionAsignatura(${asignaturaMatriculada.id}); return false;" class="btn default btn-xs dark-stripe">
                                                            Editar
                                                        </a>
                                                        <a href="" class="btn default btn-xs dark-stripe" data-toggle="confirmation" data-placement="top" data-btn-ok-label="Sí" data-href="${pageContext.request.contextPath}/alumno/desmatricular-asignatura?idAsignatura=${asignaturaMatriculada.asignatura.idAsignatura}&idAlumno=${alumno.idAlumno}" data-btn-ok-icon="icon-like" data-btn-ok-class="blue" data-btn-cancel-label="No" data-btn-cancel-icon="icon-close" data-btn-cancel-class="btn-danger" data-original-title="¿Estás seguro?" title="">
                                                            Desmatricular
                                                        </a>
                                                    </td>
                                                </tr>

                                                <form action="#">

                                                </form>
                                                <tr id="am-editar-${asignaturaMatriculada.id}" style="display: none">
                                                    <td> ${asignaturaMatriculada.asignatura.nombre} </td>
                                                    <td> ${asignaturaMatriculada.asignatura.precioBruto} €/mes </td>
                                                    <c:set var="tieneDescuento" value="false" />
                                                    <c:forEach items="${alumno.descuentos}" var="descuento">
                                                        <c:if test="${descuento.idAsignatura eq asignaturaMatriculada.idAsignatura}">
                                                            <c:set var="tieneDescuento" value="true" />
                                                            <c:choose>
                                                                <c:when test="${descuento.cantidad ne null}">
                                                                    <td>${descuento.cantidad} €</td>
                                                                    <c:choose>
                                                                        <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                            <td style="width: 12%;">
                                                                                <input id="nuevoPrecioNeto-${asignaturaMatriculada.id}" type="number" step="any" name="nuevoPrecioNeto" class="form-control" style="height: 28px" value="${asignaturaMatriculada.importeEditado}">
                                                                            </td>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <<c:set var="precioNeto" value="${asignaturaMatriculada.asignatura.precioBruto - descuento.cantidad}" />
                                                                            <td style="width: 12%;">
                                                                                <input id="nuevoPrecioNeto-${asignaturaMatriculada.id}" type="number" step="any" name="nuevoPrecioNeto" class="form-control" style="height: 28px" value="${precioNeto}">
                                                                            </td>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <td>${descuento.porcentaje} %</td>
                                                                    <c:choose>
                                                                        <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                            <td style="width: 12%;">
                                                                                <input id="nuevoPrecioNeto-${asignaturaMatriculada.id}" type="number" step="any" name="nuevoPrecioNeto" class="form-control" style="height: 28px" value="${asignaturaMatriculada.importeEditado}">
                                                                            </td>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <c:set var="precioNeto" value="${asignaturaMatriculada.asignatura.precioBruto - (asignaturaMatriculada.asignatura.precioBruto * (descuento.porcentaje/100))}" />
                                                                            <td style="width: 12%;">
                                                                                <input id="nuevoPrecioNeto-${asignaturaMatriculada.id}" type="number" step="any" name="nuevoPrecioNeto" class="form-control" style="height: 28px" value="${precioNeto}">
                                                                            </td>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:if>
                                                    </c:forEach>
                                                    <c:if test="${not tieneDescuento}">
                                                        <td> - </td>
                                                        <c:choose>
                                                            <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                <td style="width: 12%;">
                                                                    <input id="nuevoPrecioNeto-${asignaturaMatriculada.id}" type="number" step="any" name="nuevoPrecioNeto" class="form-control" style="height: 28px" value="${asignaturaMatriculada.importeEditado}">
                                                                </td>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <td style="width: 12%;">
                                                                    <input id="nuevoPrecioNeto-${asignaturaMatriculada.id}" type="number" step="any" name="nuevoPrecioNeto" class="form-control" style="height: 28px" value="${asignaturaMatriculada.asignatura.precioBruto}">
                                                                </td>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </c:if>
                                                    <td style="width: 14%">
                                                        <div class="form-group">
                                                            <input id="nuevaFechaInicio-${asignaturaMatriculada.id}" name="nuevaFechaInicio" class="form-control date-picker" style="height: 28px" size="16" type="text" value="<fmt:formatDate value="${asignaturaMatriculada.fecha_inicio}" pattern="dd/MM/yyyy"/>">
                                                        </div>

                                                    </td>
                                                    <td>
                                                        <a href="#" onclick="ocultarEdicionAsignatura(${asignaturaMatriculada.id}); return false;" class="btn default btn-xs dark-stripe red">
                                                            Cancelar
                                                        </a>
                                                        <a href="#" onclick="guardarEdicion(${asignaturaMatriculada.id}); return false;" class="btn default btn-xs dark-stripe green">
                                                            Guardar
                                                        </a>
                                                    </td>
                                                </tr>
                                            </c:forEach>

                                            </tbody>
                                        </table>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                            <p style="text-align: right">
                                <a class="btn blue sbold" data-toggle="modal" href="#nuevaAsignatura"> Matricular asignatura </a>
                            </p>
                        </div>

                        <div class="tab-pane" id="tabDescuentos" name="tabDescuentos">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                    <tr>
                                        <th> Nombre </th>
                                        <th> Descuento </th>
                                        <th> Activo</th>
                                        <th> Acciones </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:if test="${descuentosExtra ne null}">
                                            <c:forEach items="${descuentosExtra}" var="d">
                                                <tr>
                                                    <td>${d.descuento.nombre}</td>
                                                    <td>
                                                        <c:choose>
                                                            <c:when test="${d.cantidad ne null}">
                                                                ${d.cantidad} €/mes
                                                            </c:when>
                                                            <c:otherwise>
                                                                ${d.porcentaje} %/mes
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </td>
                                                    <td>
                                                        <c:choose>
                                                            <c:when test="${d.activo}">
                                                                Sí
                                                            </c:when>
                                                            <c:otherwise>
                                                                No
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </td>
                                                    <td>
                                                        <a href="" class="btn default btn-xs dark-stripe" data-toggle="confirmation" data-placement="top" data-btn-ok-label="Sí" data-href="${pageContext.request.contextPath}/alumno/eliminar-descuento?id=${d.id}&idAlumno=${alumno.idAlumno}" data-btn-ok-icon="icon-like" data-btn-ok-class="btn-success" data-btn-cancel-label="No" data-btn-cancel-icon="icon-close" data-btn-cancel-class="btn-danger" data-original-title="¿Estás seguro?" title="">
                                                            Eliminar
                                                        </a>
                                                            <%--<button class="btn red-mint">Action confirmation!</button>--%>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                        </c:if>
                                     </tbody>
                                </table>
                            </div>
                            <p style="text-align: right">
                                <a class="btn blue sbold" data-toggle="modal" href="#nuevoDescuento"> Descuento extra </a>
                            </p>
                        </div>

                        <div class="tab-pane" id="tabHorasExtra" name="tabHorasExtra">
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                    <tr>
                                        <th> Asignatura </th>
                                        <th> Nº de horas </th>
                                        <th> Precio </th>
                                        <th> Mes </th>
                                        <th> Año </th>
                                        <th> Acciones </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:if test="${horasExtra ne null}">
                                        <c:forEach items="${horasExtra}" var="he">
                                            <tr>
                                                <td>${he.asignatura.nombre}</td>
                                                <td>${he.numHoras}</td>
                                                <td>${he.precio} €/hora</td>
                                                <td>
                                                    <c:choose>
                                                        <c:when test="${he.mes eq 1}"> Enero </c:when>
                                                        <c:when test="${he.mes eq 2}"> Febrero </c:when>
                                                        <c:when test="${he.mes eq 3}"> Marzo </c:when>
                                                        <c:when test="${he.mes eq 4}"> Abril </c:when>
                                                        <c:when test="${he.mes eq 5}"> Mayo </c:when>
                                                        <c:when test="${he.mes eq 6}"> Junio </c:when>
                                                        <c:when test="${he.mes eq 7}"> Julio </c:when>
                                                        <c:when test="${he.mes eq 8}"> Agosto </c:when>
                                                        <c:when test="${he.mes eq 9}"> Septiembre </c:when>
                                                        <c:when test="${he.mes eq 10}"> Octubre </c:when>
                                                        <c:when test="${he.mes eq 11}"> Noviembre </c:when>
                                                        <c:when test="${he.mes eq 12}"> Diciembre </c:when>
                                                    </c:choose>
                                                </td>
                                                <td> ${he.anyo} </td>
                                                <td>
                                                    <a href="" class="btn default btn-xs dark-stripe" data-toggle="confirmation" data-placement="top" data-btn-ok-label="Sí" data-href="${pageContext.request.contextPath}/alumno/eliminar-horas-extra?id=${he.id}&idAlumno=${alumno.idAlumno}" data-btn-ok-icon="icon-like" data-btn-ok-class="btn-success" data-btn-cancel-label="No" data-btn-cancel-icon="icon-close" data-btn-cancel-class="btn-danger" data-original-title="¿Estás seguro?" title="">
                                                        Eliminar
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </c:if>
                                    </tbody>
                                </table>
                            </div>
                            <p style="text-align: right">
                                <a class="btn blue sbold" data-toggle="modal" href="#anadirHorasExtra"> Añadir horas extra </a>
                            </p>
                        </div>

                        <div class="tab-pane" id="tabRecibos" name="tabRecibos">
                            <c:choose>
                                <c:when test="${fn:length(recibos) eq 0}">
                                    <p><i class="fa fa-warning"></i> El alumno no tiene aún ningún recibo emitido.</p>
                                </c:when>
                                <c:otherwise>
                                    <div class="table-responsive">
                                        <table class="table table-condensed">
                                            <thead>
                                            <tr>
                                                <th> Nº de recibo </th>
                                                <th> Fecha de emisión </th>
                                                <th> Asignatura </th>
                                                <th> Descuento </th>
                                                <th> Precio neto </th>
                                                <th> Fecha de pago </th>
                                                <%--<th> Observaciones </th>--%>
                                                <th> Acciones </th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${recibos}" var="recibo">
                                                <c:forEach items="${recibo.entradas}" var="entrada">
                                                    <tr>
                                                        <td> ${entrada.codRecibo} </td>
                                                        <td> <fmt:formatDate value="${recibo.fechaEmision}" pattern="dd/MM/yyyy" /> </td>
                                                        <td> ${entrada.concepto} </td>
                                                        <td>
                                                            <c:choose>
                                                                <c:when test="${entrada.tipoDescuento eq 'cantidad'}">
                                                                    <fmt:formatNumber value="${entrada.descuento}" type="currency"/>
                                                                </c:when>
                                                                <c:when test="${entrada.tipoDescuento eq 'porcentual'}">
                                                                    <fmt:formatNumber value="${entrada.descuento/100}" type="percent"/>
                                                                </c:when>
                                                                <c:otherwise> -  </c:otherwise>
                                                            </c:choose>
                                                        </td>
                                                        <td> <fmt:formatNumber value="${entrada.cantidad}" type="currency"/> </td>
                                                        <td>
                                                            <c:choose>
                                                                <c:when test="${recibo.fechaPago ne null}">
                                                                    <fmt:formatDate value="${recibo.fechaPago}" pattern="dd/MM/yyyy" />
                                                                </c:when>
                                                                <c:otherwise> - </c:otherwise>
                                                            </c:choose>
                                                        </td>
                                                        <%--<td> - </td>--%>
                                                        <td>

                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </c:forEach>

                                            </tbody>
                                        </table>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </div>

                        <div class="tab-pane" id="tabHistorico" name="tabHistorico">
                            <c:choose>
                                <c:when test="${fn:length(alumno.historicoAsignaturas) eq 0}">
                                    <p><i class="fa fa-warning"></i> El alumno no se ha desmatriculado aún de ninguna asignatura.</p>
                                </c:when>
                                <c:otherwise>
                                    <div class="table-responsive">
                                        <table class="table table-condensed">
                                            <thead>
                                            <tr>
                                                <th> Nombre </th>
                                                <th> Precio bruto </th>
                                                <th> Descuento </th>
                                                <th> Precio neto </th>
                                                <th> Fecha de inicio </th>
                                                <th> Fecha de fin </th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${alumno.historicoAsignaturas}" var="asignaturaMatriculada">
                                                <tr>
                                                    <td> ${asignaturaMatriculada.asignatura.nombre} </td>
                                                    <td> ${asignaturaMatriculada.asignatura.precioBruto} €/mes </td>
                                                    <c:set var="tieneDescuento" value="false" />
                                                    <c:forEach items="${alumno.descuentos}" var="descuento">
                                                        <c:if test="${descuento.idAsignatura eq asignaturaMatriculada.idAsignatura}">
                                                            <c:set var="tieneDescuento" value="true" />
                                                            <c:choose>
                                                                <c:when test="${descuento.cantidad ne null}">
                                                                    <td>${descuento.cantidad} €</td>
                                                                    <c:choose>
                                                                        <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.importeEditado} €/mes</td>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <c:set var="precioNeto" value="${asignaturaMatriculada.asignatura.precioBruto - descuento.cantidad}" />
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${precioNeto} €/mes</td>
                                                                        </c:otherwise>
                                                                    </c:choose>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <td>${descuento.porcentaje} %</td>
                                                                    <c:choose>
                                                                        <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.importeEditado} €/mes</td>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <c:set var="precioNeto" value="${asignaturaMatriculada.asignatura.precioBruto - (asignaturaMatriculada.asignatura.precioBruto * (descuento.porcentaje/100))}" />
                                                                            <td id="precioNeto-${asignaturaMatriculada.id}">${precioNeto} €/mes</td>
                                                                        </c:otherwise>
                                                                    </c:choose>

                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:if>
                                                    </c:forEach>
                                                    <c:if test="${not tieneDescuento}">
                                                        <td> - </td>
                                                        <c:choose>
                                                            <c:when test="${asignaturaMatriculada.importeEditado ne null}">
                                                                <td class="editado" id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.importeEditado} €/mes</td>
                                                            </c:when>
                                                            <c:otherwise>
                                                                <td class="no-editado" id="precioNeto-${asignaturaMatriculada.id}">${asignaturaMatriculada.asignatura.precioBruto} €/mes</td>
                                                            </c:otherwise>
                                                        </c:choose>
                                                    </c:if>
                                                    <td> <fmt:formatDate value="${asignaturaMatriculada.fecha_inicio}" pattern="dd/MM/yyyy" /> </td>
                                                    <td> <fmt:formatDate value="${asignaturaMatriculada.fecha_fin}" pattern="dd/MM/yyyy" /> </td>
                                                </tr>
                                            </c:forEach>

                                            </tbody>
                                        </table>
                                    </div>
                                </c:otherwise>
                            </c:choose>
                            <p style="text-align: right">
                                <a class="btn blue sbold" data-toggle="modal" href="#nuevaAsignatura"> Matricular asignatura </a>
                            </p>
                        </div>

                    </div>
                </div>

                <%-- Modal para matricular asignaturas --%>
                <div class="modal fade" id="nuevaAsignatura" tabindex="-1" role="basic" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                <h4 class="modal-title">Matricular a ${alumno.nombre} en:</h4>
                            </div>
                            <div class="modal-body">
                                <form id="frmMatricularAsignatura" action="${pageContext.request.contextPath}/alumno/matricular-asignatura" method="post">
                                    <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
                                    <div class="form-body">
                                        <div class="row">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3 text-right" style="padding-top: 7px">Asignatura:</label>
                                                    <div class="col-md-9">
                                                        <select class="form-control" name="idAsignatura" data-placeholder="Selecciona una asignatura..." tabindex="1">
                                                            <c:forEach items="${asignaturas}" var="asignatura">
                                                                <option value="${asignatura.idAsignatura}">${asignatura.nombre}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row" style="margin-top: 15px;">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-3 text-right" style="padding-top: 7px">Descuento:</label>
                                                    <div class="col-md-9">
                                                        <div class="input-group">
                                                            <input name="descuento" type="number" step="any" class="form-control" aria-describedby="sizing-addon2">
                                                            <span class="input-group-addon" id="sizing-addon2">%</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <!--/span-->
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn grey-salsa btn-outline" data-dismiss="modal">Cancelar</button>
                                <button id="guardarAsignatura" type="button" class="btn blue"><i class="fa fa-check"></i> Matricular</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>

                <%-- Modal para introducir descuentos --%>
                <div class="modal fade" id="nuevoDescuento" tabindex="-1" role="basic" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                <h4 class="modal-title">Añadir descuento a ${alumno.nombre}:</h4>
                            </div>
                            <div class="modal-body">
                                <form id="frmAnadirDescuento" action="${pageContext.request.contextPath}/alumno/anadir-descuento" method="post">
                                    <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
                                    <div class="form-body">
                                        <div class="row" style="margin-bottom: 15px">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-5 text-right" style="padding-top: 7px">Tipo de descuento</label>
                                                    <div class="col-md-7">
                                                        <select class="form-control" name="idDescuento" data-placeholder="Selecciona una descuento..." tabindex="1">
                                                            <option value="1">Descuento AMIGO</option>
                                                            <option value="4">Descuento extra</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div id="opcionesDescuentoExtra" style="display: none">
                                            <div class="row" style="margin-bottom: 15px">
                                                <div class="col-md-9">
                                                    <div class="form-group">
                                                        <label class="control-label col-md-5 text-right">Cantidad</label>
                                                        <div class="col-md-7">
                                                            <div class="input-group">
                                                                <input name="cantidadDescuento" type="number" step="any" class="form-control" aria-describedby="sizing-addon1">
                                                                <span class="input-group-addon" id="sizing-addon1">(€ ó %)/mes</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-9">
                                                    <div class="form-group">
                                                        <label class="control-label col-md-5 text-right" style="padding-top: 7px">Tipo</label>
                                                        <div class="col-md-7">
                                                            <select class="form-control" name="tipoDescuento" data-placeholder="Selecciona un tipo de descuento" tabindex="1">
                                                                <option value="1">Porcentaje al mes</option>
                                                                <option value="2">Cantidad fija al mes</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn grey-salsa btn-outline" data-dismiss="modal">Cancelar</button>
                                <button id="guardarDescuento" type="button" class="btn blue"><i class="fa fa-check"></i> Añadir</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>

                <%-- Modal para registrar horas extra --%>
                <div class="modal fade" id="anadirHorasExtra" tabindex="-1" role="basic" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                <h4 class="modal-title">Añadir horas extra a ${alumno.nombre}:</h4>
                            </div>
                            <div class="modal-body">
                                <form id="frmHorasExtra" action="${pageContext.request.contextPath}/alumno/anadir-horas-extra" method="post">
                                    <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
                                    <div class="form-body">
                                        <div class="row" style="margin-bottom: 15px">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 text-right" style="padding-top: 7px">Asignatura</label>
                                                    <div class="col-md-8">
                                                        <select class="form-control" name="idAsignatura" data-placeholder="Selecciona una asignatura..." tabindex="1">
                                                            <c:forEach items="${asignaturas}" var="asignatura">
                                                                <option value="${asignatura.idAsignatura}">${asignatura.nombre}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row" style="margin-bottom: 15px">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 text-right">Precio</label>
                                                    <div class="col-md-8">
                                                        <div class="input-group">
                                                            <input name="precio" type="number" step="any" class="form-control" aria-describedby="sizing-addon3">
                                                            <span class="input-group-addon" id="sizing-addon3">€/h.</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row" style="margin-bottom: 15px">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 text-right">Nº de horas</label>
                                                    <div class="col-md-8">
                                                        <div class="input-group">
                                                            <input name="numHoras" type="number" step="any" class="form-control" aria-describedby="sizing-addon4">
                                                            <span class="input-group-addon" id="sizing-addon4">h.</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row" style="margin-bottom: 15px">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 text-right">Mes</label>
                                                    <div class="col-md-8">
                                                        <select class="form-control" name="mes" data-placeholder="Selecciona un mes" tabindex="1">
                                                            <option value="1" <c:if test="${mesActual eq 1}">selected="selected"</c:if>>Enero</option>
                                                            <option value="2" <c:if test="${mesActual eq 2}">selected="selected"</c:if>>Febrero</option>
                                                            <option value="3" <c:if test="${mesActual eq 3}">selected="selected"</c:if>>Marzo</option>
                                                            <option value="4" <c:if test="${mesActual eq 4}">selected="selected"</c:if>>Abril</option>
                                                            <option value="5" <c:if test="${mesActual eq 5}">selected="selected"</c:if>>Mayo</option>
                                                            <option value="6" <c:if test="${mesActual eq 6}">selected="selected"</c:if>>Junio</option>
                                                            <option value="7" <c:if test="${mesActual eq 7}">selected="selected"</c:if>>Julio</option>
                                                            <option value="8" <c:if test="${mesActual eq 8}">selected="selected"</c:if>>Agosto</option>
                                                            <option value="9" <c:if test="${mesActual eq 9}">selected="selected"</c:if>>Septiembre</option>
                                                            <option value="10" <c:if test="${mesActual eq 10}">selected="selected"</c:if>>Octubre</option>
                                                            <option value="11" <c:if test="${mesActual eq 11}">selected="selected"</c:if>>Noviembre</option>
                                                            <option value="12" <c:if test="${mesActual eq 12}">selected="selected"</c:if>>Diciembre</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-9">
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 text-right">Año</label>
                                                    <div class="col-md-8">
                                                        <input type="number" name="anyo" class="form-control" value="${anyoActual}">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn grey-salsa btn-outline" data-dismiss="modal">Cancelar</button>
                                <button id="guardarHorasExtra" type="button" class="btn blue"><i class="fa fa-check"></i> Matricular</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>

            </div>
        </div>
    </tiles:putAttribute>

    <tiles:putAttribute name="pagescript">

        <%--<script src="${pageContext.request.contextPath}/assets/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/assets/scripts/ui-modals.min.js" type="text/javascript"></script>
--%>
        <script>

            function mostrarEdicionAsignatura( id ) {
                $('#am-' + id).hide();
                $('#am-editar-' + id).show();

            }

            function ocultarEdicionAsignatura ( id ) {
                $('#am-editar-' + id).hide();
                $('#am-' + id).show();
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

            function guardarEdicion( id ) {

                var nuevoPrecio = $("#nuevoPrecioNeto-" + id).val();
                var nuevaFecha = $("#nuevaFechaInicio-" + id).val();

                //alert(nuevoPrecio + " : " + nuevaFecha);
                NProgress.start();
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/alumno/actualizar-asignatura-matriculada",
                    data: {
                        precioEditado : nuevoPrecio,
                        fechaInicioEditada : nuevaFecha,
                        id : id
                    },
                    async: false,
                    success: function(datos){
                        NProgress.done();
                        if ( datos.estado ) {
                            showToastr("success", datos.titulo, datos.mensaje);
                            $("#precioNeto-" + id).text(nuevoPrecio + " €/mes");
                            $("#fechaInicio-" + id).text(nuevaFecha);
                        } else {
                            showToastr("error", datos.titulo, datos.mensaje);
                        }
                    },
                    error: function(datos){
                        NProgress.done();
                        showToastr("error", "Ha ocurrido un error", "Inténtalo de nuevo más tarde.");
                    }

                });

                ocultarEdicionAsignatura(id);
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

                $('#frmMatricularAsignatura').validate({
                    errorElement: 'span', //default input error message container
                    errorClass: 'help-block', // default input error message class
                    rules: {
                        asignatura: { required: true }
                    },

                    messages: {
                        asignatura:  { required : "Campo obligatorio." }
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

                $("#guardarAsignatura").click(function() {
                    $('#frmMatricularAsignatura').submit();
                });

                $("#guardarDescuento").click(function() {
                    $('#frmAnadirDescuento').submit();
                });

                $("select[name='idDescuento']").change(function() {
                    if ($(this).val() == '4') {
                        $("#opcionesDescuentoExtra").show();
                    } else {
                        $("#opcionesDescuentoExtra").hide();
                    }
                })

                $("#guardarHorasExtra").click(function() {
                    $('#frmHorasExtra').submit();
                });
            })
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>
