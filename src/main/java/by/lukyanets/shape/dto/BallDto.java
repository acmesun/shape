package by.lukyanets.shape.dto;

public class BallDto {
    private final PointDto point;
    private final double radius;

    public BallDto(PointDto point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public PointDto getPoint() {
        return point;
    }

    public double getRadius() {
        return radius;
    }
}