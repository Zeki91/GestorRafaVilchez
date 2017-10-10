package com.rafavilchez.services;

import com.rafavilchez.model.AsignaturaBase;
import com.rafavilchez.model.impl.Asignatura;
import com.rafavilchez.persistence.impl.AsignaturaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class AsignaturaService {

    @Autowired 
    AsignaturaMapper asignaturaMapper;


    public List<Asignatura> getAll() {

        return asignaturaMapper.getAll();
    }


    public Asignatura getById(int idAsignatura) {

        Asignatura asignatura = asignaturaMapper.getAsignaturaPorId(idAsignatura);
        return asignatura == null ? null : asignatura;

    }

    public List<Asignatura> getHistoricoAsignaturas() {

        List<AsignaturaBase> listBase = asignaturaMapper.selectByExample(null);
        List<Asignatura> list = new ArrayList<>();

        for(AsignaturaBase a : listBase) {
            list.add(new Asignatura(a));
        }

        return list;
    }

    public int update (Asignatura asignatura) {
        return asignaturaMapper.updateByPrimaryKey(asignatura);
    }


    public int insert (Asignatura asignatura) {
        return asignaturaMapper.insert(asignatura);
    }

}
