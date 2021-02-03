package modulo1.aula10.filme;

public class Filme implements Comparable<Filme>{

    private int pontuacao;
    private int ano;
    private String nome;

    public Filme(int pontuacao, int ano, String nome) {
        this.ano = ano;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "pontuacao=" + pontuacao +
                ", ano=" + ano +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Filme o) {
        if (pontuacao == o.pontuacao) {
            return 0;
        } else if (pontuacao < o.pontuacao) {
            return 1;
        } else {
            return -1;
        }
    }
}
