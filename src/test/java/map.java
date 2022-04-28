import org.junit.platform.commons.annotation.Testable;

@Testable
public class map {
    int[][] map = new int[][] {
            {0,0,0,0},
            {0,1,0,0},
            {0,0,1,0}};
    Point start = new Point(0,0);
    Point end = new Point(map.length - 1, map[0].length -1);
    //getPathing.add(start);
}
