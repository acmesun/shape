package by.lukyanets.shape.comparator;

import by.lukyanets.shape.entity.BallEntity;

import java.util.Comparator;

public class BallComparatorFactory {
    public static Comparator<BallEntity> compareById() {
        return Comparator.comparingInt(BallEntity::getId);
    }

    public static Comparator<BallEntity> compareByX() {
        return Comparator.comparingDouble(BallEntity::getX);
    }

    public static Comparator<BallEntity> compareByY() {
        return Comparator.comparingDouble(BallEntity::getY);
    }

    public static Comparator<BallEntity> compareByZ() {
        return Comparator.comparingDouble(BallEntity::getZ);
    }

    public static Comparator<BallEntity> compareByRadius() {
        return Comparator.comparingDouble(BallEntity::getRadius);
    }
}

