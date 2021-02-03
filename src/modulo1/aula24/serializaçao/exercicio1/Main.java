package modulo1.aula24.serializaçao.exercicio1;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Prima 1 para salvar dados, ou 2 para carregar os dados.");
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();

        if (line == 1) {

            System.out.println("Introduza o seu nome");
            String noment = scanner.nextLine();
            String hello = scanner.nextLine();

            System.out.println("Introduza uma mensagem");
            String mensagem = scanner.nextLine();

            System.out.println("Introduza um titulo");
            String titulo = scanner.nextLine();

            User user = new User(hello, mensagem, titulo);

            System.out.println("Introduza o nome do ficheiro a guardar");
            String nomeFicheiro = scanner.nextLine();

            guardar(user, nomeFicheiro);

        } else if (line == 2) {

            System.out.println("Introduza o nome do ficheiro a carregar");
            String nomeFich = scanner.nextLine();
            nomeFich = scanner.nextLine();
            carregar(nomeFich);

        }

    }

    public static void guardar(User user, String nomeFicheiro) {
        try{
            FileOutputStream fileOut = new FileOutputStream(nomeFicheiro + ".dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro a salvar o ficheiro");
        }
    }

    public static void carregar(String nomeFicheiro) {
        try{
            FileInputStream fileIn = new FileInputStream(nomeFicheiro + ".dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            User loaded = (User) in.readObject();
            in.close();
            fileIn.close();

            System.out.println(loaded.getNome() + " " + loaded.getTexto() + " " + loaded.getTitulo());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro a carregar o ficheiro");
        }
    }


}
