package moduloLaboratorio.aula4.exercicio5;


import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        CyclicBarrier c = new CyclicBarrier(5);
        Barbearia b = new Barbearia();
        Barbeiro barbeiro = new Barbeiro("Antonio", b);
        Cliente c1 = new Cliente("Cliente1", b, c);
        Cliente c2 = new Cliente("Cliente2", b, c);
        Cliente c3 = new Cliente("Cliente3", b, c);
        Cliente c4 = new Cliente("Cliente4", b, c);
        Cliente c5 = new Cliente("Cliente5", b, c);

        barbeiro.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();


    }
}
