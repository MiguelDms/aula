package moduloLaboratorio.aula1;

public class Main {

    public static void main(String[] args) {
        Runnable calc2 = new Calc2();
        Thread t = new Thread(calc2);
        Thread calc = new Calc();
        t.start();
        calc.start();


    }
}
