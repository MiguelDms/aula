package modulo1.aula8.trabalhoAutonomo.xadrez;

public class Peao extends Peça {

    public Peao(int h, int v) {
        super(h, v);
        movimentos = new String[8];
    }

    public void movimentosPossiveis() {
        int vertical;

        for (int i = 1; i <= 7; i++) {
            if (v >= 8 || h >= 8){
                System.out.println("Coordenadas inválidas");
                break;
            } else if (v == i) {
                vertical = i + 1;
                movimentos[i] = "O movimmento disponivel é: horizontal" + h + " - horizontal " + h + " / vertical " + v + " - vertical " + vertical;
                System.out.println(movimentos[i]);
            }
        }
    }
}
