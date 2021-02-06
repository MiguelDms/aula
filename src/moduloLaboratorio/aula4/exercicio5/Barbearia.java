package moduloLaboratorio.aula4.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Barbearia {

    private List<Cadeira> listaCadeiras;
    private static final String DESIGNACAO_CADEIRA_ESPERA = "Cadeira espera";
    private Cadeira cadeiraDoCorte;
    private int atendidos;

    public Barbearia() {
        this.listaCadeiras = new ArrayList<>();
        this.cadeiraDoCorte = new Cadeira(1, "Cadeira do corte");
        listaCadeiras.add(cadeiraDoCorte);
        listaCadeiras.add(new Cadeira(2, DESIGNACAO_CADEIRA_ESPERA));
        listaCadeiras.add(new Cadeira(3, DESIGNACAO_CADEIRA_ESPERA));
        listaCadeiras.add(new Cadeira(4, DESIGNACAO_CADEIRA_ESPERA));
    }

    public synchronized Cadeira cortaCabelo() {

                while (!cadeiraDoCorte.getEstado()) {
                    try {
                        wait();
                        System.out.println("O barbeiro está em espera");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        return cadeiraDoCorte;
    }

    public synchronized void getCadeira(Cliente cliente) {


        if (cliente.getCadeira() != null) {
            if (cliente.getCadeira().getTipo().equals("Cadeira espera") && !cadeiraDoCorte.getEstado()) {
                cliente.getCadeira().setEstado(false);
                listaCadeiras.add(cliente.getCadeira());
                cliente.setCadeira(cadeiraDoCorte);
                cliente.getCadeira().setEstado(true);
                listaCadeiras.remove(cadeiraDoCorte);
            }
        }

        if (cliente.getCadeira() == null) {

            if (listaCadeiras.size() > 0) {
                Cadeira cadeira = null;
                for (Cadeira c : listaCadeiras) {
                    if (!c.getEstado() && cliente.getCadeira() == null) {
                        cliente.setCadeira(c);
                        cliente.getCadeira().setEstado(true);
                        cadeira = c;
                    }
                }
                listaCadeiras.remove(cadeira);
            }

            if (cliente.getCadeira() == null) {
                cliente.clienteSaiERegressa(cliente.getCadeira());
            }
        }
        notifyAll();
    }

    public int getAtendidos() {
        return atendidos;
    }

    public List<Cadeira> getListaCadeiras() {
        return listaCadeiras;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = this.atendidos + atendidos;
        imprimeTotalAtendidos();
    }

    public void imprimeTotalAtendidos() {
        if (this.atendidos == 5) {
            System.out.println("O barbeiro Antonio cortou o cabelo de toda a gente");
        }
    }
}
