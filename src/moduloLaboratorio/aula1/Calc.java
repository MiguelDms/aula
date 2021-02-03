package moduloLaboratorio.aula1;

import java.util.Scanner;

public class Calc extends Thread {

    @Override
    public void run() {
       parOuImpar();
    }

    public void parOuImpar() {
        int intConsola;
        String verificação = "thread";
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("digite um numero");
            intConsola = s.nextInt();
            if (intConsola%2==0) {
                System.out.println("é par " + verificação);
            } else {
                System.out.println("é impar " + verificação);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
