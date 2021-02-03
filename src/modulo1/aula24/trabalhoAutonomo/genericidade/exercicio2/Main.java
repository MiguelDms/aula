package modulo1.aula24.trabalhoAutonomo.genericidade.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(13);
        lista.add(13);
        lista.add(2);
        lista.add(4);
        lista.add(6);

        for (Integer listas : lista) {
            System.out.println("Aqui " + listas);
        }

        lista = removerDuplicados(lista);

        for (Integer listas : lista) {
            System.out.println("Acola " + listas);
        }
    }

    public static List<Integer> removerDuplicados(List<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {

            for (int x = i + 1; x < lista.size(); x++) {
                if (lista.get(i).equals(lista.get(x))) {
                    lista.remove(i);
                }
            }
        }

        return lista;
    }
}
