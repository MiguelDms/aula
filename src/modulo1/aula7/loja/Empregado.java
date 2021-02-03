package modulo1.aula7.loja;

public class Empregado extends Empregados {

    private final String nome;
    private int salario = 800;


    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

}
