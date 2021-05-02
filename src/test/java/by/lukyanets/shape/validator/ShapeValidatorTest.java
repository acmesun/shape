package by.lukyanets.shape.validator;

import by.lukyanets.shape.entity.BallEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShapeValidatorTest {

    private final BallEntity ballEntity = new BallEntity(1, 2, 3, -5, 9);
    private final ShapeValidator validator = new ShapeValidator();

    @Test
    public void isNullTest() {
        Assert.assertTrue(validator.isNull(null));
    }

    @Test
    public void isNullNotNullTest() {
        Assert.assertFalse(validator.isNull(ballEntity));
    }

    @Test
    public void isRadiusNegativeOrZeroTest(){
        Assert.assertFalse(validator.isRadiusNegativeOrZero(ballEntity));
    }
    @Test
    public void isRadiusNegativeOrZeroZeroTest(){
        Assert.assertTrue(validator.isRadiusNegativeOrZero(new BallEntity(7, 8, -8, 7, 0)));
    }
    @Test
    public void isRadiusNegativeOrZeroNegativeTest() {
        Assert.assertTrue(validator.isRadiusNegativeOrZero(new BallEntity(8, -8, -9, -7, -5)));
    }

    @Test
    public void canItBeRadiusZeroTest() {
        Assert.assertFalse(validator.canItBeRadius(0));
    }

    @Test
    public void  canItBeRadiusNegativeTest() {
        Assert.assertFalse(validator.canItBeRadius(-52.2));
    }
    @Test
    public void canIrBeRadiusNormalTest() {
        Assert.assertTrue(validator.canItBeRadius(8.5));
    }
}
