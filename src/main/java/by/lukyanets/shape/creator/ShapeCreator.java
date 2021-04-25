package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.parser.DataParser;
import by.lukyanets.shape.reader.ShapeDataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public abstract class ShapeCreator {
    private final ShapeDataReader reader = new ShapeDataReader();
    private final DataParser parser = new DataParser();
    private static final Logger logger = LogManager.getLogger(ShapeCreator.class);

    public List<String> create(String fileName) throws ShapeException {
        logger.info("Start reading from file {}", fileName);
        List<String> data = reader.readFromFile(fileName);
        return parser.dataParser(data);
    }

    protected abstract List<ShapeEntity> createEntity(String fileName) throws ShapeException;
}
