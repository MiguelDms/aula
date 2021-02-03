package modulo1.aula25.command;

public class Televisao implements AparelhoElectronico{

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Tv ligada");
    }

    @Override
    public void off() {
        System.out.println("Tv desligada");
    }

    @Override
    public void aumentarVolume() {
        volume++;
        System.out.println("O volume está a " + volume);
    }

    @Override
    public void reduzirVolume() {
        volume--;
        System.out.println("O volume está a " + volume);
    }
}
