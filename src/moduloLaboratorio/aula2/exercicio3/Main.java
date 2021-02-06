package moduloLaboratorio.aula2.exercicio3;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        ImpressaoNumerosELetras imp = new ImpressaoNumerosELetras();
        CyclicBarrier c = new CyclicBarrier(2);

        Thread imprimeLetras = new ImprimeLetras(imp, c);
        Thread imprimeNumero = new ImprimeNumeros(imp, c);

        imprimeLetras.start();
        imprimeNumero.start();



    }
}
