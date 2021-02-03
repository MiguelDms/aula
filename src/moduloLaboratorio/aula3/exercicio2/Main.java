package moduloLaboratorio.aula3.exercicio2;

public class Main {

    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        Thread c1 = new Cozinheiro("Manel", mesa);
        //Thread c2 = new Cozinheiro("Ze", mesa);

        Thread g1 = new Glutao("Ui", mesa);
        Thread g2 = new Glutao("Rui", mesa);
        Thread g3 = new Glutao("Iur", mesa);


        c1.start();
        g3.start();

        g1.start();
        g2.start();


    }
}
