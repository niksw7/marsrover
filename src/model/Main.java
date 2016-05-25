package model;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

/**
 * Created by nikeshs on 24/05/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String plateauSize = br.readLine();
        Plateau plateau = new Plateau(plateauSize);
        String line;
        ArrayList<Robot> robots= new ArrayList<>();
        while(!(line = br.readLine()).isEmpty()){

            System.out.println("reading line "+line);
            String[] split = line.split(" ");
            Coordinate coordinate = new Coordinate(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            Robot robot = new Robot(coordinate,split[2]);

            line = br.readLine();
            for (char c : line.toCharArray()) {
                if("M".charAt(0)==c){
                    robot.move();
                }else if("L".charAt(0)== c){
                    robot.headLeft();
                }else if("R".charAt(0)==c){
                    robot.headRight();
                }
            }
            robots.add(robot);

        }
        robots.forEach((robot)-> System.out.println(robot.whereAmI()));
    }
}
