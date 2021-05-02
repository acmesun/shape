package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;

public class BallCreator extends ShapeCreator {

    @Override
    protected ShapeEntity createShape(Integer id, Double... params) {
        return new BallEntity(id, params[0], params[1], params[2], params[3]);
    }

}
