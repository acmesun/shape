package by.lukyanets.shape.repo.impl;

import by.lukyanets.shape.entity.PointEntity;

import java.util.List;

import static java.util.stream.Collectors.toList;

public final class PointRepository extends ShapeRepository<PointEntity> {
    private static final PointRepository INSTANCE = new PointRepository();

    private PointRepository() {
    }

    public static PointRepository getInstance() {
        return INSTANCE;
    }

    public List<PointEntity> findAllPointsInTheFirstQuadrant() {
        return getData()
                .values()
                .stream().filter(it -> it.getX() >= 0 && it.getY() >= 0 && it.getZ() >= 0)
                .collect(toList());

    }

    public List<PointEntity> findAllPointsInTheSecondQuadrant() {
        return getData()
                .values()
                .stream().filter(it -> it.getX() <= 0 && it.getY() >= 0 && it.getZ() >= 0)
                .collect(toList());
    }
}
