package moduloLaboratorio.aula3.exercicio4;

public class Main {

    public static void main(String[] args) {
        Transportadora t = new Transportadora();

        Cliente c1 = new Cliente("Cliente 1", t);
        Cliente c2 = new Cliente("Cliente 2", t);
        Cliente c3 = new Cliente("Cliente 3", t);
        Cliente c4 = new Cliente("Cliente 4", t);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
