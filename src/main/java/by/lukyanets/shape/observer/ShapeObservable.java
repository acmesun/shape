package by.lukyanets.shape.observer;

import by.lukyanets.shape.exception.ShapeException;

public interface ShapeObservable {
    void notifyObservers() throws ShapeException;

    void addObserver(ShapeObserver shapeObserver);

    void deleteObserver(ShapeObserver shapeObserver);
}
