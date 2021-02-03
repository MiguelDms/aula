package modulo1.aula11.Listas;

public class Filme implements Comparable<Filme> {

    private int pontuacao;
    private String titulo;

    public Filme(int pontuacao, String titulo) {
        this.pontuacao = pontuacao;
        this.titulo = titulo;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "pontuacao=" + pontuacao +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Filme o) {
        if (pontuacao == o.getPontuacao()) {
            return 0;
        } else if (pontuacao > o.getPontuacao()) {
            return 1;
        } else {
            return -1;
        }
    }
}
