package modulo1.aula13_14.exercicio6;

import java.io.*;
import java.util.Scanner;

public class Reparaçao {

    private String carro;
    private String cliente;
    private String reparacao;
    private int valor;


    public Reparaçao(String carro, String cliente, String reparacao, int valor) {
        this.carro = carro;
        this.cliente = cliente;
        this.reparacao = reparacao;
        this.valor = valor;
    }

    public void ler(){
        try{
            Scanner fileScanner = new Scanner(new File("src/modulo1.aula13_14/exercicio6/Novo.txt"));
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
            e.printStackTrace();
        }
    }

    public void escrever(Reparaçao carro) throws IOException {

            FileWriter fileWriter = new FileWriter("src/modulo1.aula13_14/exercicio6/Novo.txt", true); //Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Scanner fileScanner = new Scanner(new File("src/modulo1.aula13_14/exercicio6/Novo.txt"));

            if(!fileScanner.hasNextLine()) {
                System.out.println("Não ha linhas");
                printWriter.println("Carro;Cliente;Reparação;Valor");
                printWriter.println();
            }

            printWriter.println(carro.toString());
            printWriter.close();

    }

    @Override
    public String toString() {
        return carro + ';' + cliente + ';' + reparacao + ';' + valor;
    }
}
