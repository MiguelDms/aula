package modulo1.aula10.trabalhoAutonomo.pessoaContacto;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Contacto[] c = new Contacto[3];

        c[0] = new Contacto("Miguel", 1183183);
        c[1] = new Contacto("Miguel", 2309123);
        c[2] = new Contacto("Magda",32333344);

        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].getNome() + " " + c[i].getTelefone());
        }
    }
}
