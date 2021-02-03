package modulo1.aula10.figura;

public class Main {

    public static void main(String[] args) {

        Circulo c = new Circulo(17);
        Quadro q = new Quadro(10);
        Rectangulo r = new Rectangulo(10, 15);
        Prisma p = new Prisma(10, r);

        System.out.println(r.getArea());
        System.out.println(p.getVolume());

    }


}
