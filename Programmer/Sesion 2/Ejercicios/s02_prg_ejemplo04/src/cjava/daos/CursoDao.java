/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.daos;

import cjava.entidades.Curso;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface CursoDao extends EntityDao<Curso,String>{
    
    public List<Curso> filterByCredit(int min, int max);
}





















