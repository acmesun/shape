package by.lukyanets.shape._main;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.parser.DataParser;
import by.lukyanets.shape.repository.impl.BallRepository;
import by.lukyanets.shape.service.BallService;
import by.lukyanets.shape.service.impl.BallServiceImpl;


public class Main {
    private static final DataParser parser = new DataParser();
    private static final BallService service = new BallServiceImpl();

    public static void main(String[] args) throws ShapeException {
        BallRepository repository = BallRepository.getInstance();
        BallEntity entity1 = new BallEntity(1, 1.0, 1.0, 25.0, 2.2);
        BallEntity entity2 = new BallEntity(3, 4.0, -55.0, -9.0, 10.0);
        BallEntity entity3 = new BallEntity(8, 6.0, 2.0, -7.0, 2.7);
        BallEntity entity4 = new BallEntity(5, -1.0, 3.0, 1.0, 4.9);
        BallEntity entity5 = new BallEntity(2, 8.0, 7.0, -6.0, 25.0);
        repository.add(entity1);
        repository.add(entity2);
        repository.add(entity3);
        repository.add(entity4);
        repository.add(entity5);
        System.out.println(entity1);
        System.out.println(service.findBallArea(entity1));
        entity1.setRadius(5);
        System.out.println(entity1);
        System.out.println(service.findBallArea(entity1));
    }
}
