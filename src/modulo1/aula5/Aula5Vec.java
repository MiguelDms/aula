package modulo1.aula5;

import java.util.Arrays;

public class Aula5Vec {

    // EX 1

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int[] vector = new int[3];
        vector[0] = 3;
        vector[1] = 3;
        vector[2] = 5;

        System.out.println(Arrays.toString(randomDigits(a)));
        System.out.println(Arrays.toString(armazena()));
        System.out.println(Arrays.toString(replica(a, vector)));
        System.out.println(exists(a, vector));
        System.out.println(caractere(vector, a));
        System.out.println(Arrays.toString(subarray(vector, a, b)));
    }

    // EX2

    public static int[] randomDigits(int a) {
        int[] v = new int[a];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10);
        }

        return v;
    }

    //EX3

    public static int[] armazena() {
        int[] v = new int[50];

        for (int i = 0; i < v.length; i++) {
            v[i] = 101 + i;
        }
        return v;
    }

    //EX4

    public static int[] replica(int a, int[] vector) {
        int[] novo = new int[a];

        for (int i = 0; i < novo.length; i++) {


            if (i < vector.length) {
                novo[i] = vector[i];
            } else {
                novo[i] = 0;
            }
        }

        return novo;
    }

    // EX5

    public static boolean exists(int a, int[] vector) {

        for (int i = 0; i < vector.length; i++) {

            if(a == vector[i]) {
                return true;
            }
        }

        return false;
    }

    //EX6

    public static int caractere(int[] vector, int a) {
        int count = 0;

        for (int i = 0; i < vector.length; i++) {
            if (a == vector[i]) {
                count = count + 1;
            }
        }

        return count;
    }

    //EX7

    public static int[] subarray(int[] vector, int a, int b ) {
        int length = (a - b) + 1;
        int[] newe = new int[length];
        int vect = 0;

        for (int i = b; i <= a; i++) {
            newe[vect] = vector[i];
            vect++;
        }

        return newe;
    }


}
