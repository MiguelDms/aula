package modulo1.aula13_14.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<Pessoa>();

        try{
            Scanner fileScanner = new Scanner(new File("src/modulo1.aula13_14/exercicio1/Novo.txt"));
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] token = line.split(":");
                Pessoa pessoa = new Pessoa(token[0], Integer.parseInt(token[1]), token[2]);
                lista.add(pessoa);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }

        for (Pessoa pessoa: lista) {
            System.out.println(pessoa);
        }
    }
}
