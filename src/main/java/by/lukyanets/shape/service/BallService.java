package by.lukyanets.shape.service;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.exception.ShapeException;

public interface BallService {
    double findBallArea(BallEntity ballEntity);
    double findBallVolume(BallEntity ballEntity);
    double findVolumeRatio(BallEntity ballEntity, PointEntity pointEntity) throws ShapeException;
    boolean isItBall(Object object);
    boolean isBallTouchingCoordinateLines(BallEntity ballEntity);
}
