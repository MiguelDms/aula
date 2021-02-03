package modulo1.aula11.trabalhoAutonomo.Carro;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Map<String, Carro> mapaCarros = new HashMap<String, Carro>();
        Carro carro = new Carro("xx-xx-xx", "Honda", "1990");
        Carro carro1 = new Carro("xx-x2-xx", "Renault", "1990");

        mapaCarros.put(carro.getMatricula(), carro);
        mapaCarros.put(carro1.getMatricula(), carro1);

        Carro c = mapaCarros.get("xx-xx-xx");
        System.out.println(mapaCarros);
        System.out.println(c);


    }
}
