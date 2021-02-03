package modulo1.aula8.trabalhoAutonomo.calculadora;

public class CalcCientifica extends Calculadora {

    public int quadrada(int valor1) {
        return valor1 * valor1;
    }

    public double potencia(int valor1, int potencia) {
       return Math.pow(valor1, potencia);
    }
}
