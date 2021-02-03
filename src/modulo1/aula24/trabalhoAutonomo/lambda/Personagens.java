package modulo1.aula24.trabalhoAutonomo.lambda;

public class Personagens implements Common {

    private int vida;
    private int força;

    public Personagens(int vida, int força) {
        this.força = força;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public int getForça() {
        return força;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public boolean getWalk() {
        return false;
    }
}
