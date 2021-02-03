package modulo1.aula8.trabalhoAutonomo.forma;

public class Circulo extends Forma {

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (Math.PI * raio * 2);
    }
}
