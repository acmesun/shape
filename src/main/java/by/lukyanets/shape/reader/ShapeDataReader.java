package by.lukyanets.shape.reader;

import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.validator.DataValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ShapeDataReader {
    private static final Logger logger = LogManager.getLogger(ShapeDataReader.class);
    private static final DataValidator validator = new DataValidator();

    public List<String> readFromFile(String fileName) throws ShapeException {
        if (!validator.isFileValid(fileName)) {
            logger.error("File {} does not valid.", fileName);
            throw new ShapeException(String.format("Read from file %s failed.", fileName));
        }
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            logger.error("Read from file {} failed", fileName);
            throw new ShapeException(e);
        }
    }
}
