package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProfesorBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfesorBaseExample() {
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

        public Criteria andApellidosIsNull() {
            addCriterion("apellidos is null");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNotNull() {
            addCriterion("apellidos is not null");
            return (Criteria) this;
        }

        public Criteria andApellidosEqualTo(String value) {
            addCriterion("apellidos =", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotEqualTo(String value) {
            addCriterion("apellidos <>", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThan(String value) {
            addCriterion("apellidos >", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("apellidos >=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThan(String value) {
            addCriterion("apellidos <", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThanOrEqualTo(String value) {
            addCriterion("apellidos <=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLike(String value) {
            addCriterion("apellidos like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotLike(String value) {
            addCriterion("apellidos not like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosIn(List<String> values) {
            addCriterion("apellidos in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotIn(List<String> values) {
            addCriterion("apellidos not in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosBetween(String value1, String value2) {
            addCriterion("apellidos between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotBetween(String value1, String value2) {
            addCriterion("apellidos not between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoIsNull() {
            addCriterion("fechaNacimiento is null");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoIsNotNull() {
            addCriterion("fechaNacimiento is not null");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoEqualTo(Date value) {
            addCriterionForJDBCDate("fechaNacimiento =", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaNacimiento <>", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaNacimiento >", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaNacimiento >=", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoLessThan(Date value) {
            addCriterionForJDBCDate("fechaNacimiento <", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaNacimiento <=", value, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoIn(List<Date> values) {
            addCriterionForJDBCDate("fechaNacimiento in", values, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaNacimiento not in", values, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaNacimiento between", value1, value2, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andFechaNacimientoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaNacimiento not between", value1, value2, "fechaNacimiento");
            return (Criteria) this;
        }

        public Criteria andSueldoIsNull() {
            addCriterion("sueldo is null");
            return (Criteria) this;
        }

        public Criteria andSueldoIsNotNull() {
            addCriterion("sueldo is not null");
            return (Criteria) this;
        }

        public Criteria andSueldoEqualTo(Float value) {
            addCriterion("sueldo =", value, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoNotEqualTo(Float value) {
            addCriterion("sueldo <>", value, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoGreaterThan(Float value) {
            addCriterion("sueldo >", value, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoGreaterThanOrEqualTo(Float value) {
            addCriterion("sueldo >=", value, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoLessThan(Float value) {
            addCriterion("sueldo <", value, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoLessThanOrEqualTo(Float value) {
            addCriterion("sueldo <=", value, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoIn(List<Float> values) {
            addCriterion("sueldo in", values, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoNotIn(List<Float> values) {
            addCriterion("sueldo not in", values, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoBetween(Float value1, Float value2) {
            addCriterion("sueldo between", value1, value2, "sueldo");
            return (Criteria) this;
        }

        public Criteria andSueldoNotBetween(Float value1, Float value2) {
            addCriterion("sueldo not between", value1, value2, "sueldo");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNull() {
            addCriterion("telefono is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("telefono is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(String value) {
            addCriterion("telefono =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(String value) {
            addCriterion("telefono <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(String value) {
            addCriterion("telefono >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("telefono >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(String value) {
            addCriterion("telefono <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(String value) {
            addCriterion("telefono <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLike(String value) {
            addCriterion("telefono like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotLike(String value) {
            addCriterion("telefono not like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<String> values) {
            addCriterion("telefono in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<String> values) {
            addCriterion("telefono not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(String value1, String value2) {
            addCriterion("telefono between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(String value1, String value2) {
            addCriterion("telefono not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaIsNull() {
            addCriterion("cuentaBancaria is null");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaIsNotNull() {
            addCriterion("cuentaBancaria is not null");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaEqualTo(String value) {
            addCriterion("cuentaBancaria =", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaNotEqualTo(String value) {
            addCriterion("cuentaBancaria <>", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaGreaterThan(String value) {
            addCriterion("cuentaBancaria >", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaGreaterThanOrEqualTo(String value) {
            addCriterion("cuentaBancaria >=", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaLessThan(String value) {
            addCriterion("cuentaBancaria <", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaLessThanOrEqualTo(String value) {
            addCriterion("cuentaBancaria <=", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaLike(String value) {
            addCriterion("cuentaBancaria like", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaNotLike(String value) {
            addCriterion("cuentaBancaria not like", value, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaIn(List<String> values) {
            addCriterion("cuentaBancaria in", values, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaNotIn(List<String> values) {
            addCriterion("cuentaBancaria not in", values, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaBetween(String value1, String value2) {
            addCriterion("cuentaBancaria between", value1, value2, "cuentaBancaria");
            return (Criteria) this;
        }

        public Criteria andCuentaBancariaNotBetween(String value1, String value2) {
            addCriterion("cuentaBancaria not between", value1, value2, "cuentaBancaria");
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