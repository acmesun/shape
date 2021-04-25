package by.lukyanets.shape.sort.impl;

import by.lukyanets.shape.comparator.BallComparatorFactory;
import by.lukyanets.shape.comparator.PointComparatorFactory;
import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.sort.PointSortService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PointSortServiceImpl implements PointSortService {
    @Override
    public List<PointEntity> sortById(List<PointEntity> entities) {
        return entities.stream()
                .sorted(PointComparatorFactory.compareById())
                .collect(toList());
    }

    @Override
    public List<PointEntity> sortByX(List<PointEntity> entities) {
        return entities.stream()
                .sorted(PointComparatorFactory.compareByX())
                .collect(toList());
    }

    @Override
    public List<PointEntity> sortByY(List<PointEntity> entities) {
        return entities.stream()
                .sorted(PointComparatorFactory.compareByY())
                .collect(toList());
    }

    @Override
    public List<PointEntity> sortByZ(List<PointEntity> entities) {
        return entities.stream()
                .sorted(PointComparatorFactory.compareByZ())
                .collect(toList());
    }
}
