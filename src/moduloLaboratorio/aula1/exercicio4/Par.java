package moduloLaboratorio.aula1.exercicio4;

public class Par extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
