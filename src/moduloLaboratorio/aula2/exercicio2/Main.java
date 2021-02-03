package moduloLaboratorio.aula2.exercicio2;

public class Main {

    public static void main(String[] args) {
        Balcao balcao = new Balcao();
        Empregado empregado = new Empregado("Manel", balcao);
        Chefe chefe = new Chefe("Ze", balcao);
        Empregado empregado2 = new Empregado("Joaquim", balcao);
        Chefe chefe2 = new Chefe("Zeze", balcao);


        empregado.start();
        chefe.start();
        empregado2.start();
        chefe2.start();

    }
}
