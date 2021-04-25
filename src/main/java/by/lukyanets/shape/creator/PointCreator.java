package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.PointEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.repo.impl.PointRepository;

public class PointCreator extends ShapeCreator {
    @Override
    protected ShapeEntity createShape(int id, double... params) throws ShapeException {
        extractedParamsToPoint(params);
        PointEntity pointEntity = new PointEntity(id, params[0], params[1], params[2]);
        PointRepository.getInstance().add(pointEntity);
        return pointEntity;
    }

    private void extractedParamsToPoint(double[] params) throws ShapeException {
        if (params.length < 3) {
            throw new ShapeException("Cannot create " + PointEntity.class + ". Not enough parameters!");
        }
    }
}
