<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="pull-right">
    <ul class="pagination">
        <c:set var="pageBegin" value="${page.page-5}"/>
        <c:set var="pageEnd" value="${page.page+5}"/>
        <c:if test="${pageBegin < 1}">
            <c:set var="pageBegin" value="1"/>
        </c:if>
        <c:if test="${pageEnd > page.totalPages}">
            <c:set var="pageEnd" value="${page.totalPages}"/>
        </c:if>
        <c:choose>
            <c:when test="${page.hasPrevious()}"><li><a href="javascript:paginationPrev()"><i class="fa fa-chevron-left"></i></a></li></c:when>
            <c:otherwise><li class="disabled"><a href="javascript:void(0)"><i class="fa fa-chevron-left"></i></a></li></c:otherwise>
        </c:choose>
        <c:forEach begin="${pageBegin}" end="${pageEnd}" var="pageNumber">
            <li <c:if test="${pageNumber == page.page}">class="active"</c:if>><a href="javascript:paginationGo(${pageNumber})">${pageNumber}</a></li>
        </c:forEach>
        <c:choose>
            <c:when test="${page.hasNext()}"><li><a href="javascript:paginationNext()"><i class="fa fa-chevron-right"></i></a></li></c:when>
            <c:otherwise><li class="disabled"><a href="javascript:void(0)"><i class="fa fa-chevron-right"></i></a></li></c:otherwise>
        </c:choose>
    </ul>
</div>
