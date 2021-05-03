package by.lukyanets.shape.observer;

import by.lukyanets.shape.entity.BallEntity;

import java.util.EventObject;

public class ShapeEvent extends EventObject {

    public ShapeEvent(BallEntity source) {
        super(source);
    }

    @Override
    public BallEntity getSource() {
        return (BallEntity) super.getSource();
    }
}
