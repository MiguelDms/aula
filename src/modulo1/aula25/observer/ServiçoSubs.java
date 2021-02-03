package modulo1.aula25.observer;

import java.util.ArrayList;
import java.util.List;

public class ServiçoSubs implements Subject{

    List<Observer> listaSubs = new ArrayList<>();

    @Override
    public void adiciona(Observer o) {
        listaSubs.add(o);
    }

    @Override
    public void remove(Observer o) {
        listaSubs.remove(o);
    }

    @Override
    public void notificao(Message msg) {
        for (Observer observers : listaSubs) {
            observers.update(msg);
        }
    }
}
