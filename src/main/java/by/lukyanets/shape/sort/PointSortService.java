package by.lukyanets.shape.sort;

import by.lukyanets.shape.entity.PointEntity;

import java.util.List;

public interface PointSortService {

    List<PointEntity> sortById();

    List<PointEntity> sortByX();

    List<PointEntity> sortByY();

    List<PointEntity> sortByZ();

}
