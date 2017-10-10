package com.rafavilchez.services;

import com.rafavilchez.model.AlumnoBase;
import com.rafavilchez.model.AlumnoBaseExample;
import com.rafavilchez.model.impl.Alumno;
import com.rafavilchez.persistence.impl.AlumnoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoMapper alumnoMapper;


    public List<Alumno> getAll() {
        return alumnoMapper.getAll();
    }

    public List<Alumno> getFiltered(String filtroNombre, Integer filtroAsignatura) {
        return alumnoMapper.getFiltered(filtroNombre, filtroAsignatura);
    }

    public List<Alumno> selectByExample(AlumnoBaseExample a) {
        List<AlumnoBase> listBase = alumnoMapper.selectByExample(a);
        List<Alumno> list = new ArrayList<>();

        for(AlumnoBase ab : listBase) {
            list.add(new Alumno(ab));
        }

        return list;
    }


    public Alumno getById(Integer idAlumno) {

        Alumno alumno = alumnoMapper.getAlumnoPorId(idAlumno);
        return alumno == null ? null : alumno;

    }

    public Alumno getAlumnoPorNIF (String nif) {
        Alumno alumno = alumnoMapper.getAlumnoPorNIF(nif);
        return alumno == null ? null : alumno;
    }

    public List<Alumno> getRestoAlumnos (Integer idAlumno) {
        List<Alumno> resto = alumnoMapper.getAllOthers(idAlumno);
        return resto == null ? null : resto;
    }

    public int update (Alumno alumno) {
        return alumnoMapper.updateByPrimaryKey(alumno);
    }

    public int insert (Alumno alumno) {
        return alumnoMapper.insert(alumno);
    }

    public int delete (Alumno alumno) { return alumnoMapper.desactivarAlumno(alumno.getIdAlumno()); }

}
