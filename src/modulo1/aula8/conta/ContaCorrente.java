package modulo1.aula8.conta;

public class ContaCorrente extends ContaBancaria {

    private int transacoes;

    public ContaCorrente(String senha, int numero) {
        super(senha, numero);
    }

    public void levanta(double valor) {
        if(getSaldo() - valor > 0) {
            setSaldo(getSaldo()-valor);
        } else {
            System.out.println("Não tens dinheiro");
        }

    }

    @Override
    public void deposita(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void tiraExtrato() {

    }
}
