package by.lukyanets.shape.dto;

public class BallDto {
    private final double x;
    private final double y;
    private final double z;
    private final double r;

    public BallDto(double x, double y, double z, double r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getR() {
        return r;
    }
}
