package by.lukyanets.shape.sort.impl;

import by.lukyanets.shape.comparator.BallComparatorFactory;
import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.sort.BallSortService;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class BallSortServiceImpl implements BallSortService {

    @Override
    public List<BallEntity> sortById(List<BallEntity> entities) {
        return entities.stream()
                .sorted(BallComparatorFactory.compareById())
                .collect(toList());
    }

    @Override
    public List<BallEntity> sortByX(List<BallEntity> entities) {
        return entities.stream()
                .sorted(BallComparatorFactory.compareByX())
                .collect(toList());
    }

    @Override
    public List<BallEntity> sortByY(List<BallEntity> entities) {
        return entities.stream()
                .sorted(BallComparatorFactory.compareByY())
                .collect(toList());
    }

    @Override
    public List<BallEntity> sortByZ(List<BallEntity> entities) {
        return entities.stream()
                .sorted(BallComparatorFactory.compareByZ())
                .collect(toList());
    }

    @Override
    public List<BallEntity> sortByRadius(List<BallEntity> entities) {
        return entities.stream()
                .sorted(BallComparatorFactory.compareByRadius())
                .collect(toList());
    }
}
