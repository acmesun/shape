package by.lukyanets.shape.entity.service.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.impl.BallServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BallServiceImplTest {

    private final BallServiceImpl service = new BallServiceImpl();
    private final ShapeEntity normalBallEntity = new BallEntity(1, 2.0, 2.0, 3.0, 5.0);

    @Test
    public void findBallAreaNullTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallArea(null));
    }

    @Test
    public void findBallAreaNormalTest() throws ShapeException {
        double actualBallArea = service.findBallArea((BallEntity) normalBallEntity);
        double expectedBallArea = 314.16;
        Assert.assertEquals(actualBallArea, expectedBallArea);
    }

    @Test
    public void findBallVolumeNullTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallVolume(null));
    }

    @Test
    public void findBallVolumeNormalTest() throws ShapeException {
        double actualBallVolume = service.findBallVolume((BallEntity) normalBallEntity);
        double expectedBallVolume = 523.60;
        Assert.assertEquals(actualBallVolume, expectedBallVolume);
    }

    @Test
    public void isItBallTrueTest() throws ShapeException {
        Assert.assertTrue(service.isItBall(normalBallEntity));
    }

    @Test
    public void isItBallFalseTest() throws ShapeException {
        Assert.assertFalse(service.isItBall(new PointEntity(1, 2.0, 3.0, 5.0)));
    }

    @Test
    public void isItBallNullTest() {
        Assert.assertThrows(ShapeException.class, () -> service.isItBall(null));
    }

    @Test
    public void isBallTouchingCoordinateLinesNormalTest() throws ShapeException {
        Assert.assertFalse(service.isBallTouchingCoordinateLines((BallEntity) normalBallEntity));
    }

    @Test
    public void isBallTouchingCoordinateLinesFalseTest() throws ShapeException {
        Assert.assertTrue(service.isBallTouchingCoordinateLines(new BallEntity(1, 3.0, 1.0, 1.0, 1.0)));
    }

    @Test
    public void isBallTouchingCoordinateLinesNullTest() throws ShapeException {
        Assert.assertThrows(ShapeException.class, () -> service.isBallTouchingCoordinateLines(null));
    }
}
