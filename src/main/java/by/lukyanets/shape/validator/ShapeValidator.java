package by.lukyanets.shape.validator;

import java.util.List;

public abstract class ShapeValidator {

    public boolean isDataValid(List<Double> numbers) {
        return validate(numbers);
    }

    protected abstract boolean validate(List<Double> numbers);
}
