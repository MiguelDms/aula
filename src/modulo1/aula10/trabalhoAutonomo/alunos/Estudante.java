package modulo1.aula10.trabalhoAutonomo.alunos;

public class Estudante implements Comparable<Estudante> {

    private  int idade;
    private String nome;
    private int numero;

    public Estudante(int idade, String nome, int numero) {
        this.idade = idade;
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Estudante estudante) {
        if (idade == estudante.idade) {
            return 0;
        } else if (idade > estudante.idade) {
            return 1;
        } else {
            return -1;
        }
    }
}
