package by.lukyanets.shape._main;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.sort.impl.BallSorterImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ShapeException {

        List<BallEntity> entities = Arrays.asList(
                new BallEntity(1, 1, 2, 3, 1),
                new BallEntity(3, 3, 2, 1, 2),
                new BallEntity(4, 4, 4, 4, 4),
                new BallEntity(9, 8, 1, -4, 5)
        );
        BallSorterImpl sorter = new BallSorterImpl();
        System.out.println(entities);
        sorter.sortById(entities);
        for (BallEntity entity : entities) {
            System.out.println(entity);
        }
    }
}
