package by.lukyanets.shape.parser;

import by.lukyanets.shape.dto.BallDto;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.validator.DataValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DataParser {

    private final static Logger logger = LogManager.getLogger(DataParser.class);
    private final static DataValidator validator = new DataValidator();


    public List<BallDto> dataParser(List<String> list) throws ShapeException {
        if (validator.isListNotReadyToParse(list)) {
            logger.error("List can not be null.");
            throw new ShapeException("Exception - list cannot be parse.");
        }
        List<BallDto> result = new ArrayList<>(list.size());
        for (String s : list) {
            String[] strings = s.split(" ");
            if (strings.length > 4) {
                logger.error("There are more than 4 data words.");
                throw new ShapeException();
            }
            try {
                double first = Double.parseDouble(strings[0]);
                double second = Double.parseDouble(strings[1]);
                double third = Double.parseDouble(strings[2]);
                double forth = Double.parseDouble(strings[3]);
                if (forth <= 0) {
                    logger.error("Radius cannot be negative.");
                    throw new ShapeException();
                }
                result.add(new BallDto(first, second, third, forth));
            } catch (NumberFormatException e) {
                logger.error("Data cannot be parsed to double format.");
                throw new ShapeException();
            }
        }
        logger.info("Data parse successfully completed.");
        return result;
    }
}

