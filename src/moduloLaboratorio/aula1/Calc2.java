package moduloLaboratorio.aula1;

import java.util.Scanner;

public class Calc2 implements Runnable {

    public void run() {
        int intConsola;
        String verificação = "runnable";

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("digite um outro numero");
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
