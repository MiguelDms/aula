package modulo1.aula25.observer;

public class Subscriber1 implements Observer{

    @Override
    public void update(Message msg) {
        System.out.println("Mensagem recebida");
    }
}
