package by.lukyanets.shape._main;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.observer.ShapeObserver;
import by.lukyanets.shape.parser.DataParser;
import by.lukyanets.shape.repository.impl.BallRepository;
import by.lukyanets.shape.service.BallService;
import by.lukyanets.shape.service.impl.BallServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    private static final DataParser parser = new DataParser();
    private static final BallService service = new BallServiceImpl();

    public static void main(String[] args) throws ShapeException {
       BallEntity ballEntity1 = new BallEntity(1, 2.0, 5.0, 5.5, 6.0);
        System.out.println(service.findBallArea(ballEntity1));

    }
}
