package com.cjava.escuelapp.servicio.impl;

import com.cjava.escuelapp.modelo.daos.CursoDao;
import com.cjava.escuelapp.modelo.daos.impl.DaoFactory;
import com.cjava.escuelapp.modelo.entidades.Curso;
import com.cjava.escuelapp.servicio.CursoService;
import com.cjava.escuelapp.util.Util;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    CursoDao dao;

    public CursoServiceImpl() {
        dao = DaoFactory.getInstance().getCursoDao(Util.opc2);
    }
    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }

    @Override
    public void eliminar(String id) {
        dao.delete(id);
    }

    @Override
    public void actualizar(Curso curso) {
        dao.update(curso);
    }

}
