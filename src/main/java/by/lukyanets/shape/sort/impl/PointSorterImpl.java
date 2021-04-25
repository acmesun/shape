package by.lukyanets.shape.sort.impl;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.sort.PointSorter;

import java.util.List;

import static by.lukyanets.shape.comparator.PointComparatorFactory.*;

public class PointSorterImpl extends ShapeSorter<PointEntity> implements PointSorter {
    @Override
    public List<PointEntity> sortById(List<PointEntity> entities) {
        return getSortedBy(entities, compareById());
    }

    @Override
    public List<PointEntity> sortByX(List<PointEntity> entities) {
        return getSortedBy(entities, compareByX());
    }

    @Override
    public List<PointEntity> sortByY(List<PointEntity> entities) {
        return getSortedBy(entities, compareByY());
    }

    @Override
    public List<PointEntity> sortByZ(List<PointEntity> entities) {
        return getSortedBy(entities, compareByZ());
    }
}
