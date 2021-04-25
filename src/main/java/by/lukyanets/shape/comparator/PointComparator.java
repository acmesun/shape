package by.lukyanets.shape.comparator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;


public class PointComparator extends ShapeComparator<PointEntity> {
    public int compareByX(PointEntity entity1, PointEntity entity2) {
        return Double.compare(entity1.getX(), entity2.getX());
    }

    public int compareByY(PointEntity entity1, PointEntity entity2) {
        return Double.compare(entity1.getY(), entity2.getY());
    }

    public int compareByZ(PointEntity entity1, PointEntity entity2) {
        return Double.compare(entity1.getZ(), entity2.getZ());
    }

}

