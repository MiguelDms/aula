package modulo1.aula25.factory;

public abstract class Inimigo {

   public String nome;
   public int position;

    public void mostrarInimigo() {
        System.out.println(nome + " está no ecra");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
