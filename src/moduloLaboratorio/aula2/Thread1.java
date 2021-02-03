package moduloLaboratorio.aula2;

public class Thread1 extends Thread{

    private Contador contador;
    private String name;

    public Thread1(Contador contador, String name) {
        this.contador = contador;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            contador.incermentar();
            System.out.println(name + ": " + contador.consulta());
        }
    }
}
