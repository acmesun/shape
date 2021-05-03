package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BallCreatorTest {
    private final BallCreator creator = new BallCreator();

    @Test
    public void createShapeNormalTest() {
        BallEntity expectedEntity = new BallEntity(1, 1.0, 2.0, 3.0, 4.0);
        ShapeEntity actualEntity = creator.create(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        Assert.assertEquals(actualEntity, expectedEntity);
    }

    @Test
    public void createShapeMixDataTest() {
        BallEntity expectedEntity = new BallEntity(1, -8.0, -9.0, -2.0, 9.0);
        ShapeEntity actualEntity = creator.createShape(1, -8.0, -9.0, -2.0, 9.0);
        Assert.assertEquals(actualEntity, expectedEntity);
    }

}
