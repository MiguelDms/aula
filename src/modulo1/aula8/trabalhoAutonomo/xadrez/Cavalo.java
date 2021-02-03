package modulo1.aula8.trabalhoAutonomo.xadrez;

public class Cavalo extends Peça {

    public Cavalo(int h, int v) {
        super(h, v);
        movimentos = new String[10];
    }

    public void movimentosPossiveis() {
        int horizontalP;
        int verticalP;
        int horizontalN;
        int verticalN;

        for (int i = 1; i <= 8; i++) {
            if (v == i || h == i ) {
                verticalP = v + 2;
                verticalN = v - 2;
                horizontalP = h + 1;
                horizontalN = h - 1;

                if (verticalP > 8 || verticalN < 1 || horizontalN < 1 || horizontalP > 8) {
                    movimentos[i] = null;
                } else {
                    movimentos[i] = "Os movimmentos disponiveis são: horizontal" + h + " - horizontal" + horizontalP + " / vertical" + v + " - vertical" + verticalP + " //// horizontal" + h + " - horizontal" + horizontalN + " / vertical" + v + " - vertical" + verticalN ;
                    System.out.println(movimentos[i]);
                }
            } else if ((v > 8 || h > 8) && (v < 1 || h < 1)) {
                System.out.println("Coordenadas inválidas");
                break;
            }
        }
    }

}
