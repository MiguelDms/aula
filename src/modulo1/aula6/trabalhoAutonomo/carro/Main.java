package modulo1.aula6.trabalhoAutonomo.carro;

public class Main {

    public static void main(String[] args) {

        Car honda = new Car("Honda", "Accord", 5, "xx-55-xx", "14-02-1990", 7, 40);
        Person miguel = new Person("Miguel", "Pereira", 30, "Rua", "Portugues");

        honda.encheDeposito(21, 20);
        honda.run(20);
        honda.isLigado();
        honda.mudarEstado(true);
        honda.isLigado();

        miguel.comprarCarro(honda, "01-11-2020");

        System.out.println(honda.toString());

    }
}
