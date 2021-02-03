package moduloLaboratorio.aula4.exercicio2;

import moduloLaboratorio.aula4.exercicio1.AMinhaTarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

        public static void main(String[] args) throws InterruptedException {
            List<Bolas> bList = new ArrayList<>();


            ExecutorService pool = Executors.newFixedThreadPool(6);

            for (int i = 0; i < 20; i++) {
               Bolas b = new Bolas("Anonimo" + i);
               pool.submit(b);
               bList.add(b);
            }

            pool.shutdown();
            pool.awaitTermination(75, TimeUnit.SECONDS);

            int valor = bList.get(0).getValor();
            Bolas premiada = bList.get(0);

            for (Bolas b : bList) {
                if (valor < b.getValor()) {
                    valor = b.getValor();
                    premiada = b;
                }
            }

            System.out.println("O valor da bola premiada é de " + valor + " e ela pertence ao " + premiada.getNome());



        }


    }

