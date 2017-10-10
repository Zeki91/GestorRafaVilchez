package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.List;

public class DescuentosAlumnosBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DescuentosAlumnosBaseExample() {
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

        public Criteria andIdDescuentoIsNull() {
            addCriterion("idDescuento is null");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoIsNotNull() {
            addCriterion("idDescuento is not null");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoEqualTo(Integer value) {
            addCriterion("idDescuento =", value, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoNotEqualTo(Integer value) {
            addCriterion("idDescuento <>", value, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoGreaterThan(Integer value) {
            addCriterion("idDescuento >", value, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("idDescuento >=", value, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoLessThan(Integer value) {
            addCriterion("idDescuento <", value, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoLessThanOrEqualTo(Integer value) {
            addCriterion("idDescuento <=", value, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoIn(List<Integer> values) {
            addCriterion("idDescuento in", values, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoNotIn(List<Integer> values) {
            addCriterion("idDescuento not in", values, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoBetween(Integer value1, Integer value2) {
            addCriterion("idDescuento between", value1, value2, "idDescuento");
            return (Criteria) this;
        }

        public Criteria andIdDescuentoNotBetween(Integer value1, Integer value2) {
            addCriterion("idDescuento not between", value1, value2, "idDescuento");
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

        public Criteria andActivoIsNull() {
            addCriterion("activo is null");
            return (Criteria) this;
        }

        public Criteria andActivoIsNotNull() {
            addCriterion("activo is not null");
            return (Criteria) this;
        }

        public Criteria andActivoEqualTo(Boolean value) {
            addCriterion("activo =", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotEqualTo(Boolean value) {
            addCriterion("activo <>", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoGreaterThan(Boolean value) {
            addCriterion("activo >", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activo >=", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoLessThan(Boolean value) {
            addCriterion("activo <", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoLessThanOrEqualTo(Boolean value) {
            addCriterion("activo <=", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoIn(List<Boolean> values) {
            addCriterion("activo in", values, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotIn(List<Boolean> values) {
            addCriterion("activo not in", values, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoBetween(Boolean value1, Boolean value2) {
            addCriterion("activo between", value1, value2, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activo not between", value1, value2, "activo");
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

        public Criteria andPorcentajeIsNull() {
            addCriterion("porcentaje is null");
            return (Criteria) this;
        }

        public Criteria andPorcentajeIsNotNull() {
            addCriterion("porcentaje is not null");
            return (Criteria) this;
        }

        public Criteria andPorcentajeEqualTo(Float value) {
            addCriterion("porcentaje =", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeNotEqualTo(Float value) {
            addCriterion("porcentaje <>", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeGreaterThan(Float value) {
            addCriterion("porcentaje >", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeGreaterThanOrEqualTo(Float value) {
            addCriterion("porcentaje >=", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeLessThan(Float value) {
            addCriterion("porcentaje <", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeLessThanOrEqualTo(Float value) {
            addCriterion("porcentaje <=", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeIn(List<Float> values) {
            addCriterion("porcentaje in", values, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeNotIn(List<Float> values) {
            addCriterion("porcentaje not in", values, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeBetween(Float value1, Float value2) {
            addCriterion("porcentaje between", value1, value2, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeNotBetween(Float value1, Float value2) {
            addCriterion("porcentaje not between", value1, value2, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andReferidoPorIsNull() {
            addCriterion("referidoPor is null");
            return (Criteria) this;
        }

        public Criteria andReferidoPorIsNotNull() {
            addCriterion("referidoPor is not null");
            return (Criteria) this;
        }

        public Criteria andReferidoPorEqualTo(Integer value) {
            addCriterion("referidoPor =", value, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorNotEqualTo(Integer value) {
            addCriterion("referidoPor <>", value, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorGreaterThan(Integer value) {
            addCriterion("referidoPor >", value, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorGreaterThanOrEqualTo(Integer value) {
            addCriterion("referidoPor >=", value, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorLessThan(Integer value) {
            addCriterion("referidoPor <", value, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorLessThanOrEqualTo(Integer value) {
            addCriterion("referidoPor <=", value, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorIn(List<Integer> values) {
            addCriterion("referidoPor in", values, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorNotIn(List<Integer> values) {
            addCriterion("referidoPor not in", values, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorBetween(Integer value1, Integer value2) {
            addCriterion("referidoPor between", value1, value2, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andReferidoPorNotBetween(Integer value1, Integer value2) {
            addCriterion("referidoPor not between", value1, value2, "referidoPor");
            return (Criteria) this;
        }

        public Criteria andRefiereAIsNull() {
            addCriterion("refiereA is null");
            return (Criteria) this;
        }

        public Criteria andRefiereAIsNotNull() {
            addCriterion("refiereA is not null");
            return (Criteria) this;
        }

        public Criteria andRefiereAEqualTo(Integer value) {
            addCriterion("refiereA =", value, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereANotEqualTo(Integer value) {
            addCriterion("refiereA <>", value, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereAGreaterThan(Integer value) {
            addCriterion("refiereA >", value, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereAGreaterThanOrEqualTo(Integer value) {
            addCriterion("refiereA >=", value, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereALessThan(Integer value) {
            addCriterion("refiereA <", value, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereALessThanOrEqualTo(Integer value) {
            addCriterion("refiereA <=", value, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereAIn(List<Integer> values) {
            addCriterion("refiereA in", values, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereANotIn(List<Integer> values) {
            addCriterion("refiereA not in", values, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereABetween(Integer value1, Integer value2) {
            addCriterion("refiereA between", value1, value2, "refiereA");
            return (Criteria) this;
        }

        public Criteria andRefiereANotBetween(Integer value1, Integer value2) {
            addCriterion("refiereA not between", value1, value2, "refiereA");
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