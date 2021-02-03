package moduloLaboratorio.aula2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        /*Thread thread1 = new Thread1(contador, "T1");
        Thread thread2 = new Thread1(contador, "T2");
        Thread thread3 = new Thread1(contador, "T3");
        Thread thread4 = new Thread1(contador, "T4");*/
        Thread1[] tarefas = new Thread1[1000];
        for (int i = 0; i < 1000; i++) {
            tarefas[i] = new Thread1(contador, "T" + i);
        }
        for (int i = 0; i < 1000; i++) {
            tarefas[i].start();
            tarefas[i].join();
        }


       /* thread1.start();
        System.out.println("ola");
        thread2.start();
        thread3.start();
        thread4.start();*/
    }
}
