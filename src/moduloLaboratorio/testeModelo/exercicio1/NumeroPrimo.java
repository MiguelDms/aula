package moduloLaboratorio.testeModelo.exercicio1;

import java.util.LinkedList;
import java.util.List;

public class NumeroPrimo implements Runnable{

    private int start;
    private int end;
    private List<Integer> primes = new LinkedList<>();

    public NumeroPrimo(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int aux = 2; aux < i; i++) {
                if (i % aux == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }
    }
}
