package moduloLaboratorio.testeModelo.exercicio1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int VALOR_MAX = 100;

    public static void main(String[] args) throws InterruptedException {
        List<NumeroPrimo> tarefas = new LinkedList<>();
        List<Integer> primos = new LinkedList<>();

        ExecutorService pool = Executors.newFixedThreadPool(4);

        int inc = VALOR_MAX / 4;
        for (int i = 0; i < VALOR_MAX; i = i + inc) {
            NumeroPrimo task = new NumeroPrimo(i+1, i+inc);
            tarefas.add(task);
            pool.submit(task);
        }

        pool.shutdown();
        pool.awaitTermination(100, TimeUnit.SECONDS);

        for (NumeroPrimo t : tarefas) {
            primos.addAll(t.getPrimes());
        }

        Collections.sort(primos);

        System.out.println(primos);
    }
}
