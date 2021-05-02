package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;

import java.util.List;

public abstract class ShapeCreator {
    private final IdGenerator idGenerator = new IdGenerator();

    public ShapeEntity create(List<Double> numbers) {
        return createShape(idGenerator.nextId(), numbers.toArray(new Double[0]));
    }

    protected abstract ShapeEntity createShape(Integer id, Double... params);
}
