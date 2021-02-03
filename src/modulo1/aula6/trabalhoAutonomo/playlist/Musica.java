package modulo1.aula6.trabalhoAutonomo.playlist;

public class Musica {
    private int duracao;
    private String titulo;

    public Musica(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getTitulo() {
        return titulo;
    }
}
