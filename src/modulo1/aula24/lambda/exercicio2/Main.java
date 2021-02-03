package modulo1.aula24.lambda.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        listaPessoa.add(new Pessoa("Miguel", 30));
        listaPessoa.add(new Pessoa("Rui", 3));
        listaPessoa.add(new Pessoa("Neuza", 20));
        listaPessoa.add(new Pessoa("Neuza", 21));
        listaPessoa.add(new Pessoa("Neuza", 22));
        listaPessoa.add(new Pessoa("Neuza", 24));
        inserePessoa(listaPessoa);
    }

    public static void inserePessoa(List<Pessoa> pessoas) {
        pessoas.sort((p1, p2) -> {
           return p1.getName().compareTo(p2.getName());
        });

        System.out.println(pessoas);

    }

}
