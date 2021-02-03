package modulo1.aula10.trabalhoAutonomo.alunos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Estudante[] st = new Estudante[3];

        st[0] = new Estudante(20, "Miguel", 123);
        st[1] = new Estudante(30, "Rui", 12344);
        st[2] = new Estudante(15, "Ruie", 12333344);

        Arrays.sort(st);

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].getIdade() + " " + st[i].getNome());
        }


        // --------------------------------------------

        NomeCompare nomeCompare = new NomeCompare();

        Arrays.sort(st, nomeCompare);

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].getNome());
        }

        NumeroCompare numeroCompare = new NumeroCompare();

        Arrays.sort(st, numeroCompare);

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].getNumero());
        }


    }
}
