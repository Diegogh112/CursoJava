package cjava.servicios;

import cjava.modelo.entidades.Curso;

import java.util.List;

public interface CursoService {
    public List<Curso> listar();
    public void grabar (Curso curso);
}
