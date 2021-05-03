package by.lukyanets.shape.observer;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.impl.BallServiceImpl;
import by.lukyanets.shape.warehouse.ShapeParam;
import by.lukyanets.shape.warehouse.ShapeWarehouse;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShapeObserverImplTest {
    private final BallEntity ballEntity = new BallEntity(1, 2.0, 5.0, 5.5, 3.2);
    private final BallServiceImpl service = new BallServiceImpl();
    private final ShapeWarehouse warehouse = ShapeWarehouse.getInstance();

    @BeforeTest
    public void prepare() throws ShapeException {
        Double volume = service.findBallVolume(ballEntity);
        Double area = service.findBallArea(ballEntity);
        int id = ballEntity.getId();
        warehouse.addParam(id, area, volume);
    }

    @Test
    public void updateRadiusTest() throws ShapeException {
        ballEntity.setRadius(2.0);
        ShapeParam actual = warehouse.getParam(ballEntity.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateXTest() throws ShapeException {
        ballEntity.setX(-12.0);
        ShapeParam actual = warehouse.getParam(ballEntity.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateYTest() throws ShapeException {
        ballEntity.setY(15);
        ShapeParam actual = warehouse.getParam(ballEntity.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void updateZTest() throws ShapeException {
        ballEntity.setZ(25.5);
        ShapeParam actual = warehouse.getParam(ballEntity.getId());
        ShapeParam expected = new ShapeParam(128.68, 137.26);
        Assert.assertEquals(actual, expected);
    }
}
