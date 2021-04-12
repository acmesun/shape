package by.lukyanets.shape.service;

import by.lukyanets.shape.entity.BallEntity;

public interface BallService {
    double findBallArea(BallEntity ballEntity);
    double findBallVolume(BallEntity ballEntity);
    double findVolumeRatio();
    boolean isItBall(Object object);
    boolean isBallTouchingCoordinateLines(BallEntity ballEntity);
}
