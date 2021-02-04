package moduloLaboratorio.aula4.exercicio4;

import java.util.LinkedList;

public class Reservatorio {

    private static final int MAX_TAREFAS = 5;
    private LinkedList<Tarefa> listaTarefas = new LinkedList();

    public synchronized void insereTarefa(Tarefa t) throws InterruptedException {
        while (listaTarefas.size() >= MAX_TAREFAS) {
            System.out.println("herer");
            wait();
        }

        listaTarefas.add(t);
        notifyAll();
    }

    public synchronized Tarefa getTarefa() throws InterruptedException {
        while (listaTarefas.size() == 0) {
            wait();
        }

        Tarefa tarefa = listaTarefas.remove(0);
        notifyAll();
        return tarefa;
    }
}
