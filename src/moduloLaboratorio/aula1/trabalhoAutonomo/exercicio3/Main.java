package moduloLaboratorio.aula1.trabalhoAutonomo.exercicio3;

public class Main {

    public static void main(String[] args) {
        Thread s1 = new StringMaker(1);
        Thread s2 = new StringMaker(2);
        Thread s3 = new StringMaker(3);

        s1.start();
        s2.start();
        s3.start();
    }
}
