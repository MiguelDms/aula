package moduloLaboratorio.testeModelo.exercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int countA = 0;
        int countT = 0;
        int countC = 0;
        int countG = 0;

        Semaphore semaphore = new Semaphore(10);
        List<DNACounter> dnaCounters = new LinkedList<>();

        while (true) {
            String data = getSequencedData();
            if (data != null) {
                DNACounter task = new DNACounter(semaphore, data);
                dnaCounters.add(task);
            } else {
                break;
            }
        }

        for (DNACounter task : dnaCounters) {
            task.start();
        }

        for (DNACounter task : dnaCounters) {
            task.join();
        }

        for (DNACounter task : dnaCounters) {
            countA += task.getCountA();
            countT += task.getCountT();
            countC += task.getCountC();
            countG += task.getCountG();
        }
    }

    private static String getSequencedData() {
        return "";
    }


}
