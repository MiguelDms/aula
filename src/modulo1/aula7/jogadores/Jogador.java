package modulo1.aula7.jogadores;

public class Jogador {

    protected final String nome;
    protected int numero;
    private int golos;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(String nome) {
        this.numero = numero;
    }

    public void setGolosMarcados(int golos) {
        this.golos = this.golos + golos;
    }

    public int getGolosMarcados() {
        return golos;
    }

}
