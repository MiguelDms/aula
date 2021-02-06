package moduloLaboratorio.aula2.exercicio3;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ImprimeLetras extends Thread{

    private ImpressaoNumerosELetras imp;
    private String abcedario = "abcdefghijlmnopqrstuvxz";
    private CyclicBarrier c;

    public ImprimeLetras(ImpressaoNumerosELetras imp, CyclicBarrier c) {
        this.imp = imp;
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < abcedario.length(); i++) {
            imp.insereLetras(String.valueOf(abcedario.charAt(i)));
        }
    }
}