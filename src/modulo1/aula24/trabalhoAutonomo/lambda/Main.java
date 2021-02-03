package modulo1.aula24.trabalhoAutonomo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Personagens> lista = new ArrayList<>();

        Hero hero = new Hero(new modulo1.aula24.trabalhoAutonomo.lambda.Position(3, 2), true, 19, 20);
        Esqueleto esqueleto = new Esqueleto(new modulo1.aula24.trabalhoAutonomo.lambda.Position(1, 2), true, 40, 10);
        Chao chao = new Chao(new modulo1.aula24.trabalhoAutonomo.lambda.Position(4, 2), false);

        lista.add(hero);
        lista.add(esqueleto);
        //lista.add(chao);

        quemAnda(lista);
    }
    
    public static void quemAnda(List<Personagens> lista) {
        lista.forEach((n) -> {
            if (n.getWalk()) {
                System.out.println((n).getPosition());
            }
        });
    }


}
