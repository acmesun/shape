package by.lukyanets.shape.sort.impl;

import by.lukyanets.shape.entity.ShapeEntity;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public abstract class ShapeSorter<T extends ShapeEntity> {

    protected List<T> getSortedBy(List<T> entities,
                                  Comparator<T> comparator) {
        return entities.stream()
                .sorted(comparator)
                .collect(toList());
    }
}
