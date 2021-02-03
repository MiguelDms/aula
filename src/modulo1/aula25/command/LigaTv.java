package modulo1.aula25.command;

public class LigaTv implements Comando{
    private AparelhoElectronico aparelhoElectronico;

    public LigaTv(AparelhoElectronico aparelhoElectronico) {
        this.aparelhoElectronico = aparelhoElectronico;
    }

    @Override
    public void executa() {
        aparelhoElectronico.on();
    }

    @Override
    public void desfaz() {
        aparelhoElectronico.off();
    }
}
