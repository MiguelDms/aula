package modulo1.aula12.enumeradosExcepçoes.ExercicioAula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valor1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação");
        String line = scanner.nextLine();
        Operaçoes operaçoes = Operaçoes.valueOf(line);
        System.out.println("Insira um valor");
        try {
            valor1 = scanner.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("O valor inserido não é um inteiro");
        }

        System.out.println("Insira outro valor");
        int valor2 = scanner.nextInt();

        operação(valor1, valor2, operaçoes);
    }

    public static void operação(int valor1, int valor2, Operaçoes operaçoes) {
        switch (operaçoes) {
            case SOMA:
                System.out.println(valor1 + valor2);
                break;
            case SUBTRAÇAO:
                System.out.println(valor1 - valor2);
            break;
            case DIVISAO:
                try{
                    System.out.println(valor1 / valor2);
                } catch (ArithmeticException a) {
                    System.out.println("Houve um problema na divisão. Não há divisões por zero");
                    a.printStackTrace();
                }
            break;
            case MULTIPLICAÇAO:
                System.out.println(valor1 * valor2);
            break;
        }
    }

}
