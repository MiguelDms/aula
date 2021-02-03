package modulo1.aula10.figura;

public class Rectangulo implements FiguraGeometricaPlana {

    private int comprimento;
    private int largura;

    public Rectangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public String getNomeFiguraPlana() {
        return "Rectangulo";
    }

    @Override
    public int getArea() {
        return comprimento * largura;
    }

    @Override
    public int getPerimetro() {
        return (2 * comprimento) + (2 * largura);
    }
}
