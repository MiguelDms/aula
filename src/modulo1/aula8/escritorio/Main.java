package modulo1.aula8.escritorio;

public class Main {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Miguel", "2ij", 800);

        System.out.println(gerente.calculaSalario());

        Funcionario assistente = new Assistente("Miguel", "2ij", 800);

        System.out.println(assistente.calculaSalario());

        Funcionario vendedor = new Vendedor("Miguel", "2ij", 800, 200);

        System.out.println(vendedor.calculaSalario());

    }


}
