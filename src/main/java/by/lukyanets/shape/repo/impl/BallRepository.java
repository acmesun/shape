package by.lukyanets.shape.repo.impl;

import by.lukyanets.shape.entity.BallEntity;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public final class BallRepository extends ShapeRepository<BallEntity> {
    private static final BallRepository INSTANCE = new BallRepository();

    private BallRepository() {
    }

    public static BallRepository getInstance() {
        return INSTANCE;
    }

    public List<BallEntity> findAllByRadiusBetween(double minInclusive, double maxExclusive) {
        //TODO: Validation
        return getData()
                .values()
                .stream().filter(it -> it.getRadius() < maxExclusive && it.getRadius() >= minInclusive)
                .collect(toList());
    }
}
