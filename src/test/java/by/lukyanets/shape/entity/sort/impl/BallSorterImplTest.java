package by.lukyanets.shape.entity.sort.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.sort.impl.BallSorterImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class BallSorterImplTest {
    private final List<BallEntity> entities = Arrays.asList(
            new BallEntity(1, 1, 2, 3, 1),
            new BallEntity(3, 3, 2, 1, 2),
            new BallEntity(9, 8, 1, -4, 5),
            new BallEntity(4, 4, 4, 4, 4)
    );
    private final BallSorterImpl service = new BallSorterImpl();

    @Test
    public void sortByIdTest() {
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(1, 1, 2, 3, 1),
                new BallEntity(3, 3, 2, 1, 2),
                new BallEntity(4, 4, 4, 4, 4),
                new BallEntity(9, 8, 1, -4, 5)
        );
        List<BallEntity> actual = service.sortById(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByXTest() {
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(1, 1, 2, 3, 1),
                new BallEntity(3, 3, 2, 1, 2),
                new BallEntity(4, 4, 4, 4, 4),
                new BallEntity(9, 8, 1, -4, 5)
        );
        List<BallEntity> actual = service.sortByX(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByYTest() {
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(9, 8, 1, -4, 5),
                new BallEntity(1, 1, 2, 3, 1),
                new BallEntity(3, 3, 2, 1, 2),
                new BallEntity(4, 4, 4, 4, 4)
        );
        List<BallEntity> actual = service.sortByY(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByZTest() {
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(9, 8, 1, -4, 5),
                new BallEntity(3, 3, 2, 1, 2),
                new BallEntity(1, 1, 2, 3, 1),
                new BallEntity(4, 4, 4, 4, 4)
        );
        List<BallEntity> actual = service.sortByZ(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByRadiusTest() {
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(1, 1, 2, 3, 1),
                new BallEntity(3, 3, 2, 1, 2),
                new BallEntity(4, 4, 4, 4, 4),
                new BallEntity(9, 8, 1, -4, 5)
        );
        List<BallEntity> actual = service.sortByRadius(entities);
        Assert.assertEquals(actual, expected);
    }
}
