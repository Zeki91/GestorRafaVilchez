<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- BEGIN SIDEBAR -->
<div class="page-sidebar-wrapper">
    <!-- BEGIN SIDEBAR -->
    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
    <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
    <div class="page-sidebar navbar-collapse collapse">
        <!-- BEGIN SIDEBAR MENU -->
        <!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
        <!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
        <!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
        <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
        <!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
        <!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
        <ul class="page-sidebar-menu  page-header-fixed " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200" style="padding-top: 20px">
            <!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
            <li class="sidebar-toggler-wrapper hide">
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                <div class="sidebar-toggler"> </div>
                <!-- END SIDEBAR TOGGLER BUTTON -->
            </li>
            <li class="nav-item start <c:if test="${menuItemActive == 0}"> active </c:if>">
                <a href="${pageContext.request.contextPath}/dashboard" class="nav-link nav-toggle">
                    <i class="fa fa-home" aria-hidden="true"></i>
                    <span class="title">Inicio</span>
                </a>
            </li>
            <li class="nav-item start <c:if test="${menuItemActive == 1}"> active </c:if>">
                <a href="${pageContext.request.contextPath}/alumno/listado" class="nav-link nav-toggle">
                    <i class="fa fa-users" aria-hidden="true"></i>
                    <span class="title">Alumnos</span>
                </a>
            </li>
            <li class="nav-item start <c:if test="${menuItemActive == 2}"> active </c:if>">
                <a href="${pageContext.request.contextPath}/profesor/listado" class="nav-link nav-toggle">
                    <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                    <span class="title">Profesores</span>
                </a>
            </li>
            <li class="nav-item start <c:if test="${menuItemActive == 3}"> active </c:if>">
                <a href="${pageContext.request.contextPath}/asignatura/listado" class="nav-link nav-toggle">
                    <i class="fa fa-book" aria-hidden="true"></i>
                    <span class="title">Asignaturas</span>
                </a>
            </li>
            <li class="heading">
                <h3 class="uppercase">Contabilidad</h3>
            </li>
            <li class="nav-item start <c:if test="${menuItemActive == 4}"> active </c:if>">
                <a href="${pageContext.request.contextPath}/notas-de-pago/listado" class="nav-link nav-toggle">
                    <i class="fa fa-file-text-o" aria-hidden="true"></i>
                    <span class="title">Notas de pago</span>
                </a>
            </li>
            <c:if test="${sessionScope.loggedUser.rol ne 'ROLE_OPERATOR'}">
                <li class="nav-item start <c:if test="${menuItemActive == 5}"> active </c:if>">
                    <a href="${pageContext.request.contextPath}/movimientos" class="nav-link nav-toggle">
                        <i class="fa fa-exchange" aria-hidden="true"></i>
                        <span class="title">Movimientos</span>
                    </a>
                </li>
            </c:if>
        </ul>
        <!-- END SIDEBAR MENU -->
        <!-- END SIDEBAR MENU -->
    </div>
    <!-- END SIDEBAR -->
</div>
<!-- END SIDEBAR -->