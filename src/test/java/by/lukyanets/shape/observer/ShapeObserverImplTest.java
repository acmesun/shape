package by.lukyanets.shape.observer;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.impl.BallServiceImpl;
import by.lukyanets.shape.warehouse.ShapeParam;
import by.lukyanets.shape.warehouse.ShapeWarehouse;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ShapeObserverImplTest {
    private final BallEntity ballEntity1 = new BallEntity(1, 2.0, 5.0, 5.5, 3.2);
    private final BallEntity ballEntity2 = new BallEntity(2, -2.0, -5.0, 15.5, 5.2);
    private final BallServiceImpl service = new BallServiceImpl();
    private final ShapeWarehouse warehouse = ShapeWarehouse.getInstance();
    private final ArrayList<ShapeObserver> shapeObservers = new ArrayList<>();

    @BeforeTest
    public void prepare() throws ShapeException {
        Double volume = service.findBallVolume(ballEntity1);
        Double area = service.findBallArea(ballEntity1);
        int id = ballEntity1.getId();
        warehouse.addParam(id, area, volume);
    }

    @Test
    public void updateRadiusTest() throws ShapeException {
        ballEntity1.setRadius(2.0);
        ShapeParam actual = warehouse.getParam(ballEntity1.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateXTest() throws ShapeException {
        ballEntity1.setX(-12.0);
        ShapeParam actual = warehouse.getParam(ballEntity1.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateYTest() throws ShapeException {
        ballEntity1.setY(15);
        ShapeParam actual = warehouse.getParam(ballEntity1.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateZTest() throws ShapeException {
        ballEntity1.setZ(25.5);
        ShapeParam actual = warehouse.getParam(ballEntity1.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }
}
