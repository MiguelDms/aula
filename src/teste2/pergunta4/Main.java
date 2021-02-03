/*package teste2.pergunta4;

public class Main {

    @override contapoupança extends contabancaria
    public double saldoEstimado() { //ContaPoupança
        //linked list tem metodos diferentes da arraylist
        double saldo = 0;
        if (getLinhasMovimentos().size >0) {
            return  getLinhasMovimentos().getLast().getSaldoContabilistico()/2;
        }
        return saldo;
    }

    override contaVip extends contabancaria

    public double saldoEstimado() {
        if (getLinhasMovimentos().size == 0) {
            return 0;
        }
        double saldo= 0;
        double nDias = 0;
        Data firstDate = getLinhasMovimentos().getFirst();
        for (Movimentos m : getLinhasMovimentos()) {
            int dias = Data.differençaEmDiasEntre(firstDate, m.getDataValor());
            saldo += m.getSaldoCorrente()+dias;
            nDias += dias;
            firstDate = m.getDataValor();
        }
    }
        return saldo/nDias;
}*/
