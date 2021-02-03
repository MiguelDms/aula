package moduloLaboratorio.aula3.exercicio2;

import java.util.Random;
import java.util.UUID;

public class Javali {

    private String raça;
    private int id;

    public Javali(String raça) {
        Random r = new Random();
        this.raça = raça;
        id = r.nextInt(100);
    }

        public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getId() {
        return id;
    }

}
