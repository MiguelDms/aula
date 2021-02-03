package moduloLaboratorio.aula4.exercicio3;

public class Main {

    public static void main(String[] args) {
        RecursoPartilhado r = new RecursoPartilhado();
        Produtor[] produtors = new Produtor[5];
        Consumidor[] consumidors = new Consumidor[5];

        for (int i = 0; i < 5; i++) {
            consumidors[i] = new Consumidor("Consumidor1" + i, r);
            produtors[i] = new Produtor("Produtor1" + i, r);
        }

        for (int i = 0; i < 5; i++) {
            produtors[i].start();
        }

        for (int i = 0; i < 5; i++) {
            consumidors[i].start();
        }
    }
}
