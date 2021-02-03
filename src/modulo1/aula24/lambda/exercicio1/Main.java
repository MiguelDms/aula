package modulo1.aula24.lambda.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> listaInt = new ArrayList<Integer>();

        listaInt.add(1);
        listaInt.add(2);
        listaInt.add(3);

       duplicar(listaInt);
    }

    public static void duplicar(List<Integer> lista) {
        lista.forEach((n) -> System.out.println(n * 2));
    }


}
