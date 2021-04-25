package by.lukyanets.shape.repo;

import java.util.List;

public interface Repository<E, ID> {
    void delete(E entity);

    void deleteAll(List<E> entities);

    void add(E entity);

    void addAll(List<E> entities);

    E findById(ID id);
}
