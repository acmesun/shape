package by.lukyanets.shape.repo.impl;

import by.lukyanets.shape.entity.PointEntity;

public final class PointRepository extends ShapeRepository<PointEntity> {
    private static final PointRepository INSTANCE = new PointRepository();

    private PointRepository() {
    }

    public static PointRepository getInstance() {
        return INSTANCE;
    }
}
