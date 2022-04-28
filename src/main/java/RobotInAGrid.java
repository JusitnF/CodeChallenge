import java.util.ArrayList;
import java.util.List;




public class RobotInAGrid {

    public List<Point> getPathing(boolean[][] map) {
        if (map ==null || map.length == 0) {
            return null;
        }

        List<Point> res= new ArrayList<>();
        if(getPathing(map, map.length - 1, map[0].length -1, res)) {
            return res;
        }
        return null;
    }

    private boolean getPathing(boolean[][] map, int row, int col, List<Point> path) {
        if(!map[row][col] || col < 0 || row < 0) {
            return false;
        }
        boolean AtStart = (row == 0) && (col ==0);
        if(getPathing(map, row, col - 1, path) || getPathing(map, row - 1, col, path) || AtStart) {
            Point p = new Point(row, col);
            path.add(p);
            return true;
        }
        return false;
    }
}
