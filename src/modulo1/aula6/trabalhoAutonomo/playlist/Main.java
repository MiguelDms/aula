package modulo1.aula6.trabalhoAutonomo.playlist;

public class Main {

    public static void main(String[] args) {

        Musica m1 = new Musica("musica1", 120);
        Musica m2 = new Musica("musica2", 120);

        Playlist p = new Playlist(3);

        p.acrescentar(m1);
        p.acrescentar(m2);
        p.mostrarMusicas();
        System.out.println(p.calculaMusica());

    }
}
