package by.lukyanets.shape.util;

import static java.util.Objects.requireNonNull;

public class Util {
    public static String findAbsolutePath(String fileName) {
        return requireNonNull(Util.class.getClassLoader().getResource(fileName)).getPath();
    }
}
