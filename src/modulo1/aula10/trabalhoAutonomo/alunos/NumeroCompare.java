package modulo1.aula10.trabalhoAutonomo.alunos;

import java.util.Comparator;

public class NumeroCompare implements Comparator<Estudante> {


    @Override
    public int compare(Estudante o1, Estudante o2) {
       if (o1.getNumero() < o2.getNumero()) {
           return -1;
       } else if(o1.getNumero() > o2.getNumero()) {
           return 1;
       } else {
           return 0;
       }
    }
}
