package cjava.daos;

import java.util.List;

/**
 * Esta es una interfaz generica que define metodos 
 * para todas las entidades.
 * @author emaravi
 * @param <T> tipo de entidad
 * @param <V> valor del id de la entidad
 * @since 17/11/2018
 * @version 0.00001
 */
public interface EntityDao <T,V>{
    public void create(T objEntidad);
    public void update(T objEntidad);
    public void remove(V id);
    public void find(V id);
    public List<T> findAll();
    public List<T> findByRange(int min,int max);
}
