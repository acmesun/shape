package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.util.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCreationFacadeTest {
    ShapeCreationFacade facade = new ShapeCreationFacade();

    @Test
    public void createShapeTest() throws ShapeException {
        List<ShapeEntity> actual = facade.createShapes(Util.findAbsolutePath("test.txt"));
        Assert.assertEquals(actual, Arrays.<ShapeEntity>asList(
                new BallEntity(1, 2.8, 2.9, 2.5, 4.0),
                new BallEntity(2, 14.8, 5.3, 4.9, 1.0)
        ));
    }

    @Test
    public void createShapeNoSuchFileTest() {
        Assert.assertThrows(NullPointerException.class, () -> facade.createShapes(Util.findAbsolutePath("noSuchFile.txt")));
    }

    @Test
    public void createShapeEmptyFileTest() throws ShapeException {
        List<ShapeEntity> actual = facade.createShapes(Util.findAbsolutePath("empty.txt"));
        Assert.assertEquals(actual, new ArrayList<ShapeEntity>());
    }
}
