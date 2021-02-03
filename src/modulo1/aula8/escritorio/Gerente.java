package modulo1.aula8.escritorio;

public class Gerente extends Funcionario{

    public Gerente(String nome, String codigo, double base) {
        super(nome, codigo, base);
    }

    public double calculaSalario() {
        return base * 2;
    }
}
