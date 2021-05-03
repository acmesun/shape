package by.lukyanets.shape.validator;

import java.util.List;

public class PointValidator extends ShapeValidator {
    private static final int ARGS_COUNT_FOR_BALL = 3;

    @Override
    protected boolean validate(List<Double> numbers) {
        return numbers != null && validateDataCount(numbers);
    }

    private boolean validateDataCount(List<Double> numbers) {
        return numbers.size() == ARGS_COUNT_FOR_BALL;
    }

}
