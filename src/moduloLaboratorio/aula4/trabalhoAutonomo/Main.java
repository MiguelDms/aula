package moduloLaboratorio.aula4.trabalhoAutonomo;

public class Main {

    public static void main(String[] args) {
        MesaDeShakespear mesa = new MesaDeShakespear();
        Macaco[] listaMacacos = new Macaco[10];
        Shakespeare sp = new Shakespeare(mesa, listaMacacos);

        for (int i = 0; i < listaMacacos.length; i++) {
            listaMacacos[i] = new Macaco(mesa);
        }

        for (Macaco m : listaMacacos) {
            m.start();
        }

        sp.start();


    }
}
