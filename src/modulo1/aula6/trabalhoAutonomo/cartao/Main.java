package modulo1.aula6.trabalhoAutonomo.cartao;

public class Main {

    public static void main(String[] args) {
        CreditCard cartao = new CreditCard("Miguel", 12345, "03-03-2023", 200, 1000);

        cartao.gastar(50, "Bola");
        cartao.gastar(100, "Gelado");
        cartao.gastar(60, "Gel");
        System.out.println(cartao.saldo());
        System.out.println(cartao.getSaldo());
        cartao.gastar(90, "Gel");
        System.out.println(cartao.getDivida());
        System.out.println(cartao.saldo());
        cartao.pagarCredito(350);
        System.out.println(cartao.getDivida());
        System.out.println(cartao.saldo());
        System.out.println(cartao.getSaldo());
        cartao.gastar(500, "hell");

        System.out.println(cartao.obterTalao());
        System.out.println(cartao.getMovimentos());

    }
}
