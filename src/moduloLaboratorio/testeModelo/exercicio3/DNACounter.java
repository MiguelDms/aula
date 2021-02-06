package moduloLaboratorio.testeModelo.exercicio3;

import java.util.concurrent.Semaphore;

public class DNACounter extends Thread{

    private String data;
    private Semaphore semaphore;
    private int countA = 0;
    private int countT = 0;
    private int countC = 0;
    private int countG = 0;

    public DNACounter(Semaphore semaphore, String data) {
        this.data = data;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Vou contar a sequencia "+ data);
        try {
            semaphore.acquire();
            for (int i = 0; i < data.length(); i++) {
                switch (data.charAt(i)) {
                    case 'A':
                        countA++;
                        break;
                    case 'G':
                        countG++;
                        break;
                    case 'C':
                        countC++;
                        break;
                    case 'T':
                        countT++;
                        break;
                }
            }

            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCountA() {
        return countA;
    }

    public int getCountT() {
        return countT;
    }

    public int getCountC() {
        return countC;
    }

    public int getCountG() {
        return countG;
    }


}
