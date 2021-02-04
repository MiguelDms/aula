package moduloLaboratorio.aula4.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    List<Roda> rodasParaCarro = new ArrayList<>();
    Chassis chassis = null;
    Motor motor = null;

    public synchronized void insereMotor(Motor m) throws InterruptedException {
        while (rodasParaCarro.size() < 4 || chassis == null) {
            wait();
        }
        addToListaCarro(m);
        notifyAll();
    }

    public synchronized void insereRoda(Roda r) throws InterruptedException {
        while (chassis == null && motor == null) {
            wait();
        }
        addToListaCarro(r);
        notifyAll();
    }

    public synchronized void insereChassis(Chassis c) throws InterruptedException {
        while (rodasParaCarro.size() > 0 || motor != null) {
            wait();
        }
        addToListaCarro(c);
        notifyAll();
    }

    public void addToListaCarro(Object o) {
        if (o instanceof Roda) {
            rodasParaCarro.add((Roda) o);
            System.out.println("Roda adicionada ás partes");
        } else if(o instanceof Motor) {
            motor = (Motor) o;
            System.out.println("Motor adicionado ás partes");
        } else {
            chassis = (Chassis) o;
            System.out.println("Chassis adicionado ás partes");
        }

        contarPartes();
    }

    public void contarPartes() {
        Carro carro = null;
        if (rodasParaCarro.size() == 4 && motor != null && chassis != null) {
            carro = new Carro(rodasParaCarro, motor, chassis);
            System.out.println(carro.toString());
            rodasParaCarro.clear();
            this.motor = null;
            this.chassis = null;
        }
    }
}
