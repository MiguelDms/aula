package moduloLaboratorio.aula3.exercicio2;
import java.util.ArrayList;
import java.util.List;

public class Mesa {

    List<Javali> javalist = new ArrayList<>();
    private final int capacidade = 10;

    public synchronized void put(Javali javali) {
        while (javalist.size() >= capacidade) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        javalist.add(javali);
        notifyAll();
    }

    public synchronized Javali get()  {

        while (javalist.size() == 1) {
            try {
                System.out.println("herer");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Javali j = javalist.remove(0);
        notifyAll();
        return j;
    }
}
