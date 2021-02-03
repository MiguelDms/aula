package modulo1.aula25.observer;

public interface Subject {
    public void adiciona(Observer o);
    public void remove(Observer o);
    public void notificao(Message msg);
}
