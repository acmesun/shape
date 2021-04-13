package by.lukyanets.shape.entity.service.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.impl.BallServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BallServiceImplTest {

    private final BallServiceImpl service = new BallServiceImpl();
    private final PointEntity pointEntity = new PointEntity(1.0, 2.0, 3.0, 5.0);
    private final BallEntity normalBallEntity = new BallEntity(1.0, 2.0, pointEntity);
    private final double delta = 0.001;

    @Test
    public void findBallAreaNullTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallArea(null));
    }

    @Test
    public void findBallAreaNegativeRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallArea(new BallEntity(1.0, -5, pointEntity)));
    }

    @Test
    public void findBallAreaZeroRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallArea(new BallEntity(1.0, 0, pointEntity)));
    }

    @Test
    public void findBallAreaNormalTest() throws ShapeException {
        double actualBallArea = service.findBallArea(normalBallEntity);
        double expectedBallArea = 17.77;
        Assert.assertEquals(actualBallArea, expectedBallArea, delta);
    }

    @Test
    public void findBallVolumeNullTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallVolume(null));
    }

    @Test
    public void findBallVolumeNegativeRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallVolume(new BallEntity(1, -4, pointEntity)));
    }

    @Test
    public void findBallVolumeZeroRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> service.findBallVolume(new BallEntity(1, 0, pointEntity)));
    }

    @Test
    public void findBallVolumeNormalTest() throws ShapeException {
        double actualBallVolume = service.findBallVolume(normalBallEntity);
        double expectedBallVolume = 33.51;
        Assert.assertEquals(actualBallVolume, expectedBallVolume, delta);
    }

    @Test
    public void isItBallTrueTest() throws ShapeException {
        Assert.assertTrue(service.isItBall(normalBallEntity));
    }

    @Test
    public void isItBallFalseTest() throws ShapeException {
        Assert.assertFalse(service.isItBall(pointEntity));
    }

    @Test
    public void isItBallNullTest() {
        Assert.assertThrows(ShapeException.class, () -> service.isItBall(null));
    }

    @Test
    public void isBallTouchingCoordinateLinesNormalTest() throws ShapeException {
        Assert.assertTrue(service.isBallTouchingCoordinateLines(normalBallEntity));
    }

    @Test
    public void isBallTouchingCoordinateLinesFalseTest() throws ShapeException {
        Assert.assertFalse(service.isBallTouchingCoordinateLines(new BallEntity(1, 3, new PointEntity(1, 1, 1, 1))));
    }

    @Test
    public void isBallTouchingCoordinateLinesNullTest() throws ShapeException {
        Assert.assertThrows(ShapeException.class, () -> service.isBallTouchingCoordinateLines(null));
    }

    @Test
    public void isBallTouchingCoordinateLinesNegativeRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> service.isBallTouchingCoordinateLines(new BallEntity(5, -7, pointEntity)));
    }

    @Test
    public void isBallTouchingCoordinateLinesZeroRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> service.isBallTouchingCoordinateLines(new BallEntity(5, 0, pointEntity)));

    }

    @Test
    public void findVolumeRatio() {

    }

}
