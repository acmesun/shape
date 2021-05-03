package by.lukyanets.shape.creator;

public class IdGenerator {
    private static Integer counter = 0;

    private IdGenerator() {
    }

    public static Integer generateId() {
        return ++counter;
    }
}
