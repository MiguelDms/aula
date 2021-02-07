package moduloLaboratorio.aula4.trabalhoAutonomo;

import java.util.ArrayList;
import java.util.List;

public class MesaDeShakespear {

    private List<String> listaDeStrings = new ArrayList<>();
    private int MAX_TOTAL_STRINGS = 3;

    public synchronized void colocarPalavras(String s) throws InterruptedException {
        while (listaDeStrings.size() >= MAX_TOTAL_STRINGS) {
            wait();
        }

        listaDeStrings.add(s);
        notifyAll();
    }

    public synchronized String levantarPalavras() {
        while (listaDeStrings.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String s = listaDeStrings.remove(0);
        notifyAll();
        return s;
     }
}
