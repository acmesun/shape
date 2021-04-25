package by.lukyanets.shape.dto;

public class BallDto {
    private final PointDto point;
    private final double r;

    public BallDto(PointDto point, double r) {
        this.point = point;
        this.r = r;
    }

    public PointDto getPoint() {
        return point;
    }

    public double getR() {
        return r;
    }
}