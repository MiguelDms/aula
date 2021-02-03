package teste2.pergunta1;

import teste2.pergunta2.Car;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
       Car c = new Car("02-03-XT", 2007);

        /*HashMap<String, Car> mapa;
        mapa = new HashMap<String, Car>();

        mapa.put(c.getLicensePlate(), c);

        mapa.get("02-03-XT");*/

        //rever linked lists, collections (conjuntos), mapas

        HashMap<String, Car> mapa = new HashMap<String, Car>();
        mapa.put("02-03-XT", c);
        c = mapa.get("02-03-XT");

        LinkedList<Car> listaC = new LinkedList<>();

    }



}
