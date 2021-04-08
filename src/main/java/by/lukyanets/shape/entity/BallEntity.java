package by.lukyanets.shape.entity;

import java.util.Objects;

public class BallEntity {
    private final int ballID;

    public BallEntity(int ballID) {
        this.ballID = ballID;
    }

    public int getBallID() {
        return ballID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return ballID == that.ballID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballID);
    }

    @Override
    public String toString() {
        return "BallEntity {" + "ballID = " + ballID + "}";
    }
}
