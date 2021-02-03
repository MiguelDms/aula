package modulo1.aula10.figura;

public class Prisma implements FiguraGeometricaTridimensional {

    private int altura;
    private Rectangulo rec;

    public Prisma(int altura, Rectangulo rec) {
        this.altura = altura;
        this.rec = rec;
    }

    public Rectangulo getRec() {
        return rec;
    }

    @Override
    public String getNomeFiguraTridimensional() {
        return "Prisma";
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public int getVolume() {
        return altura * rec.getArea();
    }
}
