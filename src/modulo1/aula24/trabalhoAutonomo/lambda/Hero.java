package modulo1.aula24.trabalhoAutonomo.lambda;

public class Hero extends Personagens {

    private Position position;

    private boolean walk;

    public Hero(Position position, boolean walk, int vida, int força) {
        super(vida, força);
        this.position = position;
        this.walk = walk;
    }



    public String getName() {
        return "Hero";
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
