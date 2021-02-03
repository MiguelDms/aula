package modulo1.aula6;

public class Rectangulo {

    private int largura;
    private int comprimento;

    public Rectangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Rectangulo(int largura) {
        this.largura = largura;
        this.comprimento = largura;
    }

    public int getLargura(int largura) {
        return largura;
    }

    public int getComprimento(int comprimento) {
        return comprimento;
    }

    public int area() {
        return largura * comprimento;
    }

    public int perimetro() {
        return (largura + comprimento) * 2;
    }

    public boolean ifQuadrado() {
        if (largura == comprimento) {
            System.out.println("É um quadrado");
        }
        return true;
    }


}
