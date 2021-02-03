package modulo1.aula25.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton a = Singleton.getInstancia(); //como o single é estatico, não o tenho de instanciar.
        Singleton b = Singleton.getInstancia(); //tou sempre a trabalhar com o mesmo objecto.
        System.out.println(a.getNome());
        System.out.println(b.getNome());
        a.setNome("ola");
        System.out.println(a.getNome());
        System.out.println(b.getNome());
    }
}

