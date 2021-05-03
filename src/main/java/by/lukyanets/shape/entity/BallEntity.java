package by.lukyanets.shape.entity;

import by.lukyanets.shape.exception.ShapeException;
import by.lukyanets.shape.observer.ShapeEvent;
import by.lukyanets.shape.observer.ShapeObservable;
import by.lukyanets.shape.observer.ShapeObserver;

import java.util.ArrayList;
import java.util.Objects;

public class BallEntity extends ShapeEntity implements ShapeObservable {

    private double x;
    private double y;
    private double z;
    private double radius;
    private final ArrayList<ShapeObserver> shapeObservers = new ArrayList<>();

    public BallEntity(int id, double x, double y, double z, double radius) {
        super(id);
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) throws ShapeException {
        this.x = x;
        notifyObservers();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) throws ShapeException {
        this.y = y;
        notifyObservers();
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) throws ShapeException {
        this.z = z;
        notifyObservers();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws ShapeException {
        this.radius = radius;
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Double.compare(that.z, z) == 0 && Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, radius);
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void notifyObservers() throws ShapeException {
        ShapeEvent event = new ShapeEvent(this);
        if (!shapeObservers.isEmpty()) {
            for (ShapeObserver observer : shapeObservers) {
                observer.update(event);
            }
        }
    }

    @Override
    public void addObserver(ShapeObserver shapeObserver) {
        shapeObservers.add(shapeObserver);
    }

    @Override
    public void deleteObserver(ShapeObserver shapeObserver) {
        shapeObservers.remove(shapeObserver);
    }
}
