package modulo1.aula6.trabalhoAutonomo.carro;

public class Car {

    private final String marca;
    private final String modelo;
    private int lugares;
    private String matricula;
    private String registo;
    private int consumo;
    private final int capacidade;
    private String proprietario;
    private boolean estado = false;

    public Car(String marca, String modelo, int lugares, String matricula, String registo, int consumo, int capacidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.lugares = lugares;
        this.matricula = matricula;
        this.registo = registo;
        this.consumo = consumo;
        this.capacidade = capacidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getLugares() {
        return lugares;
    }

    public int getConsumo() {
        return consumo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getRegisto() {
        return registo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setRegisto(String registo) {
        this.registo = registo;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // ------------------------------

    public void encheDeposito(int combustivel, int actual) {
        int resultado;

        if (combustivel + actual <= capacidade) {
            resultado = combustivel + actual;
            System.out.println("O seu carro tem " + resultado + " litros no depósito dos " + capacidade + " possiveis.");
        } else {
            System.out.println("O seu carro ficou atestado.");
        }
    }

    public void run(int actual) {
        int distancia = 1;
        double gasto = 0.01 * consumo;
        double balanco = actual - gasto;
        System.out.println("O seu carro ficou com " + balanco + " litros no deposito.");
    }

    public void mudarEstado(boolean estado) {
        if (estado == this.estado && !estado) {
            System.out.println("O seu carro já se encontra desligado");
        } else if(estado == this.estado && estado) {
            System.out.println("O seu carro já se encontra ligado");
        } else {
            setEstado(estado);
        }
    }

    public void isLigado() {
        if (!estado) {
            System.out.println("O seu carro está desligado.");
        } else {
            System.out.println("O seu carro encontra-se a trabalhar!");
        }
    }

    public String toString() {
        return proprietario + ", " + marca + ", " + modelo + ", ano de registo: " + registo + ", matricula: " + matricula;
    }

}
