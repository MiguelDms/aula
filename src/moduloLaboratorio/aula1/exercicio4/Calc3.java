package moduloLaboratorio.aula1.exercicio4;

public class Calc3 extends Thread{

    private String nome;
    private double tempo;

    public Calc3(String nome, double tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        System.out.println(nome + " started");
        try {
            sleep((long) tempo);
        } catch (InterruptedException e)  {
            e.printStackTrace();
        }

          System.out.println(nome + " ended");
    }
}
