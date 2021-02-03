package modulo1.aula7.loja;

public class Main {

    public static void main(String[] args) {

        Empregados empresa = new Empregados();
        Empregado ze = new Empregado("ze");
        System.out.println("O meu nome é " + ze.getNome() + " e o meu salário é " + ze.getSalario());

        Director carlos = new Director("Carlos", 5000);
        System.out.println(carlos.objectivo);
        carlos.setSalario();
        System.out.println(carlos.salario);
        carlos.setObjectivo(true);
        System.out.println(carlos.objectivo);
        System.out.println(carlos.checkObj());
        carlos.setSalario();

        System.out.println("O meu nome é " + carlos.getNome() + " e o meu salário é " + carlos.getSalario());

        Gerente manuel = new Gerente("Manuel");
        System.out.println(manuel.objectivo);
        manuel.setSalario();
        System.out.println(manuel.salario);
        manuel.setObjectivo(true);
        System.out.println(manuel.objectivo);
        System.out.println(manuel.checkObj());
        manuel.setSalario();
        empresa.contratar(manuel);

        empresa.contratar(carlos);
        empresa.contratar(ze);
        empresa.mostrarE();
        empresa.mostrarE();




        System.out.println("O meu nome é " + manuel.getNome() + " e o meu salário é " + manuel.getSalario());

    }

}
