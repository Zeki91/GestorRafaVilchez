package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReciboBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReciboBaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCodReciboIsNull() {
            addCriterion("codRecibo is null");
            return (Criteria) this;
        }

        public Criteria andCodReciboIsNotNull() {
            addCriterion("codRecibo is not null");
            return (Criteria) this;
        }

        public Criteria andCodReciboEqualTo(String value) {
            addCriterion("codRecibo =", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboNotEqualTo(String value) {
            addCriterion("codRecibo <>", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboGreaterThan(String value) {
            addCriterion("codRecibo >", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboGreaterThanOrEqualTo(String value) {
            addCriterion("codRecibo >=", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboLessThan(String value) {
            addCriterion("codRecibo <", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboLessThanOrEqualTo(String value) {
            addCriterion("codRecibo <=", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboLike(String value) {
            addCriterion("codRecibo like", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboNotLike(String value) {
            addCriterion("codRecibo not like", value, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboIn(List<String> values) {
            addCriterion("codRecibo in", values, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboNotIn(List<String> values) {
            addCriterion("codRecibo not in", values, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboBetween(String value1, String value2) {
            addCriterion("codRecibo between", value1, value2, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andCodReciboNotBetween(String value1, String value2) {
            addCriterion("codRecibo not between", value1, value2, "codRecibo");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoIsNull() {
            addCriterion("idAlumno is null");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoIsNotNull() {
            addCriterion("idAlumno is not null");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoEqualTo(Integer value) {
            addCriterion("idAlumno =", value, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoNotEqualTo(Integer value) {
            addCriterion("idAlumno <>", value, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoGreaterThan(Integer value) {
            addCriterion("idAlumno >", value, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("idAlumno >=", value, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoLessThan(Integer value) {
            addCriterion("idAlumno <", value, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoLessThanOrEqualTo(Integer value) {
            addCriterion("idAlumno <=", value, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoIn(List<Integer> values) {
            addCriterion("idAlumno in", values, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoNotIn(List<Integer> values) {
            addCriterion("idAlumno not in", values, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoBetween(Integer value1, Integer value2) {
            addCriterion("idAlumno between", value1, value2, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andIdAlumnoNotBetween(Integer value1, Integer value2) {
            addCriterion("idAlumno not between", value1, value2, "idAlumno");
            return (Criteria) this;
        }

        public Criteria andMesIsNull() {
            addCriterion("mes is null");
            return (Criteria) this;
        }

        public Criteria andMesIsNotNull() {
            addCriterion("mes is not null");
            return (Criteria) this;
        }

        public Criteria andMesEqualTo(Integer value) {
            addCriterion("mes =", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotEqualTo(Integer value) {
            addCriterion("mes <>", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesGreaterThan(Integer value) {
            addCriterion("mes >", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesGreaterThanOrEqualTo(Integer value) {
            addCriterion("mes >=", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesLessThan(Integer value) {
            addCriterion("mes <", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesLessThanOrEqualTo(Integer value) {
            addCriterion("mes <=", value, "mes");
            return (Criteria) this;
        }

        public Criteria andMesIn(List<Integer> values) {
            addCriterion("mes in", values, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotIn(List<Integer> values) {
            addCriterion("mes not in", values, "mes");
            return (Criteria) this;
        }

        public Criteria andMesBetween(Integer value1, Integer value2) {
            addCriterion("mes between", value1, value2, "mes");
            return (Criteria) this;
        }

        public Criteria andMesNotBetween(Integer value1, Integer value2) {
            addCriterion("mes not between", value1, value2, "mes");
            return (Criteria) this;
        }

        public Criteria andAnyoIsNull() {
            addCriterion("anyo is null");
            return (Criteria) this;
        }

        public Criteria andAnyoIsNotNull() {
            addCriterion("anyo is not null");
            return (Criteria) this;
        }

        public Criteria andAnyoEqualTo(Integer value) {
            addCriterion("anyo =", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoNotEqualTo(Integer value) {
            addCriterion("anyo <>", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoGreaterThan(Integer value) {
            addCriterion("anyo >", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoGreaterThanOrEqualTo(Integer value) {
            addCriterion("anyo >=", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoLessThan(Integer value) {
            addCriterion("anyo <", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoLessThanOrEqualTo(Integer value) {
            addCriterion("anyo <=", value, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoIn(List<Integer> values) {
            addCriterion("anyo in", values, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoNotIn(List<Integer> values) {
            addCriterion("anyo not in", values, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoBetween(Integer value1, Integer value2) {
            addCriterion("anyo between", value1, value2, "anyo");
            return (Criteria) this;
        }

        public Criteria andAnyoNotBetween(Integer value1, Integer value2) {
            addCriterion("anyo not between", value1, value2, "anyo");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionIsNull() {
            addCriterion("fechaEmision is null");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionIsNotNull() {
            addCriterion("fechaEmision is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionEqualTo(Date value) {
            addCriterionForJDBCDate("fechaEmision =", value, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaEmision <>", value, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaEmision >", value, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaEmision >=", value, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionLessThan(Date value) {
            addCriterionForJDBCDate("fechaEmision <", value, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaEmision <=", value, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionIn(List<Date> values) {
            addCriterionForJDBCDate("fechaEmision in", values, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaEmision not in", values, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaEmision between", value1, value2, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaEmisionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaEmision not between", value1, value2, "fechaEmision");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNull() {
            addCriterion("fechaPago is null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIsNotNull() {
            addCriterion("fechaPago is not null");
            return (Criteria) this;
        }

        public Criteria andFechaPagoEqualTo(Date value) {
            addCriterionForJDBCDate("fechaPago =", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaPago <>", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaPago >", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaPago >=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThan(Date value) {
            addCriterionForJDBCDate("fechaPago <", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaPago <=", value, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoIn(List<Date> values) {
            addCriterionForJDBCDate("fechaPago in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaPago not in", values, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaPago between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andFechaPagoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaPago not between", value1, value2, "fechaPago");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalIsNull() {
            addCriterion("cantidadTotal is null");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalIsNotNull() {
            addCriterion("cantidadTotal is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalEqualTo(Float value) {
            addCriterion("cantidadTotal =", value, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalNotEqualTo(Float value) {
            addCriterion("cantidadTotal <>", value, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalGreaterThan(Float value) {
            addCriterion("cantidadTotal >", value, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("cantidadTotal >=", value, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalLessThan(Float value) {
            addCriterion("cantidadTotal <", value, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalLessThanOrEqualTo(Float value) {
            addCriterion("cantidadTotal <=", value, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalIn(List<Float> values) {
            addCriterion("cantidadTotal in", values, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalNotIn(List<Float> values) {
            addCriterion("cantidadTotal not in", values, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalBetween(Float value1, Float value2) {
            addCriterion("cantidadTotal between", value1, value2, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andCantidadTotalNotBetween(Float value1, Float value2) {
            addCriterion("cantidadTotal not between", value1, value2, "cantidadTotal");
            return (Criteria) this;
        }

        public Criteria andObservacionesIsNull() {
            addCriterion("observaciones is null");
            return (Criteria) this;
        }

        public Criteria andObservacionesIsNotNull() {
            addCriterion("observaciones is not null");
            return (Criteria) this;
        }

        public Criteria andObservacionesEqualTo(Float value) {
            addCriterion("observaciones =", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotEqualTo(Float value) {
            addCriterion("observaciones <>", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesGreaterThan(Float value) {
            addCriterion("observaciones >", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesGreaterThanOrEqualTo(Float value) {
            addCriterion("observaciones >=", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLessThan(Float value) {
            addCriterion("observaciones <", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLessThanOrEqualTo(Float value) {
            addCriterion("observaciones <=", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesIn(List<Float> values) {
            addCriterion("observaciones in", values, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotIn(List<Float> values) {
            addCriterion("observaciones not in", values, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesBetween(Float value1, Float value2) {
            addCriterion("observaciones between", value1, value2, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotBetween(Float value1, Float value2) {
            addCriterion("observaciones not between", value1, value2, "observaciones");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}