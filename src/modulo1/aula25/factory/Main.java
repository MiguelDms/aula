package modulo1.aula25.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inimigo a;

        FabricaInimigo fabricaInimigo = new FabricaInimigo();
        Scanner s = new Scanner(System.in);

        if (s.hasNextLine()) {
            String letra = s.nextLine();
            a = fabricaInimigo.criarInimigo(letra);
        }
    }
}
