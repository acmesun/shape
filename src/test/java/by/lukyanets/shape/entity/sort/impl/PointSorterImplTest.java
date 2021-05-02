package by.lukyanets.shape.entity.sort.impl;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.sort.impl.PointSorterImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PointSorterImplTest {
    private final List<PointEntity> entities = Arrays.asList(
            new PointEntity(8, 1, 2, 30),
            new PointEntity(6, -3, 5, 1),
            new PointEntity(9, 8, -7, -4),
            new PointEntity(15, -4, 4, 4)
    );
    private final PointSorterImpl service = new PointSorterImpl();

    @Test
    public void sortByIdTest() {
        List<PointEntity> expected = Arrays.asList(
                new PointEntity(6, -3, 5, 1),
                new PointEntity(8, 1, 2, 30),
                new PointEntity(9, 8, -7, -4),
                new PointEntity(15, -4, 4, 4)
        );
        List<PointEntity> actual = service.sortById(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByXTest() {
        List<PointEntity> expected = Arrays.asList(
                new PointEntity(15, -4, 4, 4),
                new PointEntity(6, -3, 5, 1),
                new PointEntity(8, 1, 2, 30),
                new PointEntity(9, 8, -7, -4)
        );
        List<PointEntity> actual = service.sortByX(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByYTest() {
        List<PointEntity> expected = Arrays.asList(
                new PointEntity(9, 8, -7, -4),
                new PointEntity(8, 1, 2, 30),
                new PointEntity(15, -4, 4, 4),
                new PointEntity(6, -3, 5, 1)
        );
        List<PointEntity> actual = service.sortByY(entities);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void sortByZTest() {
        List<PointEntity> expected = Arrays.asList(
                new PointEntity(9, 8, -7, -4),
                new PointEntity(6, -3, 5, 1),
                new PointEntity(15, -4, 4, 4),
                new PointEntity(8, 1, 2, 30)
        );
        List<PointEntity> actual = service.sortByZ(entities);
        Assert.assertEquals(actual, expected);
    }
}
