package modulo1.aula25.strategy;

public class Cao extends Animal{

    public Cao() {
        super();
        setNome("pluto");
        tentaVoar();
        setVoar(new NaoVoa());
    }
}
