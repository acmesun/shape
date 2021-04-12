package by.lukyanets.shape.service;

import by.lukyanets.shape.entity.BallEntity;

public class BallServiceImpl implements BallService {
    @Override
    public double findBallArea(BallEntity ballEntity) {
        double radius = ballEntity.getRadius();
        return 4 * Math.PI * Math.sqrt(radius);
    }

    @Override
    public double findBallVolume(BallEntity ballEntity) {
        double radius = ballEntity.getRadius();
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double findVolumeRatio() {
        return 0;
    }

    @Override
    public boolean isItBall(Object object) {
        return object instanceof BallEntity;
    }

    @Override
    public boolean isBallTouchingCoordinateLines(BallEntity ballEntity) {
        double radius = ballEntity.getRadius();
        double x = ballEntity.getDotEntity().getX();
        double y = ballEntity.getDotEntity().getY();
        double z = ballEntity.getDotEntity().getZ();
        return radius == x || radius == y || radius == z;
    }
}
