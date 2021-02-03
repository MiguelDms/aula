package moduloLaboratorio.aula2.exercicio2;

public class Empregado extends Thread{

    private String nome;
    private Balcao balcao;

    public Empregado(String nome, Balcao b) {
        this.nome = nome;
        this.balcao = b;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            Refeicao r = balcao.get();
            System.out.println(r.getPrato());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Balcao getBalcao() {
        return balcao;
    }

    public void setBalcao(Balcao balcao) {
        this.balcao = balcao;
    }
}
