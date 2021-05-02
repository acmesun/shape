package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BallCreatorTest {
    private final BallCreator creator = new BallCreator();

    @Test
    public void createShapeNormalTest() throws ShapeException {
        BallEntity expectedEntity = new BallEntity(1, 1, 2, 3, 4);
        ShapeEntity actualEntity = creator.createShape(1, 1, 2, 3, 4);
        Assert.assertEquals(actualEntity, expectedEntity);
    }

    @Test
    public void createShapeMixDataTest() throws ShapeException {
        BallEntity expectedEntity = new BallEntity(1, -8, -9, -2, 9);
        ShapeEntity actualEntity = creator.createShape(1, -8, -9, -2, 9);
        Assert.assertEquals(actualEntity, expectedEntity);
    }

    @Test
    public void createShapeThreeParamsTest() {
        Assert.assertThrows(ShapeException.class, () -> creator.createShape(1, 8, 9));
    }

    @Test
    public void createShapeFiveParamsTest() {
        Assert.assertThrows(ShapeException.class, () -> creator.createShape(2, 2, 9, -8, 7, 10));
    }
}
