package modulo1.aula8.trabalhoAutonomo.forma;

public class Quadrado extends Forma {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return lado * 4;
    }
}
