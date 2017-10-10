package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AlumnoAsignaturaBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlumnoAsignaturaBaseExample() {
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

        public Criteria andFecha_inicioIsNull() {
            addCriterion("fecha_inicio is null");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioIsNotNull() {
            addCriterion("fecha_inicio is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio =", value, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio <>", value, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha_inicio >", value, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio >=", value, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioLessThan(Date value) {
            addCriterionForJDBCDate("fecha_inicio <", value, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio <=", value, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_inicio in", values, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_inicio not in", values, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_inicio between", value1, value2, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_inicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_inicio not between", value1, value2, "fecha_inicio");
            return (Criteria) this;
        }

        public Criteria andFecha_finIsNull() {
            addCriterion("fecha_fin is null");
            return (Criteria) this;
        }

        public Criteria andFecha_finIsNotNull() {
            addCriterion("fecha_fin is not null");
            return (Criteria) this;
        }

        public Criteria andFecha_finEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_fin =", value, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_fin <>", value, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha_fin >", value, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_fin >=", value, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finLessThan(Date value) {
            addCriterionForJDBCDate("fecha_fin <", value, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_fin <=", value, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_fin in", values, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_fin not in", values, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_fin between", value1, value2, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andFecha_finNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_fin not between", value1, value2, "fecha_fin");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoIsNull() {
            addCriterion("importeEditado is null");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoIsNotNull() {
            addCriterion("importeEditado is not null");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoEqualTo(Float value) {
            addCriterion("importeEditado =", value, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoNotEqualTo(Float value) {
            addCriterion("importeEditado <>", value, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoGreaterThan(Float value) {
            addCriterion("importeEditado >", value, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoGreaterThanOrEqualTo(Float value) {
            addCriterion("importeEditado >=", value, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoLessThan(Float value) {
            addCriterion("importeEditado <", value, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoLessThanOrEqualTo(Float value) {
            addCriterion("importeEditado <=", value, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoIn(List<Float> values) {
            addCriterion("importeEditado in", values, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoNotIn(List<Float> values) {
            addCriterion("importeEditado not in", values, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoBetween(Float value1, Float value2) {
            addCriterion("importeEditado between", value1, value2, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andImporteEditadoNotBetween(Float value1, Float value2) {
            addCriterion("importeEditado not between", value1, value2, "importeEditado");
            return (Criteria) this;
        }

        public Criteria andFechaModIsNull() {
            addCriterion("fechaMod is null");
            return (Criteria) this;
        }

        public Criteria andFechaModIsNotNull() {
            addCriterion("fechaMod is not null");
            return (Criteria) this;
        }

        public Criteria andFechaModEqualTo(Date value) {
            addCriterionForJDBCDate("fechaMod =", value, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaMod <>", value, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaMod >", value, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaMod >=", value, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModLessThan(Date value) {
            addCriterionForJDBCDate("fechaMod <", value, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaMod <=", value, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModIn(List<Date> values) {
            addCriterionForJDBCDate("fechaMod in", values, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaMod not in", values, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaMod between", value1, value2, "fechaMod");
            return (Criteria) this;
        }

        public Criteria andFechaModNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaMod not between", value1, value2, "fechaMod");
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

        public Criteria andObservacionesEqualTo(Date value) {
            addCriterionForJDBCDate("observaciones =", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotEqualTo(Date value) {
            addCriterionForJDBCDate("observaciones <>", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesGreaterThan(Date value) {
            addCriterionForJDBCDate("observaciones >", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("observaciones >=", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLessThan(Date value) {
            addCriterionForJDBCDate("observaciones <", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("observaciones <=", value, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesIn(List<Date> values) {
            addCriterionForJDBCDate("observaciones in", values, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotIn(List<Date> values) {
            addCriterionForJDBCDate("observaciones not in", values, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("observaciones between", value1, value2, "observaciones");
            return (Criteria) this;
        }

        public Criteria andObservacionesNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("observaciones not between", value1, value2, "observaciones");
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