package modulo1.aula8.escritorio;

public class Assistente extends Funcionario {

    public Assistente(String nome, String codigo, double base) {
        super(nome, codigo, base);
    }

    public double calculaSalario() {
        return base;
    }
}
