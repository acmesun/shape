package by.lukyanets.shape.entity.parser;

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
            throw new ShapeException("Exception - list can not be parse.");
        }
        List<BallDto> result = new ArrayList<>(list.size());
        for (String s : list) {
            String[] strings = s.split(" ");
            if (strings.length > 4) {
                throw new ShapeException();
            }
            try {
                double first = Double.parseDouble(strings[0]);
                double second = Double.parseDouble(strings[1]);
                double third = Double.parseDouble(strings[2]);
                double forth = Double.parseDouble(strings[3]);
                if (forth <= 0) {
                    throw new ShapeException();
                }
                result.add(new BallDto(first, second, third, forth));
            } catch (NumberFormatException e) {
                throw new ShapeException();
            }
        }
        return result;
    }
}

