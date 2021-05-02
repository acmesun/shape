package by.lukyanets.shape.validator;

import java.util.List;

public class BallValidator extends ShapeValidator {
    private static final int RADIUS_ARG_INDEX = 3;
    private static final int ARGS_COUNT_FOR_BALL = 4;

    @Override
    protected boolean validate(List<Double> numbers) {
        return numbers != null && validateDataCount(numbers) && validateRadius(numbers);
    }

    private boolean validateDataCount(List<Double> numbers) {
        return numbers.size() == ARGS_COUNT_FOR_BALL;
    }

    private boolean validateRadius(List<Double> numbers) {
        return numbers.get(RADIUS_ARG_INDEX) > 0.0;
    }
}
