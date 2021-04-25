package by.lukyanets.shape.sort;

import by.lukyanets.shape.entity.BallEntity;

import java.util.List;

public interface BallSorter {
    List<BallEntity> sortById(List<BallEntity> entities);

    List<BallEntity> sortByX(List<BallEntity> entities);

    List<BallEntity> sortByY(List<BallEntity> entities);

    List<BallEntity> sortByZ(List<BallEntity> entities);

    List<BallEntity> sortByRadius(List<BallEntity> entities);
}
