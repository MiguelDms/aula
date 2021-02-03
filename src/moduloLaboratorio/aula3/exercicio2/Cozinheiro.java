package moduloLaboratorio.aula3.exercicio2;

public class Cozinheiro extends Thread{

    private String nome;
    private Mesa mesa;

    public Cozinheiro(String nome, Mesa mesa) {
        this.nome = nome;
        this.mesa = mesa;
    }

    @Override
    public void run() {

        //while true - faltava isso

        while (true) {
            try {
                Javali j = new Javali("Bovina");
                mesa.put(j);
                sleep(1000);
                System.out.println(nome + " está a cozinhar o javali " + j.getId());
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
