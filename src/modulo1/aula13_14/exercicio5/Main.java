package modulo1.aula13_14.exercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try{
            Scanner fileScanner = new Scanner(new File("src/modulo1.aula13_14/exercicio5/Novo.txt"));
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String replaceString = line.replace("#", "W");
                String replaceString1 = replaceString.replace("C", " ");
                String replaceString2 = replaceString1.replace("X", " ");
                String replaceString3 = replaceString2.replace("X", " ");
                String replaceString4 = replaceString3.replace("b", " ");

                System.out.println(replaceString4);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }


    }

}
