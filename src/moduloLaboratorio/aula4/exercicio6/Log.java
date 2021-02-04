package moduloLaboratorio.aula4.exercicio6;

public class Log extends Thread{

    @Override
    public void run() {
        System.out.println("A fábrica está a iniciar...");
        try {
            sleep(8000);
            System.out.println("Está quase...");
            sleep(3000);
            System.out.println("Mesmo quase...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
