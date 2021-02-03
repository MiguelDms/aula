package modulo1.aula13_14.exercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esreva o seu nome");
        String nome = scanner.nextLine();
        System.out.println("Escreva a sua idade");
        int idade = scanner.nextInt();

        escrever(nome, idade);

    }

    public static void escrever(String nome, int idade) {

        try {
            PrintWriter printWriter = new PrintWriter(new File("src/modulo1.aula13_14/exercicio2/Novo.txt"));
            printWriter.println(nome);
            printWriter.println(idade);
            printWriter.close();
            System.out.println("Feito");
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }


    }

}
