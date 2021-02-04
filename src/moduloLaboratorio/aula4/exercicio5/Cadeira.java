package moduloLaboratorio.aula4.exercicio5;

public class Cadeira {

    private int numeroCadeira;
    private String tipo;
    private boolean ocupada = false;

    public Cadeira(int numeroCadeira, String tipo) {
        this.numeroCadeira = numeroCadeira;
        this.tipo = tipo;
    }

    public int getNumeroCadeira() {
        return numeroCadeira;
    }

    public void setNumeroCadeira(int numeroCadeira) {
        this.numeroCadeira = numeroCadeira;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return ocupada;
    }

    public void setEstado(boolean estado) {
        this.ocupada = estado;
    }

}
