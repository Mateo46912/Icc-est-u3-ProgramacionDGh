import java.util.ArrayList;
import java.util.List;

public class MazeSolveRecursivo implements MazeSol {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        if (grid == null || grid.length == 0) {
            return new ArrayList<>();
        }

        List<Cell> path = new ArrayList<>();
        if (findPath(grid,start,end,path)) {
            return path;
        }
        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path) {
        int row = start.row;
        int cole = start.cole;
        //Valido si la celda start su fila esta  en mi grid
        //Valido si la celda start su row esta  en mi grid
        //Valido si la celda es transitable == true
        if(row >= grid.length || cole>= grid[0].length || !grid[row][cole]){
            return false;
        }

        //si encontro returna las celdas recorridas osea start
        if(row == end.row && cole == end.cole){
            path.add(start);
            return true;
        }

        //Moverse a la derecha y si existe devolver true y agregar 
        if(findPath(grid, new Cell(row+1, cole), end, path)){
            path.add(start);
            return true;
        }
        //Moverse abajo
        if(findPath(grid, new Cell(row, cole+1), end, path)){
            path.add(start);
            return true;
        }

        return false;
    }

}
