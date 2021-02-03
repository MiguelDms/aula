package moduloLaboratorio.aula3.exercicio2;

public class Glutao extends Thread{

    private String nome;
    private Mesa mesa;

    public Glutao(String nome, Mesa mesa) {
        this.nome = nome;
        this.mesa = mesa;
    }

    @Override
    public void run() {

        //while true - faltava isso
        while (true) {
            try {
                sleep(1000);
                System.out.println(nome + " está a comer o javali " + mesa.get().getId());
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
}
