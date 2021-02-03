package modulo1.aula25.strategy;

public class Passaro extends Animal{

    public Passaro() {
        super();
        setNome("pluto");
        tentaVoar();
        setVoar(new VoaSim());
    }
}
