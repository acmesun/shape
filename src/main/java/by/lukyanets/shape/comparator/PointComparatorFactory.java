package by.lukyanets.shape.comparator;

import by.lukyanets.shape.entity.PointEntity;

import java.util.Comparator;

public class PointComparatorFactory {

    public static Comparator<PointEntity> compareById() {
        return Comparator.comparingInt(PointEntity::getId);
    }

    public static Comparator<PointEntity> compareByX() {
        return Comparator.comparingDouble(PointEntity::getX);
    }

    public static Comparator<PointEntity> compareByY() {
        return Comparator.comparingDouble(PointEntity::getY);
    }

    public static Comparator<PointEntity> compareByZ() {
        return Comparator.comparingDouble(PointEntity::getZ);
    }
}
