package modulo1.aula25.factory;

public class Pirata extends Inimigo{

    public void pirata() { //se so quiser ter um inimigo do genero pirata, então posso passar logo todos os valores para o construtor.
        setNome("pirata");
        setPosition(0);
    }

}
