package modulo1.aula13_14.exercicio4;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de lampadas a comprar");
        int numero = scanner.nextInt();
        System.out.println("Digite a potencia das lampadas");
        int potencia = scanner.nextInt();

        Lampada lampada = new Lampada(potencia, numero);
        lampada.guardarLampadas(lampada);
    }
}
