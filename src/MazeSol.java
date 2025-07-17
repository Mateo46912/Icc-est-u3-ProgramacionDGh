import java.util.List;

public interface MazeSol {

    List<Cell> getPath(boolean[][] grid, Cell start,Cell end);
}
