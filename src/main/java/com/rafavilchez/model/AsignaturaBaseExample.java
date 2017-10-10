package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AsignaturaBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AsignaturaBaseExample() {
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

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoIsNull() {
            addCriterion("precioBruto is null");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoIsNotNull() {
            addCriterion("precioBruto is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoEqualTo(Float value) {
            addCriterion("precioBruto =", value, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoNotEqualTo(Float value) {
            addCriterion("precioBruto <>", value, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoGreaterThan(Float value) {
            addCriterion("precioBruto >", value, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoGreaterThanOrEqualTo(Float value) {
            addCriterion("precioBruto >=", value, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoLessThan(Float value) {
            addCriterion("precioBruto <", value, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoLessThanOrEqualTo(Float value) {
            addCriterion("precioBruto <=", value, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoIn(List<Float> values) {
            addCriterion("precioBruto in", values, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoNotIn(List<Float> values) {
            addCriterion("precioBruto not in", values, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoBetween(Float value1, Float value2) {
            addCriterion("precioBruto between", value1, value2, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andPrecioBrutoNotBetween(Float value1, Float value2) {
            addCriterion("precioBruto not between", value1, value2, "precioBruto");
            return (Criteria) this;
        }

        public Criteria andIdProfesorIsNull() {
            addCriterion("idProfesor is null");
            return (Criteria) this;
        }

        public Criteria andIdProfesorIsNotNull() {
            addCriterion("idProfesor is not null");
            return (Criteria) this;
        }

        public Criteria andIdProfesorEqualTo(Integer value) {
            addCriterion("idProfesor =", value, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorNotEqualTo(Integer value) {
            addCriterion("idProfesor <>", value, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorGreaterThan(Integer value) {
            addCriterion("idProfesor >", value, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorGreaterThanOrEqualTo(Integer value) {
            addCriterion("idProfesor >=", value, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorLessThan(Integer value) {
            addCriterion("idProfesor <", value, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorLessThanOrEqualTo(Integer value) {
            addCriterion("idProfesor <=", value, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorIn(List<Integer> values) {
            addCriterion("idProfesor in", values, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorNotIn(List<Integer> values) {
            addCriterion("idProfesor not in", values, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorBetween(Integer value1, Integer value2) {
            addCriterion("idProfesor between", value1, value2, "idProfesor");
            return (Criteria) this;
        }

        public Criteria andIdProfesorNotBetween(Integer value1, Integer value2) {
            addCriterion("idProfesor not between", value1, value2, "idProfesor");
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

        public Criteria andDescuentoEqualTo(Boolean value) {
            addCriterion("descuento =", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotEqualTo(Boolean value) {
            addCriterion("descuento <>", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThan(Boolean value) {
            addCriterion("descuento >", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("descuento >=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThan(Boolean value) {
            addCriterion("descuento <", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThanOrEqualTo(Boolean value) {
            addCriterion("descuento <=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIn(List<Boolean> values) {
            addCriterion("descuento in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotIn(List<Boolean> values) {
            addCriterion("descuento not in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoBetween(Boolean value1, Boolean value2) {
            addCriterion("descuento between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("descuento not between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("createdAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("createdAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("createdAt =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("createdAt <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("createdAt >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("createdAt >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("createdAt <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("createdAt <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("createdAt in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("createdAt not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("createdAt between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("createdAt not between", value1, value2, "createdAt");
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