package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.reader.ShapeDataReader;

import java.util.ArrayList;
import java.util.List;

public abstract class ShapeCreator {
    private final ShapeDataReader reader = new ShapeDataReader();

    public List<ShapeEntity> create(String fileName) throws ShapeException {
        List<String> data = reader.readFromFile(fileName);
        List<ShapeEntity> shapeEntities = new ArrayList<>();
        for (String dataInLine : data) {
            shapeEntities.add(createEntity(dataInLine));
        }
        return shapeEntities;
    }

    protected abstract ShapeEntity createEntity(String data);
}
