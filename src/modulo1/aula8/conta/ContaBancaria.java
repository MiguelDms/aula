package modulo1.aula8.conta;

import java.util.Scanner;

public abstract class ContaBancaria {

    private String senha;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String senha, int numeroConta) {
        this.senha = senha;
        this.numeroConta = numeroConta;
    }


    public abstract void deposita(double valor);
    public abstract void tiraExtrato();
    public abstract void levanta(double valor);


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void alteraSenha(String novaS) {
        Scanner s = new Scanner((System.in));
        System.out.println("Por favor digite a sua senha");
        String senhaAnterior = s.nextLine();

        if (senha.equals(senhaAnterior)) { //se for a colocar == ele ve apenas o tipo e nao o interior
            setSenha(novaS);
            System.out.println("A senha foi alterado com sucesso");
        } else {
            System.out.println("Tem as senhas erradas");
        }
    }
}
