package modulo1.aula25.factory;

public class FabricaInimigo {

    public Inimigo criarInimigo(String letra) {
        if (letra == "A") {
            return new Pirata();
        } else {
            return new Comandante();
        }
    }
}
