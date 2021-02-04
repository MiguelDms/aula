package moduloLaboratorio.aula3.trabalhoAutonomo.exercicio2;

import moduloLaboratorio.aula2.Thread1;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        CyclicBarrier c = new CyclicBarrier(5);
        EmEspera emEspera1 = new EmEspera("Miguel em espera", c);
        EmEspera emEspera2 = new EmEspera("Joana em espera", c);
        EmEspera emEspera3 = new EmEspera("Carla em espera", c);
        EmEspera emEspera4 = new EmEspera("Ines em espera", c);
        EmEspera emEspera5 = new EmEspera("Ze em espera", c);

        Thread t1 = new Thread(emEspera1);
        Thread t2 = new Thread(emEspera2);
        Thread t3 = new Thread(emEspera3);
        Thread t4 = new Thread(emEspera4);
        Thread t5 = new Thread(emEspera5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
