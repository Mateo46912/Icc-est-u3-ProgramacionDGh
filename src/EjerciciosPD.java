import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {
    Map<Integer, Long> mapFibonaci = new HashMap<>();

    public long getFibonaci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonaci(n - 1) + getFibonaci(n - 2);
    }

    public Long getFibonaciPD(int n) {

        if (n <= 1) {
            return (long) n;
        }
        if (mapFibonaci.containsKey(n)) {
            return mapFibonaci.get(n);
        }

        Long resultado = getFibonaciPD(n - 1) + getFibonaciPD(n - 2);
        mapFibonaci.put(n, resultado);
        return resultado;
    }

}
