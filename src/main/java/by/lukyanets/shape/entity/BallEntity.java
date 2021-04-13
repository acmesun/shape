package by.lukyanets.shape.entity;

import java.util.Objects;

public class BallEntity extends ShapeEntity {
    private double radius;
    private PointEntity pointEntity;

    public BallEntity(double id, double radius, PointEntity pointEntity) {
        super(id);
        this.radius = radius;
        this.pointEntity = pointEntity;
    }

    public double getRadius() {
        return radius;
    }

    public PointEntity getPointEntity() {
        return pointEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return Double.compare(that.radius, radius) == 0 && Objects.equals(pointEntity, that.pointEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, pointEntity);
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "radius=" + radius +
                ", pointEntity=" + pointEntity +
                '}';
    }
}
