package by.lukyanets.shape.entity;

public abstract class ShapeEntity {
    private final double id;

    public ShapeEntity(double id) {
        this.id = id;
    }

    public double getId() {
        return id;
    }
}
