package com.rafavilchez.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlumnoBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlumnoBaseExample() {
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNifIsNull() {
            addCriterion("nif is null");
            return (Criteria) this;
        }

        public Criteria andNifIsNotNull() {
            addCriterion("nif is not null");
            return (Criteria) this;
        }

        public Criteria andNifEqualTo(String value) {
            addCriterion("nif =", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifNotEqualTo(String value) {
            addCriterion("nif <>", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifGreaterThan(String value) {
            addCriterion("nif >", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifGreaterThanOrEqualTo(String value) {
            addCriterion("nif >=", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifLessThan(String value) {
            addCriterion("nif <", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifLessThanOrEqualTo(String value) {
            addCriterion("nif <=", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifLike(String value) {
            addCriterion("nif like", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifNotLike(String value) {
            addCriterion("nif not like", value, "nif");
            return (Criteria) this;
        }

        public Criteria andNifIn(List<String> values) {
            addCriterion("nif in", values, "nif");
            return (Criteria) this;
        }

        public Criteria andNifNotIn(List<String> values) {
            addCriterion("nif not in", values, "nif");
            return (Criteria) this;
        }

        public Criteria andNifBetween(String value1, String value2) {
            addCriterion("nif between", value1, value2, "nif");
            return (Criteria) this;
        }

        public Criteria andNifNotBetween(String value1, String value2) {
            addCriterion("nif not between", value1, value2, "nif");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNull() {
            addCriterion("direccion is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("direccion is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("direccion =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("direccion <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("direccion >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("direccion >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("direccion <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("direccion <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("direccion like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("direccion not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("direccion in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("direccion not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("direccion between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("direccion not between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andCpIsNull() {
            addCriterion("cp is null");
            return (Criteria) this;
        }

        public Criteria andCpIsNotNull() {
            addCriterion("cp is not null");
            return (Criteria) this;
        }

        public Criteria andCpEqualTo(String value) {
            addCriterion("cp =", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpNotEqualTo(String value) {
            addCriterion("cp <>", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpGreaterThan(String value) {
            addCriterion("cp >", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpGreaterThanOrEqualTo(String value) {
            addCriterion("cp >=", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpLessThan(String value) {
            addCriterion("cp <", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpLessThanOrEqualTo(String value) {
            addCriterion("cp <=", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpLike(String value) {
            addCriterion("cp like", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpNotLike(String value) {
            addCriterion("cp not like", value, "cp");
            return (Criteria) this;
        }

        public Criteria andCpIn(List<String> values) {
            addCriterion("cp in", values, "cp");
            return (Criteria) this;
        }

        public Criteria andCpNotIn(List<String> values) {
            addCriterion("cp not in", values, "cp");
            return (Criteria) this;
        }

        public Criteria andCpBetween(String value1, String value2) {
            addCriterion("cp between", value1, value2, "cp");
            return (Criteria) this;
        }

        public Criteria andCpNotBetween(String value1, String value2) {
            addCriterion("cp not between", value1, value2, "cp");
            return (Criteria) this;
        }

        public Criteria andPoblacionIsNull() {
            addCriterion("poblacion is null");
            return (Criteria) this;
        }

        public Criteria andPoblacionIsNotNull() {
            addCriterion("poblacion is not null");
            return (Criteria) this;
        }

        public Criteria andPoblacionEqualTo(String value) {
            addCriterion("poblacion =", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionNotEqualTo(String value) {
            addCriterion("poblacion <>", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionGreaterThan(String value) {
            addCriterion("poblacion >", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionGreaterThanOrEqualTo(String value) {
            addCriterion("poblacion >=", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionLessThan(String value) {
            addCriterion("poblacion <", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionLessThanOrEqualTo(String value) {
            addCriterion("poblacion <=", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionLike(String value) {
            addCriterion("poblacion like", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionNotLike(String value) {
            addCriterion("poblacion not like", value, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionIn(List<String> values) {
            addCriterion("poblacion in", values, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionNotIn(List<String> values) {
            addCriterion("poblacion not in", values, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionBetween(String value1, String value2) {
            addCriterion("poblacion between", value1, value2, "poblacion");
            return (Criteria) this;
        }

        public Criteria andPoblacionNotBetween(String value1, String value2) {
            addCriterion("poblacion not between", value1, value2, "poblacion");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNull() {
            addCriterion("provincia is null");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNotNull() {
            addCriterion("provincia is not null");
            return (Criteria) this;
        }

        public Criteria andProvinciaEqualTo(String value) {
            addCriterion("provincia =", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotEqualTo(String value) {
            addCriterion("provincia <>", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThan(String value) {
            addCriterion("provincia >", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("provincia >=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThan(String value) {
            addCriterion("provincia <", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThanOrEqualTo(String value) {
            addCriterion("provincia <=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLike(String value) {
            addCriterion("provincia like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotLike(String value) {
            addCriterion("provincia not like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaIn(List<String> values) {
            addCriterion("provincia in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotIn(List<String> values) {
            addCriterion("provincia not in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaBetween(String value1, String value2) {
            addCriterion("provincia between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotBetween(String value1, String value2) {
            addCriterion("provincia not between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andRrssIsNull() {
            addCriterion("rrss is null");
            return (Criteria) this;
        }

        public Criteria andRrssIsNotNull() {
            addCriterion("rrss is not null");
            return (Criteria) this;
        }

        public Criteria andRrssEqualTo(Boolean value) {
            addCriterion("rrss =", value, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssNotEqualTo(Boolean value) {
            addCriterion("rrss <>", value, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssGreaterThan(Boolean value) {
            addCriterion("rrss >", value, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rrss >=", value, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssLessThan(Boolean value) {
            addCriterion("rrss <", value, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssLessThanOrEqualTo(Boolean value) {
            addCriterion("rrss <=", value, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssIn(List<Boolean> values) {
            addCriterion("rrss in", values, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssNotIn(List<Boolean> values) {
            addCriterion("rrss not in", values, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssBetween(Boolean value1, Boolean value2) {
            addCriterion("rrss between", value1, value2, "rrss");
            return (Criteria) this;
        }

        public Criteria andRrssNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rrss not between", value1, value2, "rrss");
            return (Criteria) this;
        }

        public Criteria andVulebuIsNull() {
            addCriterion("vulebu is null");
            return (Criteria) this;
        }

        public Criteria andVulebuIsNotNull() {
            addCriterion("vulebu is not null");
            return (Criteria) this;
        }

        public Criteria andVulebuEqualTo(Boolean value) {
            addCriterion("vulebu =", value, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuNotEqualTo(Boolean value) {
            addCriterion("vulebu <>", value, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuGreaterThan(Boolean value) {
            addCriterion("vulebu >", value, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("vulebu >=", value, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuLessThan(Boolean value) {
            addCriterion("vulebu <", value, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuLessThanOrEqualTo(Boolean value) {
            addCriterion("vulebu <=", value, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuIn(List<Boolean> values) {
            addCriterion("vulebu in", values, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuNotIn(List<Boolean> values) {
            addCriterion("vulebu not in", values, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuBetween(Boolean value1, Boolean value2) {
            addCriterion("vulebu between", value1, value2, "vulebu");
            return (Criteria) this;
        }

        public Criteria andVulebuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("vulebu not between", value1, value2, "vulebu");
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