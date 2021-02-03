package moduloLaboratorio.aula4.exercicio4;

public class Main {

    public static void main(String[] args) {
        Reservatorio r = new Reservatorio();
        Telefonista t = new Telefonista("Teresa a telefonista", r);
        Funcionario[] f = new Funcionario[10];

        for (int i = 0; i < 10; i++) {
            f[i] = new Funcionario("Funcionario " + i, r);
        }

        t.start();

        for (int i = 0; i < 10; i++) {
            f[i].start();
        }
    }
}
