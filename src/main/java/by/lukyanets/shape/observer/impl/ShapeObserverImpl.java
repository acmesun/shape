package by.lukyanets.shape.observer.impl;

import by.lukyanets.shape.entity.BallEntity;
import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.observer.ShapeEvent;
import by.lukyanets.shape.observer.ShapeObserver;
import by.lukyanets.shape.service.impl.BallServiceImpl;
import by.lukyanets.shape.warehouse.ShapeWarehouse;

public class ShapeObserverImpl implements ShapeObserver {

    @Override
    public void update(ShapeEvent event) throws ShapeException {
        BallEntity ballEntity = (BallEntity) event.getSource();
        BallServiceImpl service = new BallServiceImpl();
        ShapeWarehouse warehouse = ShapeWarehouse.getInstance();

        Integer ballId = ballEntity.getId();
        Double volume = service.findBallVolume(ballEntity);
        Double area = service.findBallArea(ballEntity);

        warehouse.addParam(ballId, area, volume);
    }
}
