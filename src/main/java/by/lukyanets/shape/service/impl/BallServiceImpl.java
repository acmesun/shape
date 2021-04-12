package by.lukyanets.shape.service.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.BallService;

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
    public double findVolumeRatio(BallEntity ballEntity, PointEntity point) throws ShapeException {
        double radius = ballEntity.getRadius();
        double pointX = point.getX();
        double pointY = point.getY();
        double pointZ = point.getZ();
        if (radius > pointX) {
            return calcRatio(radius, findHeight(radius, pointX), ballEntity);
        } else if (radius > pointY) {
            return calcRatio(radius, findHeight(radius, pointY), ballEntity);
        } else if (radius > pointZ) {
            return calcRatio(radius, findHeight(radius, pointZ), ballEntity);
        } else {
            throw new ShapeException("The ball does not intersect the coordinate planes.");
        }

    }

    private double findHeight(double radius, double coordinatePoint) {
        return radius - coordinatePoint;
    }


    private double calcRatio(double radius, double height, BallEntity ballEntity) {
        double volume = (Math.sqrt(height) * Math.PI) / 3 * (3 * radius - height);
        double fullVolume = findBallVolume(ballEntity);
        return volume / (fullVolume - volume);
    }

    @Override
    public boolean isItBall(Object object) {
        return object instanceof BallEntity;
    }

    @Override
    public boolean isBallTouchingCoordinateLines(BallEntity ballEntity) {
        double radius = ballEntity.getRadius();
        double x = ballEntity.getPointEntity().getX();
        double y = ballEntity.getPointEntity().getY();
        double z = ballEntity.getPointEntity().getZ();
        return radius == x || radius == y || radius == z;
    }
}
