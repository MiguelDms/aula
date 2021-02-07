package moduloLaboratorio.aula4.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        List<String> listaCompleta = new ArrayList<>();
        int count = 0;


        try {
            File myObj = new File("C:\\Users\\Utilizador\\IdeaProjects\\Novo1\\src\\moduloLaboratorio\\aula4" +
                    "\\exercicio1\\fiche.txt");
            Scanner myReader = new Scanner(myObj);
            myReader.useDelimiter(" ");
            while (myReader.hasNext()) {
                listaCompleta.add(myReader.next());
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        ExecutorService pool = Executors.newFixedThreadPool(6);

        for (int i = 0; i < listaCompleta.size(); i = i + 200) { //a lista tem 783 palavras, mas ainda faz as quatro revoluções antes de parar
            List<String> subLista;

            if (i + 200 < listaCompleta.size()) {
                subLista = listaCompleta.subList(i, i + 200);
            } else {
                subLista = listaCompleta.subList(i, listaCompleta.size());
            }

            AMinhaTarefa t1 = new AMinhaTarefa(subLista);
            pool.submit(t1);

            count++;
        }

        System.out.println(count);
    }
}
