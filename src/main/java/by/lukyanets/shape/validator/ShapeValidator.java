package by.lukyanets.shape.validator;

import by.lukyanets.shape.entity.BallEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeValidator {

    private static final Logger logger = LogManager.getLogger(ShapeValidator.class);

    public boolean isNull(Object ballEntity) {
        logger.warn("BallEntity is null.");
        return ballEntity == null;
    }

    public boolean isRadiusNegativeOrZero(BallEntity ballEntity){
        logger.info("Radius cannot be negative or zero.");
        return ballEntity.getRadius() <= 0;
    }


}
