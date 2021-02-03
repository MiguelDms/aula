package modulo1.aula7.loja;

public class Director extends Empregado {

    protected boolean objectivo = false;
    protected int salario = 800;
    protected int lucro;

    public Director(String nome, int lucro) {
        super(nome);
        this.lucro = lucro;
    }

    public void setObjectivo(boolean objectivo) {
        this.objectivo = objectivo;
    }

    public int checkObj() {
        if (this.objectivo) {
             return 800 + (int) (0.01 * lucro);
        } else {
            return 0;
        }
    }

    public void setSalario() {
        System.out.println(checkObj());
        System.out.println(salario);
        this.salario = this.salario + checkObj();
        System.out.println(salario);
    }

    public int getSalario() {
        return salario;
    }
}