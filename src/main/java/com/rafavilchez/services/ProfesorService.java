package com.rafavilchez.services;

import com.rafavilchez.model.ProfesorBase;
import com.rafavilchez.model.impl.Profesor;
import com.rafavilchez.persistence.impl.ProfesorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    ProfesorMapper profesorMapper;

    public List<Profesor> getAll () {
        List<ProfesorBase> listBase = profesorMapper.selectByExample(null);
        List<Profesor> list = new ArrayList<>();

        for(ProfesorBase p : listBase) {
            list.add(new Profesor(p));
        }

        return list;
    }

    public Profesor getById (int idProfesor) {
        ProfesorBase p = profesorMapper.selectByPrimaryKey(idProfesor);

        return p == null ? null : new Profesor(p);
    }

    public int insert (Profesor p) {
        return profesorMapper.insert(p);
    }

    public int update (Profesor p) {
        return profesorMapper.updateByPrimaryKey(p);
    }

}
