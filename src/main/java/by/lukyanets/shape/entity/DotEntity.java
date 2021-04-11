package by.lukyanets.shape.entity;

import java.util.Objects;

public class DotEntity {
    private final int id;

    public DotEntity(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DotEntity dotEntity = (DotEntity) o;
        return id == dotEntity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DotEntity{" +
                "id=" + id +
                '}';
    }
}
