package by.lukyanets.shape.entity;

import java.util.Objects;

public class BallEntity {
    private final int ballID;
    private final double radius;
    private final DotEntity dotEntity;

    public BallEntity(int ballID, double radius, DotEntity dotEntity) {
        this.ballID = ballID;
        this.radius = radius;
        this.dotEntity = dotEntity;
    }

    public int getBallID() {
        return ballID;
    }

    public double getRadius() {
        return radius;
    }

    public DotEntity getDotEntity() {
        return dotEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return ballID == that.ballID && Double.compare(that.radius, radius) == 0 && Objects.equals(dotEntity, that.dotEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballID, radius, dotEntity);
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "ballID=" + ballID +
                ", radius=" + radius +
                ", dotEntity=" + dotEntity +
                '}';
    }
}
