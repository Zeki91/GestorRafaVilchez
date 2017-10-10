package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.List;

public class EntradaReciboBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntradaReciboBaseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andTipoEntradaIsNull() {
            addCriterion("tipoEntrada is null");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaIsNotNull() {
            addCriterion("tipoEntrada is not null");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaEqualTo(Integer value) {
            addCriterion("tipoEntrada =", value, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaNotEqualTo(Integer value) {
            addCriterion("tipoEntrada <>", value, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaGreaterThan(Integer value) {
            addCriterion("tipoEntrada >", value, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipoEntrada >=", value, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaLessThan(Integer value) {
            addCriterion("tipoEntrada <", value, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaLessThanOrEqualTo(Integer value) {
            addCriterion("tipoEntrada <=", value, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaIn(List<Integer> values) {
            addCriterion("tipoEntrada in", values, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaNotIn(List<Integer> values) {
            addCriterion("tipoEntrada not in", values, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaBetween(Integer value1, Integer value2) {
            addCriterion("tipoEntrada between", value1, value2, "tipoEntrada");
            return (Criteria) this;
        }

        public Criteria andTipoEntradaNotBetween(Integer value1, Integer value2) {
            addCriterion("tipoEntrada not between", value1, value2, "tipoEntrada");
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

        public Criteria andTipoDescuentoIsNull() {
            addCriterion("tipoDescuento is null");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoIsNotNull() {
            addCriterion("tipoDescuento is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoEqualTo(String value) {
            addCriterion("tipoDescuento =", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoNotEqualTo(String value) {
            addCriterion("tipoDescuento <>", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoGreaterThan(String value) {
            addCriterion("tipoDescuento >", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoGreaterThanOrEqualTo(String value) {
            addCriterion("tipoDescuento >=", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoLessThan(String value) {
            addCriterion("tipoDescuento <", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoLessThanOrEqualTo(String value) {
            addCriterion("tipoDescuento <=", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoLike(String value) {
            addCriterion("tipoDescuento like", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoNotLike(String value) {
            addCriterion("tipoDescuento not like", value, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoIn(List<String> values) {
            addCriterion("tipoDescuento in", values, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoNotIn(List<String> values) {
            addCriterion("tipoDescuento not in", values, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoBetween(String value1, String value2) {
            addCriterion("tipoDescuento between", value1, value2, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andTipoDescuentoNotBetween(String value1, String value2) {
            addCriterion("tipoDescuento not between", value1, value2, "tipoDescuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNull() {
            addCriterion("descuento is null");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNotNull() {
            addCriterion("descuento is not null");
            return (Criteria) this;
        }

        public Criteria andDescuentoEqualTo(Float value) {
            addCriterion("descuento =", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotEqualTo(Float value) {
            addCriterion("descuento <>", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThan(Float value) {
            addCriterion("descuento >", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThanOrEqualTo(Float value) {
            addCriterion("descuento >=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThan(Float value) {
            addCriterion("descuento <", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThanOrEqualTo(Float value) {
            addCriterion("descuento <=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIn(List<Float> values) {
            addCriterion("descuento in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotIn(List<Float> values) {
            addCriterion("descuento not in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoBetween(Float value1, Float value2) {
            addCriterion("descuento between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotBetween(Float value1, Float value2) {
            addCriterion("descuento not between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNull() {
            addCriterion("cantidad is null");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNotNull() {
            addCriterion("cantidad is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadEqualTo(Float value) {
            addCriterion("cantidad =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(Float value) {
            addCriterion("cantidad <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(Float value) {
            addCriterion("cantidad >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(Float value) {
            addCriterion("cantidad >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(Float value) {
            addCriterion("cantidad <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(Float value) {
            addCriterion("cantidad <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<Float> values) {
            addCriterion("cantidad in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<Float> values) {
            addCriterion("cantidad not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(Float value1, Float value2) {
            addCriterion("cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(Float value1, Float value2) {
            addCriterion("cantidad not between", value1, value2, "cantidad");
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