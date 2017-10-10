<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <!-- BEGIN PAGE TITLE-->
                <h3 class="page-title"> Listado de profesores
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
                            <span>Listado de profesores</span>
                        </li>
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
                            <i class="fa fa-graduation-cap" aria-hidden="true"></i>Nº de profesores: ${numProfesores} </div>
                        <div class="tools"> </div>
                    </div>
                    <div class="portlet-body">
                        <div id="sample_2_wrapper" class="dataTables_wrapper no-footer">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="dt-buttons">
                                        <a class="dt-button buttons-print btn default" href="${pageContext.request.contextPath}/profesor/editar"><i class="fa fa-user-plus" aria-hidden="true"></i> Nuevo</a>
                                     </div>
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-condensed">
                                    <thead>
                                    <tr>
                                        <th style="width: 33%"> Apellidos </th>
                                        <th> Nombre </th>
                                        <th> Acciones </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${profesores}" var="profesor">
                                            <tr>
                                                <td> ${profesor.apellidos} </td>
                                                <td> ${profesor.nombre} </td>
                                                <td>
                                                    <a href="${pageContext.request.contextPath}/profesor/editar?idProfesor=${profesor.idProfesor}" class="btn default btn-xs dark-stripe">
                                                        Editar
                                                    </a>
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
</tiles:insertDefinition>
