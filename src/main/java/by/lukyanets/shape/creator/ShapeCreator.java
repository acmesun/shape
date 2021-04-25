package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.parser.DataParser;
import by.lukyanets.shape.reader.ShapeDataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class ShapeCreator {
    private final ShapeDataReader reader = new ShapeDataReader();
    private final DataParser parser = new DataParser();
    private static final Logger logger = LogManager.getLogger(ShapeCreator.class);
    private static int nextId;

    public List<ShapeEntity> createEntities(String fileName) throws ShapeException {
        List<ShapeEntity> shapeEntities = new ArrayList<>();
        List<String> inputData = readData(fileName);
        for (String s : inputData) {
            String[] lineToCreate = s.split(" ");
            double first = Double.parseDouble(lineToCreate[0]);
            double second = Double.parseDouble(lineToCreate[1]);
            double third = Double.parseDouble(lineToCreate[2]);
            double forth = Double.parseDouble(lineToCreate[3]);
            shapeEntities.add(createShape(nextId++, first, second, third, forth));
        }
        return shapeEntities;
    }

    protected abstract ShapeEntity createShape(int id, double... params) throws ShapeException;

    private List<String> readData(String fileName) throws ShapeException {
        logger.info("Start reading from file {}", fileName);
        List<String> data = reader.readFromFile(fileName);
        return parser.dataParser(data);
    }
}
