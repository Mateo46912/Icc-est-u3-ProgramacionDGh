import java.util.List;
import java.util.Set;

public class Maze {

    private boolean[][] matriz;

    public Maze(boolean[][] matriz) {
        this.matriz = matriz;
    }

    public void printMaze() {
        for (boolean[] bs : matriz) {
            System.out.println();
            for (boolean b : bs) {
                if (b == true) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
        }

    }

    public void printVisited(Set<Cell> visited) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Cell c = new Cell(i, j);
                if (!matriz[i][j]) {
                    System.out.print(" * ");
                } else if (visited.contains(c)) {
                    System.out.print(" > ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public void printPath(List<Cell> path) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Cell c = new Cell(i, j);
                if (!matriz[i][j]) {
                    System.out.print(" * ");
                } else if (path.contains(c)) {
                    System.out.print(" > ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public boolean[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(boolean[][] matriz) {
        this.matriz = matriz;
    }
}
