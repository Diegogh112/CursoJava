/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.daos;

import cjava.beans.Profesor;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface ProfesorDao  extends EntidadDao<Profesor,Integer > {
    
    public List<Profesor> orderBySueldo();
    
}
