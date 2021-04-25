package by.lukyanets.shape.sort;

import by.lukyanets.shape.entity.PointEntity;

import java.util.List;

public interface PointSorter {

    List<PointEntity> sortById(List<PointEntity> entities);

    List<PointEntity> sortByX(List<PointEntity> entities);

    List<PointEntity> sortByY(List<PointEntity> entities);

    List<PointEntity> sortByZ(List<PointEntity> entities);

}
