package modulo1.aula24.trabalhoAutonomo.serializaçao;

import java.io.Serializable;

public class Hero implements Serializable, ImageTile {

    private Position position;

    public Hero(Position position) {
        this.position = position;
    }


    @Override
    public String getName() {
        return "Hero";
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return getName() + " (" + position.getX() + ", " + position.getY() + ")";
    }
}
