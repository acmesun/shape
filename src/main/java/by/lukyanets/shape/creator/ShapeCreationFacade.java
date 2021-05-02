package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.parser.DataParser;
import by.lukyanets.shape.reader.ShapeDataReader;
import by.lukyanets.shape.validator.BallValidator;
import by.lukyanets.shape.validator.ShapeValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ShapeCreationFacade {
    public static final Logger LOGGER = LogManager.getLogger(ShapeCreationFacade.class);
    private final DataParser parser = new DataParser();
    private final ShapeDataReader reader = new ShapeDataReader();
    private final ShapeCreator creator = new BallCreator();
    private final ShapeValidator validator = new BallValidator();


    public List<ShapeEntity> createShapes(String filename) throws ShapeException {
        return reader.readFromFile(filename).stream()
                .map(this::parseDataSafe)
                .filter(Objects::nonNull)
                .filter(validator::isDataValid)
                .map(creator::create)
                .collect(Collectors.toList());
    }

    private List<Double> parseDataSafe(String data) {
        try {
            return parser.parseData(data);
        } catch (ShapeException e) {
            LOGGER.error("Error line: {}", data);
            return null;
        }
    }
}
