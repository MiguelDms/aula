package modulo1.aula7.loja;

public class Gerente extends Empregado {

    protected boolean objectivo = false;
    protected int salario = 800;

    public Gerente(String nome) {
        super(nome);
    }

    public void setObjectivo(boolean objectivo) {
        this.objectivo = objectivo;
    }

    public int checkObj() {
        if (this.objectivo) {
            return 200;
        } else {
            return 0;
        }
    }

    public void setSalario() {
        this.salario = salario + this.checkObj();
    }

    public int getSalario() {
        return salario;
    }


}
