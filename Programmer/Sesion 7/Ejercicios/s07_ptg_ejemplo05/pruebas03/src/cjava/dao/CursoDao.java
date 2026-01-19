/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao;

import cjava.beans.Curso;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface CursoDao extends EntidadDao<Curso>{
    public List<Curso> orderByNombre();
    public List<Curso> filterByCreditos(int min, int max);
}
