package by.lukyanets.shape.entity;

public abstract class ShapeEntity {
    private int id;

    public ShapeEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
