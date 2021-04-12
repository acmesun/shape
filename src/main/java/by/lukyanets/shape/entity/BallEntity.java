package by.lukyanets.shape.entity;

import java.util.Objects;

public class BallEntity {
    private final int ballID;
    private final double radius;
    private final PointEntity pointEntity;

    public BallEntity(int ballID, double radius, PointEntity pointEntity) {
        this.ballID = ballID;
        this.radius = radius;
        this.pointEntity = pointEntity;
    }

    public int getBallID() {
        return ballID;
    }

    public double getRadius() {
        return radius;
    }

    public PointEntity getDotEntity() {
        return pointEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return ballID == that.ballID && Double.compare(that.radius, radius) == 0 && Objects.equals(pointEntity, that.pointEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballID, radius, pointEntity);
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "ballID=" + ballID +
                ", radius=" + radius +
                ", dotEntity=" + pointEntity +
                '}';
    }
}
