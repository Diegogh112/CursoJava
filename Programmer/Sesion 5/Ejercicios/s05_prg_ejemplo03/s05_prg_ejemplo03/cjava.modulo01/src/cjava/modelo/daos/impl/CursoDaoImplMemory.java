package cjava.modelo.daos.impl;

import cjava.modelo.daos.CursoDao;
import cjava.modelo.entidades.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoDaoImplMemory implements CursoDao {
    private List<Curso> lista;

    public CursoDaoImplMemory() {
        lista = new ArrayList<>();
    }

    @Override
    public List<Curso> findAll() {
        return lista;
    }

    @Override
    public void create(Curso curso) {
        lista.add(curso);
    }

    @Override
    public void update(Curso curso) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Curso findById(int id) {
        return null;
    }
}
