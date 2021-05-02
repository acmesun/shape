package by.lukyanets.shape.creator;

public class IdGenerator {
    private static Integer counter;

    private IdGenerator() {
    }

    public static Integer generateId() {
        return ++counter;
    }
}
