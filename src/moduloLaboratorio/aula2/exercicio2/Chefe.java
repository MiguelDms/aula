package moduloLaboratorio.aula2.exercicio2;

public class Chefe extends Thread{

    private String nome;
    private Balcao balcao;

    public Chefe(String nome, Balcao b) {
        this.nome = nome;
        this.balcao = b;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                balcao.put(new Refeicao("Refeição: " + i));
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
