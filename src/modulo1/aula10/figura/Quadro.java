package modulo1.aula10.figura;

public class Quadro implements FiguraGeometricaPlana, FiguraGeometricaTridimensional {

    private int lado;

    public Quadro(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public int getPerimetro() {
        int perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFiguraTridimensional() {
        return null;
    }

    @Override
    public int getAltura() {
        return 0;
    }

    @Override
    public int getVolume() {
        return 0;
    }
}
