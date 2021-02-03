package modulo1.aula10.trabalhoAutonomo.pessoaContacto;

public class Contacto implements Comparable<Contacto> {

    private String nome;
    private int telefone;

    public Contacto(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public int compareTo(Contacto o) {
        if (nome.equals(o.nome)) {
            if (telefone == o.telefone) {
                return 0;
            } else if(telefone > o.telefone) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return nome.compareTo(o.nome);
        }
    }
}
