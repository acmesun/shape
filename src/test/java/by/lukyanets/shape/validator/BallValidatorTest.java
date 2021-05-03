package by.lukyanets.shape.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BallValidatorTest {
    private final BallValidator validator = new BallValidator();

    @Test
    public void validateBallTest() {
        Assert.assertTrue(validator.validate(Arrays.asList(2.0, 9.2, 9.6, 1.0)));
    }

    @Test
    public void validateBallMoreThenNeedArgsTest() {
        Assert.assertFalse(validator.validate(Arrays.asList(2.0, 9.2, 9.6, 1.0, 5.5, 6.8)));
    }

    @Test
    public void validateBallLessThenNeedArgsTest() {
        Assert.assertFalse(validator.validate(Arrays.asList(2.0, 9.2)));
    }

    @Test
    public void validateBallWithNegativeForthArgTest() {
        Assert.assertFalse(validator.validate(Arrays.asList(2.0, 9.2, 9.6, -1.0)));
    }

    @Test
    public void validateBallWithZeroForthArgTest() {
        Assert.assertFalse(validator.validate(Arrays.asList(2.0, 9.2, 9.6, 0.0)));
    }

    @Test
    public void validateBallNullTest() {
        Assert.assertFalse(validator.validate((null)));
    }

    @Test
    public void validateBallAllNegativeArgsExceptForthTest() {
        Assert.assertTrue(validator.validate(Arrays.asList(-2.0, -9.2, -9.6, 1.0)));
    }
}
