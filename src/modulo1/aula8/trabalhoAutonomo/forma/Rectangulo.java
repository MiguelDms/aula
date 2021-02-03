package modulo1.aula8.trabalhoAutonomo.forma;

public class Rectangulo extends Forma {

    private float lado;
    private float altura;

    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return altura * lado;
    }

    @Override
    public float calcularPerimetro() {
        return (altura + lado) * 2;
    }
}
