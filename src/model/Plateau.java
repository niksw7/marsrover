package model;

/**
 * Created by nikeshs on 24/05/16.
 */
public class Plateau {
    private int[][] size;

    public Plateau(String size) {
        String[] temp = size.split(" ");
        int rows = Integer.parseInt(temp[0]);
        int cols = Integer.parseInt(temp[1]);
        this.size = new int[rows+1][cols+1];
    }
}
