import java.util.ArrayList;
import java.util.List;

public class MazeSolveRecursivoCompleto implements MazeSol {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        if (grid == null || grid.length == 0) {
            return new ArrayList<>();
        }

        List<Cell> path = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length]; // 👈 agregado

        if (findPath(grid, start, end, path, visited)) {
            return path;
        }
        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path, boolean[][] visited) {
        int row = start.row;
        int cole = start.cole;

        // Validación de índices negativos y si ya fue visitado
        if (row < 0 || cole < 0 || row >= grid.length || cole >= grid[0].length || !grid[row][cole] || visited[row][cole]) {
            return false;
        }

        visited[row][cole] = true;

        if (row == end.row && cole == end.cole) {
            path.add(start);
            return true;
        }

        if (findPath(grid, new Cell(row + 1, cole), end, path, visited)) {
            path.add(start);
            return true;
        }
        if (findPath(grid, new Cell(row, cole + 1), end, path, visited)) {
            path.add(start);
            return true;
        }
        if (findPath(grid, new Cell(row - 1, cole), end, path, visited)) {
            path.add(start);
            return true;
        }
        if (findPath(grid, new Cell(row, cole - 1), end, path, visited)) {
            path.add(start);
            return true;
        }

        return false;
    }
}
