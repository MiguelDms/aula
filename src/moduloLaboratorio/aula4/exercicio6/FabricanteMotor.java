package moduloLaboratorio.aula4.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class FabricanteMotor extends Thread{

    private int id;
    private Fabrica f;
    List<Motor> listaMotores = new ArrayList<>();

    public FabricanteMotor(int id, Fabrica f) {
        this.id = id;
        this.f = f;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (listaMotores.size() > 0) {
                    f.insereMotor(listaMotores.get(0));
                    listaMotores.remove(0);
                }
                fabricarMotor();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fabricarMotor() throws InterruptedException {
        while (true) {
            sleep(4000);
            listaMotores.add(new Motor());
            if (listaMotores.size() >= 4) {
                break;
            }
        }
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fabrica getF() {
        return f;
    }

    public void setF(Fabrica f) {
        this.f = f;
    }
}
