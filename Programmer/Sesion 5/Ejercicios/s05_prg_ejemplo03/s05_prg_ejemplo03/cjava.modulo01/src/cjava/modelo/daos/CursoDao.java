package cjava.modelo.daos;

import cjava.modelo.entidades.Curso;

import java.util.List;

public interface CursoDao {
    public List<Curso> findAll();
    public void create(Curso curso);
    public void update(Curso curso);
    public void delete(int id);
    public Curso findById(int id);
}
