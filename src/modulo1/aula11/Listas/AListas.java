package modulo1.aula11.Listas;

import java.util.*;

public class AListas {

    public static void main(String[] args) {

        // ****ARRAYLISTS++++++

        List<String> lista = new ArrayList<String>();

        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");
        lista.add("Nome5");
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        if (lista.contains("Nome3")) {
            System.out.println("Tenho elemento");
        }

        lista.remove("Nome2"); //convem fazer o remove ou fora do for ou dentro de ifs, porque isto renomeia a posição de todos os elementos
        System.out.println(lista);

        // ****LINKEDLISTS++++++

        System.out.println("________________________________");

        List<String> linked = new LinkedList<String>();
        linked.add("Nome1");
        linked.add("Nome2");
        linked.add("Nome3");
        linked.add("Nome4");
        linked.add("Nome5");

        System.out.println(linked);

        // ****Queue++++++

        Queue<Filme> qu = new PriorityQueue<Filme>();
        Filme memento = new Filme(9, "Memento");
        Filme pi = new Filme(19, "Pi");
        Filme nelson = new Filme(10, "Half Nelson");
        Filme elson = new Filme(8, "Half Nelson");


        qu.add(memento);
        qu.add(pi);
        qu.add(nelson);
        qu.add(elson);


        System.out.println(qu.peek());
        System.out.println(qu); // Tem DE SE FAZER ISTO COM O COMPARATOR, PASSANDO O PARA DENTRO DA QUEUE



    }

}
