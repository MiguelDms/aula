package moduloLaboratorio.aula4.trabalhoAutonomo;

import java.util.Random;

public class Macaco extends Thread{

    private static final int STRINGLENGTH = 100000;
    private MesaDeShakespear m;

    public Macaco(MesaDeShakespear m) {
        this.m = m;
    }

    @Override
    public void run() {
        try {
            while (true) {
                m.colocarPalavras(generateString());
            }
        } catch (InterruptedException e) {

        }

    }

    public String generateString(){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i< STRINGLENGTH; i++){
            if(r.nextInt(5) == 0) {
                sb.append(' ');
            }else{
                sb.append(Character.toChars(r.nextInt(26) + 'a'));
            }
        }
        return sb.toString();
    }

}
