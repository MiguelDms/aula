package moduloLaboratorio.aula4.trabalhoAutonomo;

import java.util.ArrayList;
import java.util.List;

public class Shakespeare extends Thread{

    private List<String> livro = new ArrayList<>();
    private Macaco[] conjuntoDeMacacos;
    private int MAX_NUMERO_LINHAS = 3;
    private String PROCURA = "o romeu";
    private MesaDeShakespear m;

    public Shakespeare(MesaDeShakespear m, Macaco[] mc) {
        this.m = m;
        this.conjuntoDeMacacos = mc;
    }

    @Override
    public void run() {

        while (livro.size() <= MAX_NUMERO_LINHAS) {
            String frase = m.levantarPalavras();
            System.out.println(frase);

            if (frase.toLowerCase().contains(PROCURA.toLowerCase())) {

                System.out.println("Encontrei a palavra");
                livro.add(frase);

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for (Macaco mc : conjuntoDeMacacos) {
            mc.interrupt();
        }

        mostrarLivro();
    }

    public List<String> getLivro() {
        return livro;
    }

    public void mostrarLivro() {
        StringBuffer stringBuffer = new StringBuffer();

        for (String l : livro) {
            stringBuffer.append(l);
        }

        System.out.println(stringBuffer.toString());
    }
}
