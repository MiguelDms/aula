package modulo1.aula24.serializaçao.exercicio1;

import java.io.Serializable;

public class User implements Serializable {

    private String nome;
    private String texto;
    private String titulo;

    public User(String nome, String texto, String titulo) {
        this.nome = nome;
        this.texto = texto;
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", texto='" + texto + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
