package modulo1.aula10.trabalhoAutonomo.racional;

public class Rational implements Comparable<Rational> {

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                "/ denominator=" + denominator +
                '}';
    }

    @Override
    public int compareTo(Rational outro) {
        return 0;
    }
}
