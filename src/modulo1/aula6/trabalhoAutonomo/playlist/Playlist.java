package modulo1.aula6.trabalhoAutonomo.playlist;

public class Playlist {

    private int capacidade;
    private Musica[] musicas;

    public Playlist(int capacidade) {
        this.capacidade = capacidade;
        musicas = new Musica[capacidade]; // Não se passa o vector mMusica para o construtor
    }

    public void mostrarMusicas() {
        for (int i = 0; i<musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println(musicas[i].getTitulo());
            }
        }
    }

    public void acrescentar(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null && musicas.length <= capacidade) {
                musicas[i] = musica;
                break;
             }

            }
    }

    public void remover(Musica musica) {
        for (int i = 0; i<musicas.length; i++) {
            if (musicas[i] == musica)
                musicas[i] = null;
        }
    }

    public int calculaMusica() {
        int count = 0;

        for (int i = 0; i<musicas.length; i++) {
            if (musicas[i] != null) {
                count = count + musicas[i].getDuracao(); // ou count +=
            }
        }

        return count;
    }

}
