package moduloLaboratorio.aula4.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AMinhaTarefa implements Runnable{

    @Override
    public void run() {
        readMy();
    }

    public void readMy() {

        List<String> listaPalavras = new ArrayList<>();

        try {
            File myObj = new File("C:\\Users\\Utilizador\\IdeaProjects\\Novo1\\src\\moduloLaboratorio\\aula4" +
                    "\\exercicio1\\fiche.txt");
            Scanner myReader = new Scanner(myObj);
            myReader.useDelimiter(" ");
            while (myReader.hasNext()) {
                String word = myReader.next();
                   String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
                   listaPalavras.add(cap);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
