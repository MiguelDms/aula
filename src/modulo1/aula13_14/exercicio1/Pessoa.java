package modulo1.aula13_14.exercicio1;

public class Pessoa {

    private String nome;
    private int idade;
    private String localidade;

    public Pessoa(String nome, int idade, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
