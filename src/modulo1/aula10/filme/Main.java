package modulo1.aula10.filme;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Filme[] f = new Filme[4];

        f[0] = new Filme(20, 2015, "Force");
        f[1] = new Filme(30, 1977, "Star");
        f[2] = new Filme(15, 1980, "Empire");
        f[3] = new Filme(10, 1983, "Return");

        Arrays.sort(f);

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i].getAno() + " " + f[i].getNome());
        }

    }
}
