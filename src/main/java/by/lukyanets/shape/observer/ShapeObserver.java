package by.lukyanets.shape.observer;

import by.lukyanets.shape.exception.ShapeException;

public interface ShapeObserver {
    void update(ShapeEvent event) throws ShapeException;
}
