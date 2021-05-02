package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.entity.ShapeEntity;

public class PointCreator extends ShapeCreator {

    @Override
    protected ShapeEntity createShape(Integer id, Double... params) {
        return new PointEntity(id, params[0], params[1], params[2]);
    }

}
