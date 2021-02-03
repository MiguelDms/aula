package modulo1.aula13_14.exercicio6;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Reparaçao honda = new Reparaçao("honda", "Miguel", "agua", 20);
        Reparaçao mercedez = new Reparaçao("mercedez", "Miguel", "oleo", 20);
        try {
            mercedez.escrever(mercedez);
            honda.escrever(honda);
        } catch (IOException e) {
            e.printStackTrace();
        }

        honda.ler();

    }
}
