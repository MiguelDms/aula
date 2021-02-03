package moduloLaboratorio.aula4.exercicio4;

public class Funcionario extends Thread{

    private String nome;
    private Reservatorio r;

    public Funcionario(String nome, Reservatorio r) {
        this.nome = nome;
        this.r = r;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Tarefa t = r.getTarefa();
                System.out.println("O electricista " + nome + " removeu a tarefa " + t.getNome());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
