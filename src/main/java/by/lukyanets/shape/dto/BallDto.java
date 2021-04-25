package by.lukyanets.shape.dto;

public class BallDto {
    private final int id;
    private final long x;
    private final long y;
    private final long z;
    private final long radius;

    public BallDto(int id, long x, long y, long z, long radius) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getZ() {
        return z;
    }

    public long getRadius() {
        return radius;
    }
}