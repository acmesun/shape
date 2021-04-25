package by.lukyanets.shape.repo.impl;

import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.repo.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ShapeRepository<E extends ShapeEntity> implements Repository<E, Integer> {
    private final Map<Integer, E> data = new HashMap<>();

    @Override
    public void delete(E entity) {
        data.remove(entity.getId());
    }

    @Override
    public void deleteAll(List<E> shapeEntities) {
        shapeEntities.forEach(this::delete);
    }

    @Override
    public void add(E entity) {
        data.put(entity.getId(), entity);
    }

    @Override
    public void addAll(List<E> shapeEntities) {
        shapeEntities.forEach(this::add);
    }

    @Override
    public E findById(Integer id) {
        return data.get(id);
    }

    protected Map<Integer, E> getData() {
        return data;
    }
}
