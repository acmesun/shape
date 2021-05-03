package by.lukyanets.shape.warehouse;

import java.util.Objects;

public class ShapeParam {
    private Double area;
    private Double volume;

    public ShapeParam(Double area, Double volume) {
        this.area = area;
        this.volume = volume;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeParam that = (ShapeParam) o;
        return Objects.equals(area, that.area) && Objects.equals(volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, volume);
    }

    @Override
    public String toString() {
        return "ShapeParam{" +
                "area=" + area +
                ", volume=" + volume +
                '}';
    }
}
