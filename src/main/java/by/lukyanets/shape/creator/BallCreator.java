package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.BallService;

public class BallCreator extends ShapeCreator {
    @Override
    protected ShapeEntity createShape(int id, double... params) throws ShapeException {
        if (params.length < 4) {
            throw new ShapeException("Cannot create " + BallService.class + ". Not enough parameters!");
        }
        return new BallEntity(id, params[0], params[1], params[2], params[3]);
    }
}
