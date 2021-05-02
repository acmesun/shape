package by.lukyanets.shape.repo.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.validator.ShapeValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static java.util.stream.Collectors.toList;

public final class BallRepository extends ShapeRepository<BallEntity> {
    private static final BallRepository INSTANCE = new BallRepository();
    private static final Logger logger = LogManager.getLogger(BallRepository.class);

    private BallRepository() {
    }

    public static BallRepository getInstance() {
        return INSTANCE;
    }

    public List<BallEntity> findAllByRadiusBetween(double minInclusive, double maxExclusive) throws ShapeException {
        logger.info("Checking parameters");
        validateParams(minInclusive, maxExclusive);
        return getData()
                .values()
                .stream().filter(it -> it.getRadius() < maxExclusive && it.getRadius() >= minInclusive)
                .collect(toList());
    }

    public List<BallEntity> findAllByRadius(double radius) {
        logger.info("Checking parameter");
        return getData().values()
                .stream().filter(it -> it.getRadius() == radius)
                .collect(toList());
    }

    public List<BallEntity> findAllByXLess(double x) {
        return getData()
                .values()
                .stream().filter(it -> it.getX() < x)
                .collect(toList());
    }

    public List<BallEntity> findAllInTheFirstQuadrant() {
        return getData()
                .values()
                .stream().filter(it -> it.getX() >= 0 && it.getY() >= 0 && it.getZ() >= 0)
                .collect(toList());
    }

    private void validateParams(double minInclusive, double maxExclusive) throws ShapeException {
        if (minInclusive <= 0 && maxExclusive <= 0 && minInclusive >= maxExclusive) {
            logger.error("Invalid parameters.");
            throw new ShapeException();
        }
    }


}
