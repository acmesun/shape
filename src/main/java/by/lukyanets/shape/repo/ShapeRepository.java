package by.lukyanets.shape.repo;

import by.lukyanets.shape.entity.ShapeEntity;

import java.util.List;

public interface ShapeRepository {
    void addShape(ShapeEntity entity);

    void addAllShapesInTheList(List<ShapeEntity> entities);

    void delete(ShapeEntity entity);

    void deleteAllShapesInTheList(List<ShapeEntity> entities);

    ShapeEntity findEntityById(long id);

    ShapeEntity findEntityByName(String name);




}
