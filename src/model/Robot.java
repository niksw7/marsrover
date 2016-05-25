package model;

/**
 * Created by nikeshs on 24/05/16.
 */
public class Robot {
    private Coordinate coordinate;
    private Head head;

    public Robot(Coordinate coordinate, String head) {
        this.coordinate = coordinate;
        this.head = Head.valueOf(head);
    }

    public void move() {
        if (Head.N.equals(head)) {
            coordinate.incrementY();

        } else if (Head.E.equals(head)) {
            coordinate.incrementX();

        } else if (Head.W.equals(head)) {
            coordinate.decrementX();
        } else {
            coordinate.decrementY();
        }
    }

    public void headLeft() {
        head = head.previous();
    }
    public void headRight() {
        head = head.next();
    }

    public String whereAmI(){
return coordinate.getX() +" "+coordinate.getY() +" " +head;
    }
}
