package moduloLaboratorio.aula4.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class FabricanteChassis extends Thread{

    private int id;
    private Fabrica f;
    List<Chassis> listaChassis = new ArrayList<>();

    public FabricanteChassis(int id, Fabrica f) {
        this.id = id;
        this.f = f;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (listaChassis.size() > 0) {
                    f.insereChassis(listaChassis.get(0));
                    listaChassis.remove(0);
                }
                fabricarChassis();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void fabricarChassis() throws InterruptedException {
        while (true) {
            sleep(4000);
            listaChassis.add(new Chassis());
            if (listaChassis.size() >= 4) {
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
