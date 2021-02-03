package modulo1.aula7.loja;

public class Empregados{

    private Empregado[] empregados;

    public Empregados() {
        empregados = new Empregado[3];
    }



    public void contratar(Empregado empregado) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) {
                empregados[i] = empregado;
                break;
            }
        }

    }

    public boolean mostrarE() {
        if (empregados[0] == null) {
            System.out.println("Não existem empregados");
            return false;
        }

        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] != null) {
                System.out.println(empregados[i].getNome() + " " + empregados[i].getSalario());
            }
        }

        return true;
    }

    public void removerE(Empregado empregado) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == empregado) {
                empregados[i] = null;
            }
        }
    }




}
