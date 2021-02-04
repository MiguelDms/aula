package moduloLaboratorio.aula4.exercicio5;

public class Barbeiro extends Thread{

    private String nome;
    private Barbearia b;

    public Barbeiro(String nome, Barbearia b) {
        this.nome = nome;
        this.b = b;
    }

    @Override
    public void run() {
       while (true) {
           try {
               b.cortaCabelo();
               sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
