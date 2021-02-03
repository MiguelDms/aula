package moduloLaboratorio.aula2;

public class Contador{
    private int contador = 0;


    public synchronized void incermentar() {
        contador++;
    }

    public synchronized void decermentar() {
        contador--;
    }

    public synchronized int consulta() {
        return contador;
    }
}
