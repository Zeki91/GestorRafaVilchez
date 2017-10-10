<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <div class="row">
                    <div class="col-md-12">
                        <h3 class="page-title">Gestor Academia Rafa Vílchez</h3>

                        <div class="page-bar">
                            <ul class="page-breadcrumb">
                                <li>
                                    <span>Inicio</span>
                                    <i class="fa fa-angle-right"></i>
                                </li>
                                <li>
                                    <span>Dashboard</span>
                                </li>

                            </ul>
                        </div>

                        <div class="row">
                            <div class="col-md-6 col-sm-12">
                                <div class="portlet light bordered">
                                    <div class="portlet-title">
                                        <div class="caption">
                                            <i class="fa fa-clone font-green"></i>
                                            <span class="caption-subject font-green bold uppercase">Notas de pago</span>
                                        </div>
                                    </div>
                                    <div class="portlet-body">
                                        <form id="frmGenerarNotasDePago" class="form" action="${pageContext.request.contextPath}/generar-recibos" method="post">
                                            <h4 style="margin-bottom: 20px">Generar notas de pago para...</h4>
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 text-right">Mes</label>
                                                        <div class="col-md-8">
                                                            <select class="form-control" name="mes" tabindex="1">
                                                                <option value="" disabled selected>Selecciona un mes...</option>
                                                                <option value="1">Enero</option>
                                                                <option value="2">Febrero</option>
                                                                <option value="3">Marzo</option>
                                                                <option value="4">Abril</option>
                                                                <option value="5">Mayo</option>
                                                                <option value="6">Junio</option>
                                                                <option value="7">Julio</option>
                                                                <option value="8">Agosto</option>
                                                                <option value="9">Septiembre</option>
                                                                <option value="10">Octubre</option>
                                                                <option value="11">Noviembre</option>
                                                                <option value="12">Diciembre</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="row" style="margin-top: 15px;">
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <label class="control-label col-md-3 text-right">Asignatura</label>
                                                        <div class="col-md-8">
                                                            <select class="form-control" name="asignatura" tabindex="1">
                                                                <option value="0" selected>Todas</option>
                                                                <c:forEach items="${asignaturas}" var="asignatura">
                                                                    <option value="${asignatura.idAsignatura}">${asignatura.nombre}</option>
                                                                </c:forEach>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-actions right" style="padding-bottom: 0">
                                                <button id="generar-notas" type="submit" class="btn blue">
                                                    <i class="fa fa-check"></i> Generar</button>
                                            </div>
                                        </form>
                                    </div>
                                    <%--<a href="${pageContext.request.contextPath}/generar-recibos?idAlumno=1">Generar recibos</a>--%>

                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-7">
                                <c:if test="${recibos ne null}">
                                    <c:forEach items="${recibos}" var="recibo">
                                        <div class="nota-de-pago">
                                            <div class="row">
                                                <div class="col-md-3 logo">
                                                    <img src="${pageContext.request.contextPath}/assets/img/logo-notas-de-pago.png" alt="Logo">
                                                </div>
                                                <div class="col-md-9">
                                                    <p class="nombre"><strong>Nombre:</strong> ${recibo.alumno.nombre} ${recibo.alumno.apellidos}</p>
                                                    <p class="periodo"><strong>Periodo:</strong> ${nombreMeses[recibo.mes]} </p>
                                                    <table class="table listado-asignaturas">
                                                        <thead>
                                                        <tr>
                                                            <th>CONCEPTO</th>
                                                            <th class="text-center">DESCUENTO</th>
                                                            <th class="text-center">PRECIO</th>
                                                        </tr>
                                                        </thead>
                                                        <tbody>
                                                        <c:forEach items="${recibo.entradas}" var="entrada">
                                                            <tr>
                                                                <td>${entrada.concepto}</td>
                                                                <td class="text-center">
                                                                    <c:choose>
                                                                        <c:when test="${entrada.descuento ne null}">
                                                                            <c:choose>
                                                                                <c:when test="${entrada.tipoDescuento eq 'porcentual'}">
                                                                                    <fmt:formatNumber value="${entrada.descuento/100}" type="percent"/>
                                                                                </c:when>
                                                                                <c:when test="${entrada.tipoDescuento eq 'cantidad'}">
                                                                                    <fmt:formatNumber value="${entrada.descuento}" type="currency"/>
                                                                                </c:when>
                                                                            </c:choose>
                                                                        </c:when>
                                                                        <c:otherwise>-</c:otherwise>
                                                                    </c:choose>
                                                                </td>
                                                                <td class="text-center"><fmt:formatNumber value="${entrada.cantidad}" type="currency"/></td>
                                                            </tr>
                                                        </c:forEach>
                                                            <tr>
                                                                <td></td>
                                                                <td class="text-center bold">TOTAL:</td>
                                                                <td class="text-center bold"><fmt:formatNumber value="${recibo.cantidadTotal}" type="currency"/></td>
                                                            </tr>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </c:if>
                            </div>
                        </div>
                        <div id="long" class="modal fade modal-scroll" tabindex="-1" data-replace="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                        <h4 class="modal-title">A Fairly Long Modal</h4>
                                    </div>
                                    <div class="modal-body">
                                        <img style="height: 800px" alt="" src="http://i.imgur.com/KwPYo.jpg"> </div>
                                    <div class="modal-footer">
                                        <button type="button" data-dismiss="modal" class="btn dark btn-outline">Close</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </tiles:putAttribute>

    <tiles:putAttribute name="pagescript">
        <script>
            $('#generar-notas').click(function() {
                $.blockUI({
                    boxed: true,
                    message: '<i class="fa fa-spinner fa-pulse fa-fw"></i> Generando notas de pago...',
                    overlayCSS: '#848484',
                    css: {
                        border: 'none',
                        padding: '15px',
                        backgroundColor: '#000',
                        '-webkit-border-radius': '10px',
                        '-moz-border-radius': '10px',
                        opacity: .5,
                        color: '#fff'
                    }
                })
            });
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>