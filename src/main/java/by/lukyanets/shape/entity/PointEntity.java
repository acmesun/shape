package by.lukyanets.shape.entity;

import java.util.Objects;

public class PointEntity {
    private final int id;
    private final double x;
    private final double y;
    private final double z;

    public PointEntity(int id, double x, double y, double z) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getId() {
        return id;
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
        PointEntity pointEntity = (PointEntity) o;
        return id == pointEntity.id && Double.compare(pointEntity.x, x) == 0 && Double.compare(pointEntity.y, y) == 0 && Double.compare(pointEntity.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, x, y, z);
    }

    @Override
    public String toString() {
        return "DotEntity{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
