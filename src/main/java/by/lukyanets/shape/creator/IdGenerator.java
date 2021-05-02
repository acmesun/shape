package by.lukyanets.shape.creator;

import java.util.Random;

public class IdGenerator {
    private final Random random = new Random();

    public Integer nextId() {
        return random.nextInt();
    }
}
