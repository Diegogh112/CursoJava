package cjava.servicios;

import cjava.modelo.daos.CursoDao;
import cjava.modelo.daos.DaoFactory;
import cjava.modelo.entidades.Curso;
import cjava.util.Util;

import java.util.List;

public class CursoServiceImpl implements CursoService{
    private CursoDao dao;

    public CursoServiceImpl() {
        dao = DaoFactory.getCursoDao(Util.opc);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }

    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }
}
