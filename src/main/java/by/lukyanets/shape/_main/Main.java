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

        BallEntity ballEntity = new BallEntity(1, -2.0, 5.0, 25.5, 3.2);
        double ballArea = service.findBallArea(ballEntity);
        double ballVolume = service.findBallVolume(ballEntity);
        System.out.println(ballArea+" " + ballVolume);
    }
}
