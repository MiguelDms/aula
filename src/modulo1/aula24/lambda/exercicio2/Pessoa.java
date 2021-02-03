package modulo1.aula24.lambda.exercicio2;

public class Pessoa {

    private String name;
    private int idade;

    public Pessoa(String name, int idade) {
        this.idade = idade;
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}
