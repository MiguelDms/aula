package modulo1.aula8.escritorio;

public abstract class Funcionario {

    private String nome;
    private String codigo;
    protected double base;

    public Funcionario(String nome, String codigo, double base) {
        this.base = base;
        this.codigo = codigo;
        this.nome = nome;

    }


    public abstract double calculaSalario();
}
