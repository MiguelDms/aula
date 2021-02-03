package moduloLaboratorio.aula4.exercicio1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        AMinhaTarefa t1 = new AMinhaTarefa();
        AMinhaTarefa t2 = new AMinhaTarefa();
        AMinhaTarefa t3 = new AMinhaTarefa();
        AMinhaTarefa t4 = new AMinhaTarefa();
        AMinhaTarefa t5 = new AMinhaTarefa();
        AMinhaTarefa t6 = new AMinhaTarefa();


        ExecutorService pool = Executors.newFixedThreadPool(6);

        pool.submit(t1);
        pool.submit(t2);
        pool.submit(t3);
        pool.submit(t4);
        pool.submit(t5);
        pool.submit(t6);
    }
}
