package by.lukyanets.shape.parser;

import by.lukyanets.shape.exception.ShapeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataParser {
    private final static Logger logger = LogManager.getLogger(DataParser.class);

    public List<Double> parseData(String data) throws ShapeException {
        try {
            return Arrays.stream(data.split(" "))
                    .sequential()
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            logger.error("Data cannot be parsed: {}", data, e);
            throw new ShapeException();
        }
    }
}

