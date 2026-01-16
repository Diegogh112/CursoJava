package cjava.daos;

import cjava.beans.Curso;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface CursoDao extends EntidadDao<Curso,String>{
    
    public List<Curso> findAllOrderByName(boolean order);
    public List<Curso> filterByCredits(int min, int max);
    
}
