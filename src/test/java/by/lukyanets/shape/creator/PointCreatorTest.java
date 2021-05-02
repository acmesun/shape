package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointCreatorTest {
    private final PointCreator creator = new PointCreator();

    @Test
    public void createShapeNormalTest() throws ShapeException {
        PointEntity expectedEntity = new PointEntity(1, 1, 2, 3);
        ShapeEntity actualEntity = creator.createShape(1, 1, 2, 3);
        Assert.assertEquals(actualEntity, expectedEntity);
    }

    @Test
    public void createShapeMixDataTest() throws ShapeException {
        PointEntity expectedEntity = new PointEntity(1, -8, 9, -2);
        ShapeEntity actualEntity = creator.createShape(1, -8, 9, -2);
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
