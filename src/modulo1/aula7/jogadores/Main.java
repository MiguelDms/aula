package modulo1.aula7.jogadores;

public class Main {

    public static void main(String[] args) {
        Jogador miguel = new Jogador("Miguel", 10);
        JogadorDeCampo raul = new JogadorDeCampo("Raul", 16);
        GuardaRedes carlos = new GuardaRedes("Carlos", 1);

        miguel.setGolosMarcados(2);
        miguel.setGolosMarcados(6);
        System.out.println(miguel.getGolosMarcados());

        carlos.setGolosSofridos(1);
        System.out.println(carlos.getGolosSofridos());

        raul.setPasses(30);
        System.out.println(raul.getPasses());

        System.out.println(miguel.getNumero());
    }

}
