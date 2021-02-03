package modulo1.aula6;

public class Estudante {

    private String nomeAluno;
    private int numeroAluno;
    private String curso;

    public Estudante(String nomeAluno, int numeroAluno, String curso) {
        this.nomeAluno = nomeAluno;
        this.numeroAluno = numeroAluno;
        this.curso = curso;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

}
