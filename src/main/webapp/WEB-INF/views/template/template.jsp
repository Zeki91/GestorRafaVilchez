<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="es" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="es" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="es" class="no-js">
<!--<![endif]-->
<head>
    <meta charset="utf-8"/>
    <title>Dashboard | Academia Rafa Vilchez</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport"/>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">

    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/assets/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/assets/plugins/bootstrap-daterangepicker/daterangepicker.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/morris/morris.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/fullcalendar/fullcalendar.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/bootstrap-toastr/toastr.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/assets/plugins/select2/css/select2.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/plugins/select2/css/select2-bootstrap.min.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/assets/css/components-md.min.css" rel="stylesheet" id="style_components" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/plugins-md.min.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/assets/css/layout.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/nprogress.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/themes/darkblue.min.css" rel="stylesheet" type="text/css" id="style_color" />
    <link href="${pageContext.request.contextPath}/assets/css/custom.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/todo-2.css" rel="stylesheet" type="text/css" />

    <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/js/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath}/js/respond.min.js"></script>
    <![endif]-->

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/img/favicon.png"/>

</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-md">

    <tiles:insertAttribute name="header" />
    <div class="clearfix">
    </div>
    <div class="page-container">
        <tiles:insertAttribute name="menu" />
        <tiles:insertAttribute name="body" />
    </div>
    <tiles:insertAttribute name="footer" />



    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/assets/plugins/respond.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/excanvas.min.js"></script>
    <![endif]-->
    <!-- BEGIN CORE PLUGINS -->
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/js.cookie.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery.print.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <script src="${pageContext.request.contextPath}/assets/scripts/datatable.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/datatables/datatables.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/moment.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/moment-locale-es.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-datepicker/locales/bootstrap-datepicker.es.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/morris/morris.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/morris/raphael-min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/counterup/jquery.waypoints.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/counterup/jquery.counterup.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
    <%--<script src="${pageContext.request.contextPath}/assets/plugins/flot/jquery.flot.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/flot/jquery.flot.resize.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/flot/jquery.flot.categories.min.js" type="text/javascript"></script>--%>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery-easypiechart/jquery.easypiechart.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-toastr/toastr.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-confirmation/bootstrap-confirmation.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/select2/js/select2.full.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/nprogress.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/jquery.mask.min.js" type="text/javascript"></script>
    <%--<!-- END PAGE LEVEL PLUGINS -->--%>
    <!-- BEGIN THEME GLOBAL SCRIPTS -->
    <script src="${pageContext.request.contextPath}/assets/scripts/app.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/scripts/ui-toastr.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/scripts/dashboard.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/scripts/components-date-time-pickers.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/scripts/components-select2.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL SCRIPTS -->
    <!-- BEGIN THEME LAYOUT SCRIPTS -->
    <script src="${pageContext.request.contextPath}/assets/scripts/layout.min.js" type="text/javascript"></script>
    <!-- END THEME LAYOUT SCRIPTS -->


    <tiles:insertAttribute name="modal" />
    <tiles:insertAttribute name="pagescript"/>
    <script>
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

        <c:if test="${systemMessage != null}">
            showToastr("${systemMessage.type}", "${systemMessage.title}", "${systemMessage.message}");
        </c:if>
    </script>
</body>
</html>