package moduloLaboratorio.aula2.trabalhoAutonomo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Encomenda> encomendaList = new ArrayList<Encomenda>();
        Armazem armazem = new Armazem(produzEncomendas(encomendaList));

        Thread carrinha1 = new Carrinha(armazem,1);
        Thread carrinha2 = new Carrinha(armazem,2);
        Thread carrinha3 = new Carrinha(armazem,3);


        carrinha1.start();
        carrinha1.join();
        carrinha2.start();
        carrinha2.join();
        carrinha3.start();
        carrinha3.join();

    }






    public static List<Encomenda> produzEncomendas(List<Encomenda> list) {
        for(int i = 1; i <= 50; i++) {
            list.add(new Encomenda(i));
        }
        return list;
    }
}
