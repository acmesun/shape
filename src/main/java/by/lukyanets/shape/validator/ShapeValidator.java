package by.lukyanets.shape.validator;

import by.lukyanets.shape.entity.BallEntity;

public class ShapeValidator {

    public boolean isNull(Object ballEntity) {
        return ballEntity == null;
    }

    public boolean isRadiusNegativeOrZero(BallEntity ballEntity){
        return ballEntity.getRadius() <= 0;
    }
}
