package by.lukyanets.shape.util;

import by.lukyanets.shape.exception.ShapeException;

import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Objects;

public class Util {
    public static String findAbsolutePath(String fileName) throws ShapeException {
        try {
            return Paths.get((Objects.requireNonNull(Util.class.getClassLoader().getResource(fileName))).toURI()).toString();
        } catch (URISyntaxException e) {
            throw new ShapeException();
        }
    }
}
