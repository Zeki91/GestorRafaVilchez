package com.rafavilchez.services;

import com.rafavilchez.model.HorasExtraBase;
import com.rafavilchez.model.impl.HorasExtra;
import com.rafavilchez.persistence.impl.HorasExtraMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HorasExtraService {

    @Autowired
    HorasExtraMapper horasExtraMapper;

    public List<HorasExtra> getAll() {
        List<HorasExtraBase> horasExtraBase = horasExtraMapper.selectByExample(null);
        List<HorasExtra> horasExtra = new ArrayList<>();

        if (horasExtraBase != null) {
            for (HorasExtraBase he : horasExtraBase) {
                horasExtra.add(new HorasExtra(he));
            }
        }

        return horasExtra;

    }

    public HorasExtra getPorId(int id) {
        HorasExtraBase heb = horasExtraMapper.getPorId(id);
        return heb == null ? null : new HorasExtra(heb);
    }

    public List<HorasExtra> getPorIdAlumno (Integer idAlumno) {
        return horasExtraMapper.getPorIdAlumno(idAlumno);
    }

    public List<HorasExtra> getPorIdAsignatura (Integer idAsignatura) {
        return horasExtraMapper.getPorIdAsignatura(idAsignatura);
    }

    public HorasExtra getPorIdAlumnoIdAsignatura (Integer idAlumno, Integer idAsignatura) {
        return horasExtraMapper.getPorIdAlumnoIdAsignatura(idAlumno, idAsignatura);
    }

    public int insert (HorasExtra he) { return horasExtraMapper.insert(he); }

    public int update (HorasExtra he) { return horasExtraMapper.updateByPrimaryKey(he); }

    public int delete (HorasExtra he) { return horasExtraMapper.deleteByPrimaryKey(he.getId()); }

}
