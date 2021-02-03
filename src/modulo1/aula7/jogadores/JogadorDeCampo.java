package modulo1.aula7.jogadores;

public class JogadorDeCampo extends Jogador {

    private int passes;

    public JogadorDeCampo(String nome, int numero) {
        super(nome, numero);
    }

    public void setPasses(int passes) {
        this.passes = this.passes + passes;
    }

    public int getPasses() {
        return passes;
    }

}
