package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.reader.ShapeDataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class ShapeCreator {
    private final ShapeDataReader reader = new ShapeDataReader();
    private static final Logger logger = LogManager.getLogger(ShapeCreator.class);

    public List<ShapeEntity> create(String fileName) throws ShapeException {
        logger.info("Start reading from file {}", fileName);
        List<String> data = reader.readFromFile(fileName);
        List<ShapeEntity> shapeEntities = new ArrayList<>();
        for (String dataInLine : data) {
            shapeEntities.add(createEntity(dataInLine));
        }
        return shapeEntities;
    }

    protected abstract ShapeEntity createEntity(String data);
}
