package by.lukyanets.shape.observer;

import java.util.EventObject;

public class ShapeEvent extends EventObject {

    public ShapeEvent(Object source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }
}
