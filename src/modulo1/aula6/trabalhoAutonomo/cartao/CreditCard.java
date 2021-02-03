package modulo1.aula6.trabalhoAutonomo.cartao;

public class CreditCard {

    private String titular;
    private final int numero;
    private final String validade;
    private int divida;
    private int limite;
    private int maximo;
    private int saldo;
    private String[] despesas;

    public CreditCard(String titular, int numero, String validade, int maximo, int limite) {
        this.titular = titular;
        this.maximo = maximo;
        this.numero = numero;
        this.validade = validade;
        this.limite = limite;
        despesas = new String[100];
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getMaximo() {
        return maximo;
    }

    public String getValidade() {
        return validade;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getDivida() {
        return divida;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int saldo() {
        return limite - divida;
    }

    public void pagarCredito(int pag) {
        if (pag > divida) {
            int positivo = pag - divida;
            int negativo = pag - positivo;
            saldo = saldo + positivo;
            divida = divida - negativo;
        } else {
            divida = divida - pag;
        }
    }

    public void gastar(int quantia, String descricao) {
        if (quantia > maximo) {
            System.out.println("Levantamento excede o valor máximo premitido");
        } else {
            if (quantia > saldo) {
                int positivo = quantia - saldo;
                int negativo = quantia - positivo;
                divida = divida + positivo;
                saldo = saldo - negativo;
            } else {
                saldo = saldo - quantia;
            }

            String movimento = quantia + " - " + descricao;

            for (int i = 0; i < despesas.length; i++) {
                if (despesas[i] == null) {
                    despesas[i] = movimento;
                    break;
                }
            }
        }
    }

    public String obterTalao() {
        String despesa = null;
        
        for (int i = despesas.length - 1; i > 0; i--) {
            if (despesas[i] != null) {
                despesa = despesas[i];
            }
        }
        
        return despesa;
    }

    public String getMovimentos() {
        String completo = "";

        for (int i = 0; i < despesas.length; i++) {
            if (despesas[i] != null) {
                completo += despesas[i] + ", ";
            }
        }

        return completo;
    }

}
