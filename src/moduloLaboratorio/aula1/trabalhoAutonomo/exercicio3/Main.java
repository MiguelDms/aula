package moduloLaboratorio.aula1.trabalhoAutonomo.exercicio3;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread s1 = new StringMaker(1);
        Thread s2 = new StringMaker(2);
        Thread s3 = new StringMaker(3);

        s1.start();
        s1.join();
        s2.start();
        s2.join();
        s3.start();
    }
}
