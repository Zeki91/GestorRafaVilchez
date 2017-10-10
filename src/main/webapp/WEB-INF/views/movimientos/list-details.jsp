<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="row" style="margin-bottom: 10px;">
    <div class="col-xs-6 text-center">
        Ingresos: <span class="importe green bold">${ingresos} € </span>
    </div>
    <div class="col-xs-6 text-center">
        Gastos: <span class="importe red bold">-${gastos} €</span>
    </div>
</div>

<c:forEach items="${movimientos}" var="mov">

    <c:if test="${mov.tipo eq 'I'}">
        <div class="todo-tasklist-item todo-tasklist-item-border-green">
            <img class="pull-left" src="${pageContext.request.contextPath}/assets/img/1487634076_navigation-up_green.png" width="35px" height="35px">
            <div class="todo-tasklist-item-title"> ${mov.concepto} </div>
            <div class="todo-tasklist-item-text"> ${mov.descripción} </div>
            <div class="importe green pull-right">${mov.importe} €</div>
            <div class="todo-tasklist-controls pull-left">
                                                <span class="todo-tasklist-date">
                                                <i class="fa fa-calendar"></i> <fmt:formatDate value="${mov.fecha}" pattern="dd MMM yyyy" /> </span>
            </div>
        </div>
    </c:if>

    <c:if test="${mov.tipo eq 'G'}">
        <div class="todo-tasklist-item todo-tasklist-item-border-red" style="background-color: #fff2f2">
            <img class="pull-left" src="${pageContext.request.contextPath}/assets/img/1487634115_navigation-down_red.png" width="35px" height="35px">
            <div class="todo-tasklist-item-title"> ${mov.concepto} </div>
            <div class="todo-tasklist-item-text"> ${mov.descripción} </div>
            <div class="importe red green pull-right">-${mov.importe} €</div>
            <div class="todo-tasklist-controls pull-left">
                                                <span class="todo-tasklist-date">
                                                <i class="fa fa-calendar"></i> <fmt:formatDate value="${mov.fecha}" pattern="dd MMM yyyy" /> </span>
            </div>
        </div>
    </c:if>

</c:forEach>
