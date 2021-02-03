package modulo1.aula11.trabalhoAutonomo.Time;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> lista2 = new LinkedList<Integer>();

        System.out.println("Time test: ArrayList " + testTime(lista) + ", LinkedList " + testTime(lista2));


        }

    public static long testTime(List<Integer> lista) {
        long startTime = System.currentTimeMillis();

        lista.add(0);
        for (int i = 0; i != 100000; i++) {
            lista.add(0, i);

        }
        lista.remove(0);

        return System.currentTimeMillis() - startTime;
    }


}
