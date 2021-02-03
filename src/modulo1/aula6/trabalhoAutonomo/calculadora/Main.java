package modulo1.aula6.trabalhoAutonomo.calculadora;

public class Main {

    public static void main(String[] args) {


        Calculadora calc = new Calculadora();

        System.out.println(calc.potencia(2, 6));
        System.out.println(calc.soma(2, 6));
        System.out.println(calc.div(10, 6));
        System.out.println("-------------------");
        System.out.println(calc.modulus(16, 6));
        calc.obter();
        calc.obterU(2);
    }
}
