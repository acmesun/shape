package by.lukyanets.shape.entity.service.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.service.impl.BallServiceImpl;
import org.testng.annotations.Test;

public class BallServiceImplTest {

    private final BallServiceImpl service = new BallServiceImpl();
    private final PointEntity pointEntity = new PointEntity(1, 2, 3, 5);

    @Test
    public void findBallAreaTest() {
        BallEntity ballEntity = new BallEntity(1, 2.0, pointEntity);
        double actualBallArea = service.findBallArea(ballEntity);
        double expectedBallArea;
    }

}
