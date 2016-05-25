package model;

/**
 * Created by nikeshs on 24/05/16.
 */
public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void incrementX() {
        x++;
    }

    public void incrementY() {
        y++;
    }

    public void decrementX() {
        x--;
    }

    public void decrementY() {
        y--;
    }

}
