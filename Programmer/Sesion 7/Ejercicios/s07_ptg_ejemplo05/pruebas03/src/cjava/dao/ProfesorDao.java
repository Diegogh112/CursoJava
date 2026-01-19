/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao;

import cjava.beans.Profesor;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface ProfesorDao extends EntidadDao<Profesor>{
    public List<Profesor> filterByCategoria(String cat);
    public List<Profesor> orderBySueldo();
    public List<Profesor> orderByNombre();
}
