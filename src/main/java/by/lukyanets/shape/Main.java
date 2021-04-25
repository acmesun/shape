package by.lukyanets.shape;

import by.lukyanets.shape.creator.BallCreator;
import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.service.impl.BallServiceImpl;

public class Main {
    public static void main(String[] args) throws ShapeException {
        BallEntity entity = new BallEntity(1, 2.0, 2.0, 3.0, 5.0);
        BallServiceImpl service = new BallServiceImpl();
        double area = service.findBallArea(entity);
        System.out.println(area);

        BallCreator creator = new BallCreator();
        creator.createEntities("test.txt");


    }
}
