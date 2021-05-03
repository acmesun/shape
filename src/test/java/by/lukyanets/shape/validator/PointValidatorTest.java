package by.lukyanets.shape.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PointValidatorTest {
    private final PointValidator validator = new PointValidator();

    @Test
    public void validateBallTest() {
        Assert.assertTrue(validator.validate(Arrays.asList(2.0, 9.2, 9.6)));
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
    public void validateBallNullTest() {
        Assert.assertFalse(validator.validate((null)));
    }

    @Test
    public void validateBallAllNegativeArgsTest() {
        Assert.assertTrue(validator.validate(Arrays.asList(-2.0, -9.2, -9.6)));
    }
}
