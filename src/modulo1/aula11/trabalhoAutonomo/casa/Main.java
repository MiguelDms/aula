package modulo1.aula11.trabalhoAutonomo.casa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Eletrodomestico> listaCozinha = new ArrayList<Eletrodomestico>();
        List<Eletrodomestico> listaSala = new ArrayList<Eletrodomestico>();
        List<Eletrodomestico> listaQuarto = new ArrayList<Eletrodomestico>();


        Eletrodomestico frigorifico = new Eletrodomestico("frigorifico", 30, "Samsung");
        Eletrodomestico lavar = new Eletrodomestico("Maquina de lavar", 30, "Bong");
        Eletrodomestico arca = new Eletrodomestico("Arca", 30, "Samon");
        Eletrodomestico cama = new Eletrodomestico("Cama", 30, "Samon");
        Eletrodomestico televisao = new Eletrodomestico("televisao", 30, "Samon");

        listaCozinha.add(frigorifico);
        listaCozinha.add(lavar);
        listaCozinha.add(arca);

        listaSala.add(cama);
        listaSala.add(televisao);


        Casa cozinha = new Casa("cozinha");
        Casa quarto = new Casa("quarto");
        Casa sala = new Casa("sala");



        cozinha.inserirElectro(listaCozinha);
        quarto.inserirElectro(listaQuarto);
        sala.inserirElectro(listaSala);



        cozinha.removerElectro("Samsung");





    }
}
