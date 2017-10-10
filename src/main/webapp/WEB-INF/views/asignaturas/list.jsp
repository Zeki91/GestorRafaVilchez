<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <!-- BEGIN PAGE TITLE-->
                <h3 class="page-title"> Listado de asignaturas
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
                            <span>Listado de asignaturas</span>
                        </li>
                    </ul>
                </div>

                <div class="portlet box green">
                    <div class="portlet-title">
                        <div class="caption">
                            <i class="fa fa-book" aria-hidden="true"></i>Nº de asignaturas: ${numAsignaturas} </div>
                        <div class="tools"> </div>
                    </div>
                    <div class="portlet-body">
                        <div id="sample_2_wrapper" class="dataTables_wrapper no-footer">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="dt-buttons">
                                        <a class="dt-button buttons-print btn default" href="${pageContext.request.contextPath}/asignatura/editar"><i class="fa fa-user-plus" aria-hidden="true"></i> Nueva</a>
                                    </div>
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                    <tr>
                                        <th style="width: 33%"> Nombre </th>
                                        <th>Profesor</th>
                                        <th>Acciones</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${asignaturas}" var="asignatura">
                                        <tr>
                                            <td> ${asignatura.nombre} </td>
                                            <td>${asignatura.profesor.nombre}</td>
                                            <td>
                                                <a href="${pageContext.request.contextPath}/asignatura/ver?idAsignatura=${asignatura.idAsignatura}" class="btn default btn-xs dark-stripe">
                                                    Ver
                                                </a>
                                                <a href="${pageContext.request.contextPath}/asignatura/editar?idAsignatura=${asignatura.idAsignatura}" class="btn default btn-xs dark-stripe">
                                                    Editar
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
