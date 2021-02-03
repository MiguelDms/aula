package modulo1.aula24.trabalhoAutonomo.serializaçao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ImageTile> lista = new ArrayList<ImageTile>();
        Hero hero = new Hero(new Position(1, 9));
        Esqueleto esqueleto = new Esqueleto(new Position(4, 9));

        lista.add(hero);
        lista.add(esqueleto);

        listarObj(lista);
        guardar(lista);
        carregar();
    }

    public static void listarObj(List<ImageTile> lista) {
        for (ImageTile listas : lista) {
            System.out.println(listas);
        }
    }

    public static void guardar(List<ImageTile> lista) {
        try{
            FileOutputStream fileOut = new FileOutputStream("src/modulo1.aula24/trabalhoAutonomo/serializaçao/lista.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro a salvar o ficheiro");
        }
    }

    public static void carregar() {
        try{
            FileInputStream fileIn = new FileInputStream("src/modulo1.aula24/trabalhoAutonomo/serializaçao/lista.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<ImageTile> lista = (ArrayList<ImageTile>) in.readObject();
            in.close();
            fileIn.close();

            for (ImageTile listas: lista) {
                System.out.println(listas.getName() + listas.getPosition());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro a carregar o ficheiro");
        }
    }


}
