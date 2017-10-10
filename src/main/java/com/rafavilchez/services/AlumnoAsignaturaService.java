package com.rafavilchez.services;

import com.rafavilchez.model.AlumnoAsignaturaBase;
import com.rafavilchez.model.AlumnoAsignaturaBaseExample;
import com.rafavilchez.model.impl.Alumno;
import com.rafavilchez.model.impl.AlumnoAsignatura;
import com.rafavilchez.model.impl.Recibo;
import com.rafavilchez.persistence.impl.AlumnoAsignaturaMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AlumnoAsignaturaService {

    @Autowired
    AlumnoAsignaturaMapper alumnoAsignaturaMapper;

    @Autowired
    DescuentosAlumnosService descuentosAlumnosService;

    public List<AlumnoAsignatura> getAll () {
        List<AlumnoAsignaturaBase> listBase = alumnoAsignaturaMapper.selectByExample(null);
        List<AlumnoAsignatura> list = new ArrayList<>();

        for(AlumnoAsignaturaBase aa : listBase) {
            list.add(new AlumnoAsignatura(aa));
        }

        return list;
    }

    public AlumnoAsignatura getPorId (Integer id) {
        AlumnoAsignaturaBase asb = alumnoAsignaturaMapper.selectByPrimaryKey(id);
        return asb != null ? new AlumnoAsignatura(asb) : null;
    }

    public List<AlumnoAsignatura> getPorIdAlumno(int idAlumno) {
        return alumnoAsignaturaMapper.getPorIdAlumno(idAlumno);
    }

    public List<AlumnoAsignatura> getPorIdAsignatura(int idAsignatura) {
        return alumnoAsignaturaMapper.getPorIdAsignatura(idAsignatura);
    }

    public AlumnoAsignatura getPorIdAsignaturaAndIdAlumno (int idAsignatura, int idAlumno) {
        return alumnoAsignaturaMapper.getPorIdAsignaturaAndIdAlumno(idAsignatura, idAlumno);
    }

    public List<Alumno> getAlumnosMatriculados (int idAsignatura) {
        return alumnoAsignaturaMapper.getAlumnosMatriculados(idAsignatura);
    }

    public int desmatricularAsignatura (int idAsignatura, int idAlumno) {
        AlumnoAsignatura aa = getPorIdAsignaturaAndIdAlumno(idAsignatura, idAlumno);
        aa.setFecha_fin(new Date());
        return update(aa);
    }

    public boolean tieneAsignaturasMatriculadas(int idAlumno) {
        return !getPorIdAlumno(idAlumno).isEmpty();
    }

    public void marcarMatriculaModificada (int idAsignatura) {
        List<AlumnoAsignatura> lista = getPorIdAsignatura(idAsignatura);

        for (AlumnoAsignatura aa : lista) {
            aa.setFechaMod(new Date());
            update(aa);
        }
    }

    public void desmatricularAlumnos (int idAsignatura) {
        alumnoAsignaturaMapper.desmatricularAlumnos(idAsignatura);
    }

    public int insert (AlumnoAsignatura p) {
        return alumnoAsignaturaMapper.insert(p);
    }

    public int update (AlumnoAsignatura p) {
        return alumnoAsignaturaMapper.updateByPrimaryKey(p);
    }

    public int delete (AlumnoAsignatura p) { return alumnoAsignaturaMapper.deleteByPrimaryKey(p.getId()); }

}
