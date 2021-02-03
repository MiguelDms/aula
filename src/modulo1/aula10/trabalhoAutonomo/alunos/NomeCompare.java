package modulo1.aula10.trabalhoAutonomo.alunos;

import java.util.Comparator;

public class NomeCompare implements Comparator<Estudante> {
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
