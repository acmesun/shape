package by.lukyanets.shape.repository;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.repo.impl.BallRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BallRepositoryTest {
    private final BallRepository repository = BallRepository.getInstance();

    @BeforeTest
    public void toRepo() {
        BallEntity entity1 = new BallEntity(1, 1.0, 1.0, 25.0, 2.2);
        BallEntity entity2 = new BallEntity(3, 4.0, -55.0, -9.0, 10.0);
        BallEntity entity3 = new BallEntity(8, 6.0, 2.0, -7.0, 2.7);
        BallEntity entity4 = new BallEntity(5, -1.0, 3.0, 1.0, 4.9);
        BallEntity entity5 = new BallEntity(2, 8.0, 7.0, -6.0, 25.0);
        repository.add(entity1);
        repository.add(entity2);
        repository.add(entity3);
        repository.add(entity4);
        repository.add(entity5);
    }

    @Test
    public void findAllInTheFirstQuadrant() {
        List<BallEntity> actual = repository.findAllInTheFirstQuadrant();
        List<BallEntity> expected = Collections.singletonList(
                new BallEntity(1, 1.0, 1.0, 25.0, 2.2)
        );
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAllByXLessEmptyResult() {
        List<BallEntity> actual = repository.findAllByXLess(-10.0);
        List<BallEntity> expected = new ArrayList<>();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAllByXLess() {
        List<BallEntity> actual = repository.findAllByXLess(6.0);
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(1, 1.0, 1.0, 25.0, 2.2),
                new BallEntity(3, 4.0, -55.0, -9.0, 10.0),
                new BallEntity(5, -1.0, 3.0, 1.0, 4.9)
        );
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAllByRadiusNegativeRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> repository.findAllByRadius(-5));
    }

    @Test
    public void findAllByRadiusZeroRadiusTest() {
        Assert.assertThrows(ShapeException.class, () -> repository.findAllByRadius(0));
    }

    @Test
    public void findAllByRadiusEmptyResultTest() throws ShapeException {
        List<BallEntity> actual = repository.findAllByRadius(11.0);
        List<BallEntity> expected = new ArrayList<>();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAllByRadiusTest() throws ShapeException {
        List<BallEntity> actual = repository.findAllByRadius(10.0);
        List<BallEntity> expected = Collections.singletonList(new BallEntity(3, 4.0, -55.0, -9.0, 10.0));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAllByRadiusBetweenTest() throws ShapeException {
        List<BallEntity> actual = repository.findAllByRadiusBetween(2, 5);
        List<BallEntity> expected = Arrays.asList(
                new BallEntity(1, 1.0, 1.0, 25.0, 2.2),
                new BallEntity(5, -1.0, 3.0, 1.0, 4.9),
                new BallEntity(8, 6.0, 2.0, -7.0, 2.7)
        );
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAllByRadiusBetweenWrongParam() {
        Assert.assertThrows(ShapeException.class, () -> repository.findAllByRadiusBetween(5.0, -2.0));
    }
}
