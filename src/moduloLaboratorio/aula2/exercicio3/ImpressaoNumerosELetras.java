package moduloLaboratorio.aula2.exercicio3;

public class ImpressaoNumerosELetras {

    private StringBuffer numerosELetras = new StringBuffer();
    int countLetras = 0;
    int countNumeros = 0;

    public String getNumerosELetras() {
        return numerosELetras.toString();
    }

    public synchronized void insereNumero(int numero) {

        while (countNumeros == 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



        this.numerosELetras = numerosELetras.append(numero);
        countNumeros++;

        if (countLetras == 1) {
            countLetras = 0;
        }

        notifyAll();

    }

    public synchronized void insereLetras(String letra) {
        while (countLetras == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        this.numerosELetras = numerosELetras.append(letra);
        countLetras++;

        if (countNumeros == 2) {
            countNumeros = 0;
        }

        notifyAll();
    }
}

