package modulo1.aula13_14.exercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {

    private Scanner scanner;
    private List<String> lista;
    private int id = 0;

    public ContaBancaria(Scanner scanner) {
        this.scanner = scanner;
        lista = new ArrayList<String>();
    }

    public void adicionar(String descricao, double valor, Scanner scanner) {
        while (scanner.hasNextLine()) {
            String ultimaLinha = scanner.nextLine();
            System.out.println(ultimaLinha);
            String[] token = ultimaLinha.split(";");
            id = Integer.parseInt(token[0]);
        }
        id++;
        lista.add(id + ";" + descricao + ";" + valor);

    }


    public void guardar() throws IOException {

        try {
            FileWriter fileWriter = new FileWriter("src/modulo1.aula13_14/exercicio3/Novo.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < lista.size(); i++) {
                printWriter.println(lista.get(i));
            }
            printWriter.close();
            System.out.println("Feito");
            } catch (FileNotFoundException e) {
                System.out.println("Ficheiro não encontrado");
                e.printStackTrace();
            }
    }
}
