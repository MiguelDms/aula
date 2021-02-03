package modulo1.aula7.jogadores;

public class GuardaRedes extends Jogador {

    private int golosSofridos;

    public GuardaRedes(String nome, int numero) {
        super(nome, numero);
    }

    public void setGolosSofridos(int golos) {
        this.golosSofridos = this.golosSofridos + golos;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

}
