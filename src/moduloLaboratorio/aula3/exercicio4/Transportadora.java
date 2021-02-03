package moduloLaboratorio.aula3.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Transportadora {
    List<Encomenda> encomendaList = new ArrayList<>();
    CyclicBarrier barrier;

    public void envia(Encomenda e) throws BrokenBarrierException, InterruptedException {
        barrier = new CyclicBarrier(4);
        barrier.await();

        //se a barreira libertou foi porque as 5 threads fieram o await
        System.out.println("A encomenda " + e.getNome() + " foi enviada");
    }
}
