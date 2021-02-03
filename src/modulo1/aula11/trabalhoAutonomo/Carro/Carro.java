package modulo1.aula11.trabalhoAutonomo.Carro;

public class Carro {

    private String matricula;
    private String marca;
    private String ano;

    public Carro(String matricula, String marca, String ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
