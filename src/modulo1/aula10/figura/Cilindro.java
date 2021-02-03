package modulo1.aula10.figura;

public class Cilindro implements FiguraGeometricaTridimensional{

    private int altura;
    private Circulo base;

    public Cilindro(int altura, Circulo base) {
        this.altura = altura;
        this.base = base;
    }

    public Circulo getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }

    @Override
    public String getNomeFiguraTridimensional() {
        return null;
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public int getVolume() {
        return base.getArea() * altura;
    }
}
