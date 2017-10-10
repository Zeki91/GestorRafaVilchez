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
                        <h3 class="page-title">Notas de pago generadas</h3>

                        <div class="page-bar">
                            <ul class="page-breadcrumb">
                                <li>
                                    <span>Inicio</span>
                                    <i class="fa fa-angle-right"></i>
                                </li>
                                <li>
                                    <span>Dashboard</span>
                                    <i class="fa fa-angle-right"></i>
                                </li>
                                <li>
                                    <span>Notas de pago</span>
                                </li>

                            </ul>
                        </div>

                        <div class="portlet light bordered">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="icon-social-dribbble font-green"></i>
                                    <span class="caption-subject font-green bold uppercase">Vista previa</span>
                                </div>
                                <div class="actions">
                                    <a class="btn btn-circle blue" href="#" onclick="imprimirNotas(); return false;">
                                        <i class="fa fa-print"></i> Imprimir
                                    </a>
                                </div>
                            </div>
                            <div class="portlet-body lista-notas">
                                <div class="row">
                                    <div class="col-xs-10 col-md-7">
                                        <c:if test="${recibos ne null}">
                                            <c:set var="cont" value="1"/>
                                            <c:forEach items="${recibos}" var="recibo">
                                                <div class="nota-de-pago <c:if test="${cont % 3 eq 0}"> page-break-after </c:if> <c:if test="${cont % 3 eq 1}"> page-break-before </c:if>">
                                                    <div class="row">
                                                        <div class="col-xs-3 col-md-3 logo">
                                                            <img src="${pageContext.request.contextPath}/assets/img/logo-notas-de-pago.png" alt="Logo">
                                                        </div>
                                                        <div class="col-xs-9 col-md-9">
                                                            <p class="nombre"><strong>Alumno:</strong> ${recibo.alumno.nombre} ${recibo.alumno.apellidos}</p>
                                                            <p class="periodo"><strong>Mes:</strong> ${nombreMeses[recibo.mes]}, ${recibo.anyo} </p>
                                                            <table class="table listado-asignaturas">
                                                                <thead>
                                                                <tr>
                                                                    <th>CONCEPTO</th>
                                                                    <th class="text-center">DESCUENTO</th>
                                                                    <th class="text-right">PRECIO</th>
                                                                </tr>
                                                                </thead>
                                                                <tbody>
                                                                <c:set var="cont" value="0"/>
                                                                <c:forEach items="${recibo.entradas}" var="entrada" varStatus="status">
                                                                    <c:set var="cont" value="${status.count}"/>
                                                                    <tr>
                                                                        <td>${entrada.concepto} </td>
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
                                                                        <td class="text-right"><fmt:formatNumber value="${entrada.cantidad}" type="currency"/></td>
                                                                    </tr>
                                                                </c:forEach>
                                                                <c:forEach begin="${cont+1}" end="4">
                                                                    <tr>
                                                                        <td>&nbsp;</td>
                                                                        <td>&nbsp;</td>
                                                                        <td>&nbsp;</td>
                                                                    </tr>
                                                                </c:forEach>
                                                                <tr>
                                                                    <td></td>
                                                                    <td class="text-center bold">TOTAL:</td>
                                                                    <td class="text-right bold"><fmt:formatNumber value="${recibo.cantidadTotal}" type="currency"/></td>
                                                                </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                                <c:set var="cont" value="${cont + 1}" />
                                                <%--<c:if test="${cont % 3 eq 0}">
                                                    <div class="page-break"></div>
                                                    <div></div>
                                                </c:if>--%>
                                            </c:forEach>
                                        </c:if>
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
            function imprimirNotas() {
                $('.datos-empresa').hide();
                $('.lista-notas').print({
                    addGlobalStyles : true,
                    stylesheet : null,
                    rejectWindow : true,
                    noPrintSelector : ".no-print",
                    iframe : true,
                    append : null,
                    prepend : null
                })
            }
            function imprimirFacturas() {
                $('.datos-empresa').show();
                $('.lista-notas').print({
                    addGlobalStyles : true,
                    stylesheet : null,
                    rejectWindow : true,
                    noPrintSelector : ".no-print",
                    iframe : true,
                    append : null,
                    prepend : null
                })
            }
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>