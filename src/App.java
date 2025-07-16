public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
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
