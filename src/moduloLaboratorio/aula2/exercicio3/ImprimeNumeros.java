package moduloLaboratorio.aula2.exercicio3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ImprimeNumeros extends Thread{

    private ImpressaoNumerosELetras imp;
    private CyclicBarrier c;

    public ImprimeNumeros(ImpressaoNumerosELetras imp, CyclicBarrier c) {
        this.imp = imp;
        this.c = c;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 46; i++) {
            imp.insereNumero(i);
        }

        System.out.println(imp.getNumerosELetras());
    }
}
