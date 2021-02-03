package modulo1.aula13_14.exercicio4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Lampada {

    private int potencia;
    private int numero;
    private List<Lampada> lista = new ArrayList<Lampada>();

    public Lampada(int potencia, int numero) {
        this.numero = numero;
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void guardarLampadas(Lampada lampada) throws IOException {

        if (lista.isEmpty()) {
            System.out.println("ola");
            lista.add(lampada);
            System.out.println(lista);
        }

        try {
            FileWriter fileWriter = new FileWriter("src/modulo1.aula13_14/exercicio4/Novo.txt", true); //Set true for append mode
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

    @Override
    public String toString() {
        return "Lampada{" +
                "potencia='" + potencia + '\'' + "numero='" + numero + '\'' +
                '}';
    }
}
