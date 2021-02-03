package modulo1.aula24.trabalhoAutonomo.lambda;



public class Chao implements Common {

    private Position position;
    private boolean walk;

    public Chao(Position position, boolean walk) {
        this.position = position;
        this.walk = walk;


    }


    public String getName() {
        return "Chao";
    }


    public Position getPosition() {
        return position;
    }


    public boolean getWalk() {
        return walk;
    }

    @Override
    public String toString() {
        return "Chao{" +
                "position=" + position +
                ", walk=" + walk +
                '}';
    }
}
