package modulo1.aula6;

public class Aula06 {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa("Joao", "Pereira", 30, "rua tal", "Portugues");
        Pessoa miguel = new Pessoa("Miguel", "Pereira", 30, "rua tal", "Portugues");


        System.out.println(joao.getFirstName());
        System.out.println(joao.getNacionalidade());
        System.out.println(joao.idade);
        joao.setFirstName("Luis");

        System.out.println("O " + joao.getFirstName() + " é " + joao.getNacionalidade() + " e tem " + joao.idade + " anos.");
        System.out.println(miguel);

        Rectangulo rec = new Rectangulo(2, 4);
        rec.ifQuadrado();
    }

}
