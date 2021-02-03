package modulo1.aula11.trabalhoAutonomo.casa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Casa {
    Map<String, List<Eletrodomestico>> mapa;
    private final String divisao;


    public Casa(String divisao){
        mapa = new HashMap<String, List<Eletrodomestico>>();
        this.divisao = divisao;
    }

    public String getDivisao() {
        return divisao;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "divisao='" + getDivisao() + '\'' + mapa.get(getDivisao()) +
                '}';
    }

    public void inserirElectro(List<Eletrodomestico> lista) {
       mapa.put(divisao, lista);
   }

   public void removerElectro(String marca) {
      List<Eletrodomestico> lista = mapa.get(divisao);
       List<Eletrodomestico> lista2 = new ArrayList<Eletrodomestico>();

      for (int i = 0; i < lista.size(); i++) {
          Eletrodomestico eletrodomestico = lista.get(i);
          if (eletrodomestico.getMarca().equals(marca)) {
              lista2.add(eletrodomestico);
          }
      }
       lista.removeAll(lista2);
       System.out.println(lista);
   }


}
