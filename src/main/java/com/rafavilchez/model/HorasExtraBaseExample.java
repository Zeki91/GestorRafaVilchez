package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.List;

public class HorasExtraBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HorasExtraBaseExample() {
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

        public Criteria andIdAsignaturaIsNull() {
            addCriterion("idAsignatura is null");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaIsNotNull() {
            addCriterion("idAsignatura is not null");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaEqualTo(Integer value) {
            addCriterion("idAsignatura =", value, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaNotEqualTo(Integer value) {
            addCriterion("idAsignatura <>", value, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaGreaterThan(Integer value) {
            addCriterion("idAsignatura >", value, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaGreaterThanOrEqualTo(Integer value) {
            addCriterion("idAsignatura >=", value, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaLessThan(Integer value) {
            addCriterion("idAsignatura <", value, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaLessThanOrEqualTo(Integer value) {
            addCriterion("idAsignatura <=", value, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaIn(List<Integer> values) {
            addCriterion("idAsignatura in", values, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaNotIn(List<Integer> values) {
            addCriterion("idAsignatura not in", values, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaBetween(Integer value1, Integer value2) {
            addCriterion("idAsignatura between", value1, value2, "idAsignatura");
            return (Criteria) this;
        }

        public Criteria andIdAsignaturaNotBetween(Integer value1, Integer value2) {
            addCriterion("idAsignatura not between", value1, value2, "idAsignatura");
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

        public Criteria andNumHorasIsNull() {
            addCriterion("numHoras is null");
            return (Criteria) this;
        }

        public Criteria andNumHorasIsNotNull() {
            addCriterion("numHoras is not null");
            return (Criteria) this;
        }

        public Criteria andNumHorasEqualTo(Float value) {
            addCriterion("numHoras =", value, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasNotEqualTo(Float value) {
            addCriterion("numHoras <>", value, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasGreaterThan(Float value) {
            addCriterion("numHoras >", value, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasGreaterThanOrEqualTo(Float value) {
            addCriterion("numHoras >=", value, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasLessThan(Float value) {
            addCriterion("numHoras <", value, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasLessThanOrEqualTo(Float value) {
            addCriterion("numHoras <=", value, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasIn(List<Float> values) {
            addCriterion("numHoras in", values, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasNotIn(List<Float> values) {
            addCriterion("numHoras not in", values, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasBetween(Float value1, Float value2) {
            addCriterion("numHoras between", value1, value2, "numHoras");
            return (Criteria) this;
        }

        public Criteria andNumHorasNotBetween(Float value1, Float value2) {
            addCriterion("numHoras not between", value1, value2, "numHoras");
            return (Criteria) this;
        }

        public Criteria andPrecioIsNull() {
            addCriterion("precio is null");
            return (Criteria) this;
        }

        public Criteria andPrecioIsNotNull() {
            addCriterion("precio is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioEqualTo(Float value) {
            addCriterion("precio =", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotEqualTo(Float value) {
            addCriterion("precio <>", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioGreaterThan(Float value) {
            addCriterion("precio >", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioGreaterThanOrEqualTo(Float value) {
            addCriterion("precio >=", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioLessThan(Float value) {
            addCriterion("precio <", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioLessThanOrEqualTo(Float value) {
            addCriterion("precio <=", value, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioIn(List<Float> values) {
            addCriterion("precio in", values, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotIn(List<Float> values) {
            addCriterion("precio not in", values, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioBetween(Float value1, Float value2) {
            addCriterion("precio between", value1, value2, "precio");
            return (Criteria) this;
        }

        public Criteria andPrecioNotBetween(Float value1, Float value2) {
            addCriterion("precio not between", value1, value2, "precio");
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