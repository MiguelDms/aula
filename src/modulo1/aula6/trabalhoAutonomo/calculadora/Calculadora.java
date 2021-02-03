package modulo1.aula6.trabalhoAutonomo.calculadora;

public class Calculadora {

    private String[] historico;

    public Calculadora() {
        historico = new String[100];
    }

    public int soma(int a, int b) {
        int total = 0;
        String operador = "+";

        total = a + b;

        guardar(a, operador, b, total);
        return total;
    }

    public int sub(int a, int b) {
        int total = 0;
        String operador = "-";

        total = a - b;

        guardar(a, operador, b, total);
        return total;
    }

    public int mult(int a, int b) {
        int total = 0;
        String operador = "*";

        total = a * b;

        guardar(a, operador, b, total);
        return total;
    }

    public int div(int a, int b) {
        int total = 0;
        String operador = "/";

        total = a / b;

        guardar(a, operador, b, total);
        return total;
    }

    public int potencia(int valor, int potencia) {
        int total = valor;
        String operador = "potencia";

        for (int i = 1; i < potencia; i++) {
           total = total * valor;
        }

        guardar(valor, operador, potencia, total);
        return total;
    }

    public int modulus(int a, int b) {
        int total = 0;
        String operador = "%";

        total = a % b;
        guardar(a, operador, b, total);
        return total;

    }

    public void guardar(int valor1, String operador, int valor2, int resultado) {

        for (int i = 0; i < historico.length; i++) {
            if (historico[i] == null && operador.equals("potencia")) {
                historico[i] = valor1 + " á potencia de " + valor2 + " = " + resultado;
                break;
            } else if (historico[i] == null){
                historico[i] = valor1 + operador + valor2 + " = " + resultado;
                break;
            }
        }
    }

    public void obter() {
        for (int i = 0; i < historico.length; i++) {
            if (historico[i] != null) {
                System.out.println(historico[i]);
            }
        }
    }

    public void obterU(int q) {
        int count = 0;

        for (int i = 0; i < historico.length; i++) {
            if (historico[i] != null) {
                count++;
            }
        }
        if (q > count) {
            System.out.println("Não existem assim tantas operações");
        } else {
            for (int x = count - q; x < count; x++) {
                System.out.println(historico[x]);
            }
        }
    }

}
