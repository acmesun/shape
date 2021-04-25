package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;

public class PointCreator extends ShapeCreator {
    @Override
    protected ShapeEntity createShape(int id, double... params) throws ShapeException {
        if (params.length < 3) {
            throw new ShapeException("Cannot create " + PointEntity.class + ". Not enough parameters!");
        }
        return new PointEntity(id, params[0], params[1], params[2]);
    }
}
