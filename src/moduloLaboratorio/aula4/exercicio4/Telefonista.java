package moduloLaboratorio.aula4.exercicio4;

public class Telefonista extends Thread{

    private String nome;
    private Reservatorio r;

    public Telefonista(String nome, Reservatorio r) {
        this.nome = nome;
        this.r = r;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Tarefa t = new Tarefa("Tarefa" + i);
                r.insereTarefa(t);
                System.out.println(nome + " inseriu a tarefa " + t.getNome());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
