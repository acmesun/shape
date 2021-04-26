package by.lukyanets.shape.service;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;

public interface BallService {
    double findBallArea(BallEntity ballEntity) throws ShapeException;

    double findBallVolume(BallEntity ballEntity) throws ShapeException;

    boolean isItBall(Object object) throws ShapeException;

    boolean isBallTouchingCoordinateLines(BallEntity ballEntity) throws ShapeException;
}
