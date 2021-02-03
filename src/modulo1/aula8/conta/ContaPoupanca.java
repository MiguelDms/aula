package modulo1.aula8.conta;

public class ContaPoupanca extends ContaBancaria{

    private double taxa;

    public ContaPoupanca(String senha, int numero, double taxa) {
        super(senha, numero);
        this.taxa = taxa;
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

    }

    @Override
    public void tiraExtrato() {

    }
}
