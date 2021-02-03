package modulo1.aula10.figura;

public class Circulo implements FiguraGeometricaPlana {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Circulo";
    }

    @Override
    public int getArea() {
        return (int) Math.PI * raio * raio;
    }

    @Override
    public int getPerimetro() {
        return (int) Math.PI * raio * 2;
    }
}
