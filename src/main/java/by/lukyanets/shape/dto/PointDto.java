package by.lukyanets.shape.dto;

public class PointDto {
    private final int id;
    private final long x;
    private final long y;
    private final long z;

    public PointDto(int id, long x, long y, long z) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
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
}
