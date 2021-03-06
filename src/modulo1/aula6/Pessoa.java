package modulo1.aula6;

public class Pessoa {

    private String firstName;
    private String lastName;
    public int idade;
    private String morada;
    private String nacionalidade;

    public Pessoa(String firstName, String lastName, int idade, String morada, String nacionalidade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idade = idade;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return firstName + " " + lastName;
    }



}

