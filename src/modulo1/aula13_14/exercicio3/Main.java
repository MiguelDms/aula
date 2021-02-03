package modulo1.aula13_14.exercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(new File("src/modulo1.aula13_14/exercicio3/Novo.txt"));
            ContaBancaria contaBancaria = new ContaBancaria(scanner);
            contaBancaria.adicionar("Comprei uma bola", 30, scanner);
            contaBancaria.adicionar("Comprei um gelado", 30, scanner);
            contaBancaria.adicionar("Comprei uma girafa", 30, scanner);
            contaBancaria.guardar();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
