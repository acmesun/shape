package by.lukyanets.shape.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class DataReaderValidator {
    private static final Logger logger = LogManager.getLogger(DataReaderValidator.class);

    public boolean isFileValid(String fileName) {
        if (fileName == null) {
            logger.info("FileName is null.");
            return false;
        }
        File file = new File(fileName);
        logger.info("File {} check: existence and size.", fileName);
        return file.exists() && file.length() > 0L;
    }
}
