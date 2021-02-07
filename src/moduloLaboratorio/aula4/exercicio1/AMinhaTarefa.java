package moduloLaboratorio.aula4.exercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AMinhaTarefa implements Runnable{
    private List<String> listaPalavras;

    public AMinhaTarefa(List<String> p) {
        this.listaPalavras = p;
    }

    @Override
    public void run() {
        readMy();
    }

    public void readMy() {

        for (int i = 0; i < listaPalavras.size(); i++) {
            String word = listaPalavras.get(i);
            String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
            listaPalavras.set(i, cap);
        }

        for (String l : listaPalavras) {
            //System.out.println(l);
        }
    }
}
