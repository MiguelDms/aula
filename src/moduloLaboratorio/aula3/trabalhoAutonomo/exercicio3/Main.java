package moduloLaboratorio.aula3.trabalhoAutonomo.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Cliente> listaClientes = new ArrayList<>();
        ContaBancaria cb = new ContaBancaria();

        Cliente cliente1 = new Cliente("Jesperse", cb);
        Cliente cliente2 = new Cliente("eesp", cb);
        Cliente cliente3 = new Cliente("Jseo", cb);
        Cliente cliente4 = new Cliente("Jonas", cb);
        Cliente cliente5 = new Cliente("Jl", cb);
        Cliente cliente6 = new Cliente("Jerta", cb);
        Cliente cliente7 = new Cliente("Jersey", cb);
        Cliente cliente8 = new Cliente("Jelo", cb);
        Cliente cliente9 = new Cliente("Joe", cb);
        Cliente cliente10 = new Cliente("Jose", cb);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
        listaClientes.add(cliente6);
        listaClientes.add(cliente7);
        listaClientes.add(cliente8);
        listaClientes.add(cliente9);
        listaClientes.add(cliente10);

        for (Cliente l : listaClientes) {
            l.start();
        }

        Thread.sleep(10000);

        for (Cliente l : listaClientes) {
            l.interrupt();
            l.join();
        }

        System.out.println(cb.getBalance());
        System.out.println(somarResultado(listaClientes));

    }

   public static int somarResultado(List<Cliente> listaClientes){
        int valorDepositado = 0;

        for (Cliente l : listaClientes) {
            valorDepositado += l.getValorDepositado();
        }

        return valorDepositado;
   }


}
