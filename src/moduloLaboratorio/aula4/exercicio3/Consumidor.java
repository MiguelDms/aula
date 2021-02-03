package moduloLaboratorio.aula4.exercicio3;

public class Consumidor extends Thread{

    private String nome;
    private RecursoPartilhado r;

    public Consumidor(String nome, RecursoPartilhado r) {
        this.nome = nome;
        this.r = r;
    }

    @Override
    public void run() {
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            try {
              int resultado = r.getNumero();
                System.out.println("Consumidor " + nome + " obteve a soma " + resultado);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
