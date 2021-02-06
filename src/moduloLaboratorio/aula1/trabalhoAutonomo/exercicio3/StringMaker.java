package moduloLaboratorio.aula1.trabalhoAutonomo.exercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StringMaker extends Thread{

    private String string = null;
    private int id;

    public StringMaker (int id) {
        this.id = id;
        this.string = getString();
    }

    private String getString() {
        String uuid1 = UUID.randomUUID().toString();
        String uuid2 = UUID.randomUUID().toString();

        uuid1 = uuid1.replace("-", " ");
        uuid2 = uuid2.replace("-", " ");

        StringBuffer stringConcat = new StringBuffer();
        stringConcat.append(uuid1);
        stringConcat.append(uuid2);

        return stringConcat.toString();
    }

    @Override
    public void run() {
        String numberOnly= string.replaceAll("[^0-9]", "");

        System.out.println("Thread nr" + id + ": " + numberOnly);
        for (int j = 0; j < 10; j++) {
            int numero = 0;

            for (int i = 0; i < numberOnly.length(); i++) {
                if (Integer.parseInt(String.valueOf(numberOnly.charAt(i))) == j) {
                    numero++;
                }
            }
            System.out.println(j + ": " + numero);
        }


        System.out.println("-----------------------------------------");
    }

    @Override
    public long getId() {
        return id;
    }
}
