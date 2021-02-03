package teste;

public class Estudante implements Comparable<Estudante>{

    private int idade;
    private String nome;

    public Estudante(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Estudante o) {
       /* if (idade > o.idade) {
            return 1;
        } else if(idade < o.idade) {
            return -1;
        } else {
            return 0;
        }*/

        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
