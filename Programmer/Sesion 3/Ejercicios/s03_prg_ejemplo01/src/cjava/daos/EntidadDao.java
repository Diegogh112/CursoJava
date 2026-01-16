package cjava.daos;

import java.util.List;

/**
 *
 * @author emaravi
 * @param <T>
 * @param <V>
 */
public interface EntidadDao<T,V> {
    public void create(T t);
    
    public T find(V v);
    public List<T> findAll();
    
    public void update(T t);
    public void delete(V v);
    
    
}
