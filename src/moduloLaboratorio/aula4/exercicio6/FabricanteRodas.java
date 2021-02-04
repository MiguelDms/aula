package moduloLaboratorio.aula4.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class FabricanteRodas extends Thread{

    private int id;
    private Fabrica f;
    List<Roda> listaRodas = new ArrayList<>();

    public FabricanteRodas(int id, Fabrica f) {
        this.id = id;
        this.f = f;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (listaRodas.size() > 0) {
                    f.insereRoda(listaRodas.get(0));
                    listaRodas.remove(0);
                }
                fabricarRodas();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fabricarRodas() throws InterruptedException {
        while (true) {
            sleep(1000);
            listaRodas.add(new Roda());
            if (listaRodas.size() >= 12) {
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
