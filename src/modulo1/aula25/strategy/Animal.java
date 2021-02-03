package modulo1.aula25.strategy;

public class Animal {

    private String nome;
    private String som;
    private Voa voar;


    public boolean tentaVoar() {
        return voar.animalVoa();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void setVoar(Voa voar) {
        this.voar = voar;
    }
}
