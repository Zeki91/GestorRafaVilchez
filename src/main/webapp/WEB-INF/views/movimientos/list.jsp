<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">

        <div class="page-content-wrapper">
            <div class="page-content">
                <h3 class="page-title"> Movimientos
                </h3>
                <div class="page-bar">
                    <ul class="page-breadcrumb">
                        <li>
                            <a href="${pageContext.request.contextPath}/dashboard">Inicio</a>
                            <i class="fa fa-angle-right"></i>
                        </li>
                        <li>
                            <span>Movimientos</span>
                        </li>
                    </ul>
                </div>

                <div class="todo-content">
                    <div class="portlet light ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="fa fa-exchange"></i>
                                <span class="caption-subject font-green-sharp bold uppercase">Movimientos</span>
                            </div>
                            <div class="actions">
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-md-6 col-sm-12">
                                    <p class="total-caja"> <small>Total en caja:</small>
                                        <c:if test="${cantidadEnCaja > 0}">
                                            <span class="green">${cantidadEnCaja} €</span>
                                        </c:if>
                                        <c:if test="${cantidadEnCaja < 0}">
                                            <span class="red">${cantidadEnCaja} €</span>
                                        </c:if>
                                        <c:if test="${cantidadEnCaja eq 0}">
                                            <span>${cantidadEnCaja} €</span>
                                        </c:if>
                                    </p>
                                    <div class="form-group row">
                                        <div class="col-md-12">
                                            <div class="input-group" id="defaultrange">
                                                <input type="text" class="form-control">
                                                <span class="input-group-btn">
                                                        <button class="btn default date-range-toggle" type="button">
                                                            <i class="fa fa-calendar"></i>
                                                        </button>
                                                    </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="mov-list" class="todo-tasklist">

                                    </div>
                                </div>
                                <div class="todo-tasklist-devider"> </div>
                                <div class="col-md-6 col-sm-12">
                                    <form action="${pageContext.request.contextPath}/movimientos/guardar-movimiento" class="form-horizontal" method="post">
                                        <div class="form">
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <div class="todo-taskbody-user">
                                                        <span class="todo-username pull-left" style="padding-left: 0px;">Añadir movimiento</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <input type="text" name="concepto" class="form-control todo-taskbody-tasktitle" placeholder="Concepto"> </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <textarea name="descripcion" class="form-control todo-taskbody-taskdesc" rows="5" placeholder="Descripción"></textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <div class="input-group">
                                                        <input type="number" step="any" name="importe" class="form-control" aria-describedby="sizing-addon1" placeholder="Importe">
                                                        <span class="input-group-addon" id="sizing-addon1">€</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <div class="input-icon">
                                                        <i class="fa fa-calendar"></i>
                                                        <input name="fecha" class="form-control todo-taskbody-due date-picker" type="text">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-12">
                                                    <select name="tipo" class="form-control todo-taskbody-tags">
                                                        <option value="I">Ingreso</option>
                                                        <option value="G">Gasto</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-actions right todo-form-actions">
                                                <button type="submit" class="btn btn-sm green">Añadir</button>
                                                <button type="reset" class="btn btn-sm btn-default">Cancelar</button>
                                            </div>
                                        </div>
                                    </form>
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
            $(function() {
                $('#defaultrange').daterangepicker({
                            locale: {
                                applyLabel: 'Aplicar',
                                cancelLabel: 'Cancelar',
                                customRangeLabel: 'Personalizado'
                            },
                            separator: ' a ',
                            startDate: moment().startOf('month'),
                            endDate: moment().endOf('month'),
                            ranges: {
                                'Hoy': [moment(), moment()],
                                'Ayer': [moment().subtract('days', 1), moment().subtract('days', 1)],
                                'Últimos 7 días': [moment().subtract('days', 6), moment()],
                                'Últimos 30 días': [moment().subtract('days', 29), moment()],
                                'Este mes': [moment().startOf('month'), moment().endOf('month')],
                                'Último mes': [moment().subtract('month', 1).startOf('month'), moment().subtract('month', 1).endOf('month')]
                            },
                            minDate: '01/01/2015',
                            maxDate: '12/31/2090',
                        },
                        function (start, end) {
                            $('#defaultrange input').val(start.format('D MMMM YYYY') + ' - ' + end.format('D MMMM YYYY'));
                            $('#mov-list').load("${pageContext.request.contextPath}/movimientos/listado?desde="+start.format('YYYY-MM-D')+"&hasta="+end.format('YYYY-MM-D'));
                        }
                );

                $('#defaultrange input').val(moment().startOf('month').format('D MMMM YYYY') + " - " + moment().endOf('month').format('D MMMM YYYY'));
                $('#mov-list').load("${pageContext.request.contextPath}/movimientos/listado?desde="+moment().startOf('month').format('YYYY-MM-D')+"&hasta="+moment().endOf('month').format('YYYY-MM-D'));

            });
        </script>
    </tiles:putAttribute>
</tiles:insertDefinition>
