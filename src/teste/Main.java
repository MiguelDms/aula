package teste;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Estudante> listaEst = new ArrayList<>();



        NomeCompare nomeCompare = new NomeCompare();

        Estudante estudante1 = new Estudante(20, "Miguel");
        Estudante estudante2 = new Estudante(30, "Carla");
        Estudante estudante3 = new Estudante(25, "Olavo");

        listaEst.add(estudante1);
        listaEst.add(estudante2);
        listaEst.add(estudante3);

        if (!listaEst.isEmpty()) {
            System.out.println("Não vazia");
        }

        Collections.sort(listaEst);


        for (Estudante lista: listaEst) {
            System.out.println(lista.toString());
        }

        Collections.sort(listaEst, nomeCompare);

        Collections.shuffle(listaEst);

        for (Estudante lista: listaEst) {
            System.out.println(lista.toString());
        }
    }

}
