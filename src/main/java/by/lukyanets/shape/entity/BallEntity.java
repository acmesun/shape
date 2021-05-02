package by.lukyanets.shape.entity;

import java.util.Objects;

public class BallEntity extends ShapeEntity {

    private double x;
    private double y;
    private double z;
    private double radius;

    public BallEntity(int id, double x, double y, double z, double radius) {
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Double.compare(that.z, z) == 0 && Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, radius);
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", radius=" + radius +
                '}';
    }
}
