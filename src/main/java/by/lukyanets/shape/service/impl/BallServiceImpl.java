package by.lukyanets.shape.service.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.BallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BallServiceImpl implements BallService {
    private final static Logger logger = LogManager.getLogger(BallServiceImpl.class);
    private final static String VALIDATOR_WORKS = "BallEntity validation";

    private static double round(double value) {
        BigDecimal bigDecimal = BigDecimal.valueOf(value);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public double findBallArea(BallEntity ballEntity) throws ShapeException {
        verifyForCalculation(ballEntity);
        double radius = ballEntity.getRadius();
        return round(4.0 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double findBallVolume(BallEntity ballEntity) throws ShapeException {
        verifyForCalculation(ballEntity);
        double radius = ballEntity.getRadius();
        return round((double) 4 / 3 * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public boolean isItBall(Object object) throws ShapeException {
        logger.info(VALIDATOR_WORKS);
        if (object == null) {
            logger.error("Object is null");
            throw new ShapeException();
        }
        return object instanceof BallEntity;
    }

    @Override
    public boolean isBallTouchingCoordinateLines(BallEntity ballEntity) throws ShapeException {
        verifyForCalculation(ballEntity);
        double radius = ballEntity.getRadius();
        double x = ballEntity.getX();
        double y = ballEntity.getY();
        double z = ballEntity.getZ();
        return isEquals(radius, x) || isEquals(radius, y) || isEquals(radius, z);
    }

    @Override
    public double findVolumeRatio(BallEntity ballEntity, PointEntity point) throws ShapeException {
        verifyForCalculation(ballEntity);
        if (point == null) {
            logger.error("Point can not be null");
            throw new ShapeException();
        }
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

    private double calcRatio(double radius, double height, BallEntity ballEntity) throws ShapeException {
        if (ballEntity == null) {
            logger.error("Parameters can not be null");
            throw new ShapeException();
        }
        double volume = (Math.sqrt(height) * Math.PI) / 3 * (3 * radius - height);
        double fullVolume = findBallVolume(ballEntity);
        return volume / (fullVolume - volume);
    }

    private void verifyForCalculation(BallEntity ballEntity) throws ShapeException {
        logger.info(VALIDATOR_WORKS);
        if (ballEntity == null) {
            logger.error("Exception! Entity cannot be null!");
            throw new ShapeException();
        }

    }

    private boolean isEquals(double number1, double number2) {
        double delta = 0.01;
        return Math.abs(number1 - number2) < delta;
    }
}
