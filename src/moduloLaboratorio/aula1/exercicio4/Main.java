package moduloLaboratorio.aula1.exercicio4;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread par = new Par();
        Thread impar = new Impar();

        par.start();
        impar.start();

    }
}
