<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplateLogin">
    <tiles:putAttribute name="body">

        <!-- BEGIN LOGIN -->
        <div class="content">
            <!-- BEGIN LOGIN FORM -->
            <form class="login-form" action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
                <div class="form-title">
                    <%--<span class="form-title">Bienvenido!</span>--%>
                    <span class="form-subtitle">Por favor, introduce tu usuario y contraseña.</span>
                </div>
                <div class="alert alert-danger display-hide empty-fields">
                    <button class="close" data-close="alert"></button>
                    <span> Debe introducir el nombre de usuario y la contraseña. </span>
                </div>
                <c:if test="${error != null && error != ''}">
                    <div class="alert alert-danger" role="alert">
                        <button class="close" data-close="alert"></button>
                        <span> ${error} </span>
                    </div>
                </c:if>
                <div class="form-group">
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <label class="control-label visible-ie8 visible-ie9">Username</label>
                    <input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" placeholder="Usuario" name="j_username" /> </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Password</label>
                    <input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" placeholder="Contraseña" name="j_password" /> </div>
                <div class="form-actions">
                    <button type="submit" class="btn red btn-block uppercase">Login</button>
                </div>
            </form>
            <!-- END LOGIN FORM -->
        </div>
        <!-- END LOGIN -->
    </tiles:putAttribute>
</tiles:insertDefinition>
