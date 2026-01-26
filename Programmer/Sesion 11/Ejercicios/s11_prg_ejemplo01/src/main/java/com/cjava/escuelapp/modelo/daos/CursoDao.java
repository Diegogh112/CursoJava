package com.cjava.escuelapp.modelo.daos;



import com.cjava.escuelapp.modelo.entidades.Curso;

import java.util.List;

public interface CursoDao {
    public void create(Curso curso);
    public Curso find(String id);
    public List<Curso> findAll();
    public void update(Curso curso);
    public void delete(String id);
}
