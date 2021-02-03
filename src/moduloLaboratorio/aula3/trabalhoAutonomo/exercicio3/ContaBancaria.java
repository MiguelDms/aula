package moduloLaboratorio.aula3.trabalhoAutonomo.exercicio3;

public class ContaBancaria {

    private int amount = 0;

    public synchronized void deposit(String nome, int amount) {
        this.amount = this.amount + amount;
        System.out.println("O cliente " + nome + " depositou " + amount + " de euros.");
    }

    public int getBalance() {
        return amount;
    }
}
