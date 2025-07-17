
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



    public boolean[][] getMatriz() {
        return matriz;
    }




    public void setMatriz(boolean[][] matriz) {
        this.matriz = matriz;
    }
}
