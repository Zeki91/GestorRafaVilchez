package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MovimientoBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovimientoBaseExample() {
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

        public Criteria andIdMovimientoIsNull() {
            addCriterion("idMovimiento is null");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoIsNotNull() {
            addCriterion("idMovimiento is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoEqualTo(Integer value) {
            addCriterion("idMovimiento =", value, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoNotEqualTo(Integer value) {
            addCriterion("idMovimiento <>", value, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoGreaterThan(Integer value) {
            addCriterion("idMovimiento >", value, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoGreaterThanOrEqualTo(Integer value) {
            addCriterion("idMovimiento >=", value, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoLessThan(Integer value) {
            addCriterion("idMovimiento <", value, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoLessThanOrEqualTo(Integer value) {
            addCriterion("idMovimiento <=", value, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoIn(List<Integer> values) {
            addCriterion("idMovimiento in", values, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoNotIn(List<Integer> values) {
            addCriterion("idMovimiento not in", values, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoBetween(Integer value1, Integer value2) {
            addCriterion("idMovimiento between", value1, value2, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andIdMovimientoNotBetween(Integer value1, Integer value2) {
            addCriterion("idMovimiento not between", value1, value2, "idMovimiento");
            return (Criteria) this;
        }

        public Criteria andTipoIsNull() {
            addCriterion("tipo is null");
            return (Criteria) this;
        }

        public Criteria andTipoIsNotNull() {
            addCriterion("tipo is not null");
            return (Criteria) this;
        }

        public Criteria andTipoEqualTo(String value) {
            addCriterion("tipo =", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotEqualTo(String value) {
            addCriterion("tipo <>", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoGreaterThan(String value) {
            addCriterion("tipo >", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoGreaterThanOrEqualTo(String value) {
            addCriterion("tipo >=", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLessThan(String value) {
            addCriterion("tipo <", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLessThanOrEqualTo(String value) {
            addCriterion("tipo <=", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLike(String value) {
            addCriterion("tipo like", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotLike(String value) {
            addCriterion("tipo not like", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoIn(List<String> values) {
            addCriterion("tipo in", values, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotIn(List<String> values) {
            addCriterion("tipo not in", values, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoBetween(String value1, String value2) {
            addCriterion("tipo between", value1, value2, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotBetween(String value1, String value2) {
            addCriterion("tipo not between", value1, value2, "tipo");
            return (Criteria) this;
        }

        public Criteria andConceptoIsNull() {
            addCriterion("concepto is null");
            return (Criteria) this;
        }

        public Criteria andConceptoIsNotNull() {
            addCriterion("concepto is not null");
            return (Criteria) this;
        }

        public Criteria andConceptoEqualTo(String value) {
            addCriterion("concepto =", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotEqualTo(String value) {
            addCriterion("concepto <>", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoGreaterThan(String value) {
            addCriterion("concepto >", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoGreaterThanOrEqualTo(String value) {
            addCriterion("concepto >=", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoLessThan(String value) {
            addCriterion("concepto <", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoLessThanOrEqualTo(String value) {
            addCriterion("concepto <=", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoLike(String value) {
            addCriterion("concepto like", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotLike(String value) {
            addCriterion("concepto not like", value, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoIn(List<String> values) {
            addCriterion("concepto in", values, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotIn(List<String> values) {
            addCriterion("concepto not in", values, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoBetween(String value1, String value2) {
            addCriterion("concepto between", value1, value2, "concepto");
            return (Criteria) this;
        }

        public Criteria andConceptoNotBetween(String value1, String value2) {
            addCriterion("concepto not between", value1, value2, "concepto");
            return (Criteria) this;
        }

        public Criteria andDescripciónIsNull() {
            addCriterion("descripción is null");
            return (Criteria) this;
        }

        public Criteria andDescripciónIsNotNull() {
            addCriterion("descripción is not null");
            return (Criteria) this;
        }

        public Criteria andDescripciónEqualTo(String value) {
            addCriterion("descripción =", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónNotEqualTo(String value) {
            addCriterion("descripción <>", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónGreaterThan(String value) {
            addCriterion("descripción >", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónGreaterThanOrEqualTo(String value) {
            addCriterion("descripción >=", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónLessThan(String value) {
            addCriterion("descripción <", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónLessThanOrEqualTo(String value) {
            addCriterion("descripción <=", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónLike(String value) {
            addCriterion("descripción like", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónNotLike(String value) {
            addCriterion("descripción not like", value, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónIn(List<String> values) {
            addCriterion("descripción in", values, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónNotIn(List<String> values) {
            addCriterion("descripción not in", values, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónBetween(String value1, String value2) {
            addCriterion("descripción between", value1, value2, "descripción");
            return (Criteria) this;
        }

        public Criteria andDescripciónNotBetween(String value1, String value2) {
            addCriterion("descripción not between", value1, value2, "descripción");
            return (Criteria) this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("fecha is null");
            return (Criteria) this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("fecha is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterionForJDBCDate("fecha =", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha <>", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha >", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha >=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterionForJDBCDate("fecha <", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha <=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaIn(List<Date> values) {
            addCriterionForJDBCDate("fecha in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha not in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha not between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andImporteIsNull() {
            addCriterion("importe is null");
            return (Criteria) this;
        }

        public Criteria andImporteIsNotNull() {
            addCriterion("importe is not null");
            return (Criteria) this;
        }

        public Criteria andImporteEqualTo(Float value) {
            addCriterion("importe =", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotEqualTo(Float value) {
            addCriterion("importe <>", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteGreaterThan(Float value) {
            addCriterion("importe >", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteGreaterThanOrEqualTo(Float value) {
            addCriterion("importe >=", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteLessThan(Float value) {
            addCriterion("importe <", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteLessThanOrEqualTo(Float value) {
            addCriterion("importe <=", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteIn(List<Float> values) {
            addCriterion("importe in", values, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotIn(List<Float> values) {
            addCriterion("importe not in", values, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteBetween(Float value1, Float value2) {
            addCriterion("importe between", value1, value2, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotBetween(Float value1, Float value2) {
            addCriterion("importe not between", value1, value2, "importe");
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