package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;

public class PointCreator extends ShapeCreator {
    private static final int NUMBER_OF_PARAMETERS = 3;

    @Override
    protected ShapeEntity createShape(int id, double... params) throws ShapeException {
        if (params.length != NUMBER_OF_PARAMETERS) {
            throw new ShapeException("Cannot create " + PointEntity.class + ". Not enough parameters!");
        }
        PointEntity pointEntity = new PointEntity(id, params[0], params[1], params[2]);
        return pointEntity;
    }

}
