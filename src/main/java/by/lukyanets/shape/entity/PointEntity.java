package by.lukyanets.shape.entity;

import java.util.Objects;

public class PointEntity extends ShapeEntity {

    private final double x;
    private final double y;
    private final double z;

    public PointEntity(int id, double x, double y, double z) {
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointEntity that = (PointEntity) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Double.compare(that.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "PointEntity{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
