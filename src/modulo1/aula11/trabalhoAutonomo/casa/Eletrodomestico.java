package modulo1.aula11.trabalhoAutonomo.casa;

public class Eletrodomestico {

    private String tipo;
    private int potencia;
    private String marca;

    public Eletrodomestico(String tipo, int potencia, String marca) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                ", marca='" + marca + '\'' +
                '}';
    }
}
