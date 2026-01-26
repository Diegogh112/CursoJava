package com.cjava.escuelapp.servicio;

import com.cjava.escuelapp.modelo.entidades.Curso;

import java.util.List;

public interface CursoService {
    public void grabar(Curso curso);
    public List<Curso> listar();
    public void eliminar(String id);
    public void actualizar(Curso curso);

}
