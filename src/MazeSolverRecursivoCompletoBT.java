import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MazeSolverRecursivoCompletoBT implements MazeSol {
    List<Cell> path;
    Set<Cell> visited;
    private boolean [][] grid;
    private Cell end;

    
    public MazeSolverRecursivoCompletoBT() {
        path = new ArrayList<>();
        visited = new LinkedHashSet<>();
    }

    @Override
    public MazeResult getPath(boolean[][] grid, Cell start, Cell end) {

       path.clear();
       visited.clear();
       this.grid = grid;
       this.end = end;

       if(grid == null || grid.length == 0){
            return  new MazeResult(path, visited);
       }

       if(findPath(start)){
        System.out.print("RUTA VISITADA: ");
        System.out.println(visited);
        System.out.print("RUTA OPTIMA: ");
        System.out.println(path);
        return new MazeResult(path, visited);
       }
       return new MazeResult(path, visited);
    }

    private boolean findPath(Cell current){ 

       if(!isInMaze(current))
           return false; 
       
       if(!isValid(current))
        return false;
       
       path.add(current);
       visited.add(current);

       //Valido si llegue al final
       if(current.equals(end)){
        return true;
       }

       //Me muevo en las 4 direcciones 

       if(findPath(new Cell(current.row, current.cole+1))|| 
       findPath(new Cell(current.row+1, current.cole))||
       findPath(new Cell(current.row, current.cole-1))||
       findPath(new Cell(current.row-1, current.cole))
       ){
        return true;
       }

       //Retirar del path
       path.remove(path.size()-1);
       return false;
    }


    private boolean isValid(Cell current) {
        int row = current.row;
        int cole = current.cole;
        if(!grid[row][cole] || visited.contains(current))
            return false;
        
        return true;
    }

    private boolean isInMaze(Cell current) {
        int row = current.row;
        int cole = current.cole;

        if(row<0 || row>=grid.length || cole<0 || cole>=grid[0].length)
            return false;
        
        return true;  

        
    }

}
