package modulo1.aula8.trabalhoAutonomo.forma;

public class Main {

    public static void main(String[] args) {

        Forma[] f = new Forma[5];

        f[0] = new Quadrado(4);
        f[1] = new Rectangulo(2,3);
        f[2] = new Circulo(5);
        f[3] = new Rectangulo(10,3);
        f[4] = new Circulo(19);

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i].calcularArea() + " - " + f[i].calcularPerimetro());
        }
    }
}
