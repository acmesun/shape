package by.lukyanets.shape.comparator;

import by.lukyanets.shape.entity.ShapeEntity;

import java.util.Comparator;

public class ShapeComparator<T extends ShapeEntity> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }

    public int compareById(T entity1, T entity2) {
        return Integer.compare(entity1.getId(), entity2.getId());
    }

}
