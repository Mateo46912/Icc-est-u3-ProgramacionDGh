import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // runEjerciciosPD();
        runMaze();
    }

    private static void runMaze() {
        boolean[][] predefinedMaze = {
            {true,true,true,true},
            {false,true,false,true},
            {true,true,false,false},
            {true,true,true,true},
        };

        //Maze con variable global
        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto-MATEO CORDERO");
        maze.printMaze();
        System.out.println();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSol> solvers =Arrays.asList(
            new MazeSolveRecursivo(),
            new MazeSolveRecursivoCompleto(),
            new MazeSolverRecursivoCompletoBT()
            //Sin implementar aun
            // new MazeSolveBFS(),
            // new MazeSolveDFS()
        );
        // MazeSol solver = solvers.get(0);
        // MazeResult path;
        
        // System.out.println("--DERECHA-ABAJO--");
        // path = solver.getPath(maze.getMatriz(), start, end);
        // System.out.println();
        // System.out.println("RECORRIDO DERECHA-ABAJO");
        // System.out.println(path);
        // System.out.println();

        // MazeSol solver2 = solvers.get(1);
        // MazeResult path2;
        
        // System.out.println("--TODAS LAS DIRECCIONES--");
        // path2 = solver2.getPath(maze.getMatriz(), start, end);
        // System.out.println();
        // System.out.println("RECORRIDO TODAS LAS DIRECCIONES");
        // System.out.println(path2);
        // System.out.println();

        
        System.out.println();
        System.out.println("--BT--");
        MazeSol solver3 = solvers.get(2);
        MazeResult resultado;
        
        resultado = solver3.getPath(maze.getMatriz(), start, end);
        System.out.println();
        System.out.println("RECORRIDO USANDO BT");
        System.out.println(resultado);
        System.out.println("RECORRIDO CELDAS VISITADAS");
        maze.printVisited(resultado.getVisited());
        System.out.println("RECORRIDO CAMINO RECORRIDO");
        maze.printPath(resultado.getPath());

    }



    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Mateo Cordero");
        System.out.println("Fibonacci Recursivo");
        long start = System.nanoTime();
        long resultado = ejerciciosPD.getFibonaci(50);
        long end = System.nanoTime();
        Double duration = (end-start)/1_000_000_000.0;
        System.out.println("Resultado = "+resultado+" en tiempo (s) = "+duration);

        System.out.println("Fibonacci Recursivo con Catching");
        start = System.nanoTime();
        resultado = ejerciciosPD.getFibonaciPD(50);
        end = System.nanoTime();
        duration = (end-start)/1_000_000_000.0;
        System.out.println("Resultado = "+resultado+" en tiempo (s) = "+duration);



    }
}
