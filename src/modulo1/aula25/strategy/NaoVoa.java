package modulo1.aula25.strategy;

public class NaoVoa implements Voa{

    private boolean voa;

    @Override
    public boolean animalVoa() {
        return false;
    }
}
