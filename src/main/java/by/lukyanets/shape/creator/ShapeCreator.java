package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;

import java.util.List;

import static by.lukyanets.shape.creator.IdGenerator.generateId;

public abstract class ShapeCreator {

    public ShapeEntity create(List<Double> numbers) {
        return createShape(generateId(), numbers.toArray(new Double[0]));
    }

    protected abstract ShapeEntity createShape(Integer id, Double... params);
}
