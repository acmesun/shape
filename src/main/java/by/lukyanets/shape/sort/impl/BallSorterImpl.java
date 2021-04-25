package by.lukyanets.shape.sort.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.sort.BallSorter;

import java.util.List;

import static by.lukyanets.shape.comparator.BallComparatorFactory.*;

public class BallSorterImpl extends ShapeSorter<BallEntity> implements BallSorter {
    @Override
    public List<BallEntity> sortById(List<BallEntity> entities) {
        return getSortedBy(entities, compareById());
    }

    @Override
    public List<BallEntity> sortByX(List<BallEntity> entities) {
        return getSortedBy(entities, compareByX());
    }

    @Override
    public List<BallEntity> sortByY(List<BallEntity> entities) {
        return getSortedBy(entities, compareByY());
    }

    @Override
    public List<BallEntity> sortByZ(List<BallEntity> entities) {
        return getSortedBy(entities, compareByZ());
    }

    @Override
    public List<BallEntity> sortByRadius(List<BallEntity> entities) {
        return getSortedBy(entities, compareByRadius());
    }


}

