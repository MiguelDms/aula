package modulo1.aula4;

public class Trabalho4 {

    public static void main(String[] args) {
        sum();
        System.out.println("__________________________");
        sum2();
        System.out.println("__________________________");
        divisor(200);
        System.out.println("__________________________");
        divisorSoma(10);
        System.out.println("__________________________");
        prime(11);
        System.out.println("__________________________");
        primoInter(6, 11);
    }

    public static void sum() {

        int i = 1;
        int soma = 0;

        while(i <= 100) {
            i++;
            soma = soma + i;
        }
        System.out.println(soma);
    }

    public static void sum2() {

        int i;
        int soma = 0;

        for (i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println(soma);
    }

    public static void divisor(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // apenas o i incrementa, portanto apenas o i poderá ser imprimido enquanto divisivel
                System.out.println(i);
            }
        }

    }

    public static void divisorSoma(int n) {

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // apenas o i incrementa, portanto apenas o i poderá ser imprimido enquanto divisivel
                System.out.println(i);
                soma = soma + i;
            }
        }
        System.out.println(soma);

    }

    public static void prime (int n) {

        boolean flag = false;
        for(int i = 2; i <= n/2; i++)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");

    }

    public static void primoInter(int min, int max) {

        boolean flag = false;

        for (int i = min; i <= max; i++) {
            for(int x = 2; x <= i/2; x++)
            {
                // condition for nonprime number
                if(i % x == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(i + " is a prime number.");
            else
                System.out.println(i + " is not a prime number.");

        }

    }
}
