package modulo1.aula24.trabalhoAutonomo.lambda;


public class Esqueleto extends Personagens {

    private Position position;
    private boolean walk;

    public Esqueleto(Position position, boolean walk, int vida, int força) {
        super(vida, força);
        this.position = position;
        this.walk = walk;
    }


    public String getName() {
        return "Esqueleto";
    }


    public Position getPosition() {
        return position;
    }


    public boolean getWalk() {
        return walk;
    }

    @Override
    public String toString() {
        return getName() + " (" + position.getX() + ", " + position.getY() + ")" + getWalk();
    }
}
