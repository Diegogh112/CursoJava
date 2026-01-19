package cjava.dao;

import java.util.List;

/**
 *
 * @author Profesor
 * @param <T>
 */
public abstract class AbstractEntity<T> {
    public abstract void create(T t);
    public abstract void update(T t);
    public abstract void delete(int id);
    public abstract T find(int id);
    public abstract List<T> findAll();
}
