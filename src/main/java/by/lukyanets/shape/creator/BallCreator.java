package by.lukyanets.shape.creator;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.entity.ShapeEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.repo.impl.BallRepository;
import by.lukyanets.shape.service.BallService;

public class BallCreator extends ShapeCreator {
    private static final int NUMBER_OF_PARAMETERS = 4;

    @Override
    protected ShapeEntity createShape(int id, double... params) throws ShapeException {
        if (params.length < NUMBER_OF_PARAMETERS) {
            throw new ShapeException("Cannot create " + BallService.class + ". Not enough parameters!");
        }
        BallEntity ballEntity = new BallEntity(id, params[0], params[1], params[2], params[3]);
        BallRepository.getInstance().add(ballEntity);
        return ballEntity;
    }

}
