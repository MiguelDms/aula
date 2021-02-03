package moduloLaboratorio.aula1.exercicio4;

public class Impar extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 150; i++) {
            if (!(i%2==0)) {
                System.out.println(i);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
