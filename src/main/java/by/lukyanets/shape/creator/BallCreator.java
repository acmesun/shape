package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;

import java.util.ArrayList;
import java.util.List;

public class BallCreator extends ShapeCreator {

    @Override
    protected List<ShapeEntity> createEntity(String fileName) throws ShapeException {
        List<ShapeEntity> ballEntities = new ArrayList<>();
        BallEntity ballEntity;
        int id = 0;
        List<String> list = create(fileName);
        for (String s : list) {
            String[] lineToCreate = s.split(" ");
            double first = Double.parseDouble(lineToCreate[0]);
            double second = Double.parseDouble(lineToCreate[1]);
            double third = Double.parseDouble(lineToCreate[2]);
            double forth = Double.parseDouble(lineToCreate[3]);
            //ballEntity = new BallEntity(id, first, second, third, forth);
            id++;
        }
        return null;
    }
}
