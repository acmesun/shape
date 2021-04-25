package by.lukyanets.shape.comparator;

import by.lukyanets.shape.entity.BallEntity;

public class BallComparator extends ShapeComparator<BallEntity> {
    public int compareByX(BallEntity entity1, BallEntity entity2) {
        return Double.compare(entity1.getX(), entity2.getX());
    }

    public int compareByY(BallEntity entity1, BallEntity entity2) {
        return Double.compare(entity1.getY(), entity2.getY());
    }

    public int compareByZ(BallEntity entity1, BallEntity entity2) {
        return Double.compare(entity1.getZ(), entity2.getZ());
    }

    public int compareByRadius(BallEntity entity1, BallEntity entity2) {
        return Double.compare(entity1.getRadius(), entity2.getRadius());
    }
}
