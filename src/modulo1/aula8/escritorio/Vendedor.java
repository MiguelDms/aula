package modulo1.aula8.escritorio;

public class Vendedor extends  Funcionario {

    private int comissao;

    public Vendedor(String nome, String codigo, double base, int comissao) {
        super(nome, codigo, base);

        this.comissao = comissao;
    }

    public double calculaSalario() {
        return base + comissao;
    }
}
