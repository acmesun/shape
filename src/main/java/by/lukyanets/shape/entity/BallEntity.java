package by.lukyanets.shape.entity;

import java.util.Objects;

public class BallEntity {
    private final int ballID;
    private final double radius;
    private final double x;
    private final double y;

    public BallEntity(int ballID, double radius, double x, double y) {
        this.ballID = ballID;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getBallID() {
        return ballID;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return ballID == that.ballID && Double.compare(that.radius, radius) == 0 && Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballID, radius, x, y);
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "ballID=" + ballID +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
