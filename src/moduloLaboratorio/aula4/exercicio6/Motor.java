package moduloLaboratorio.aula4.exercicio6;

import java.util.UUID;

public class Motor {

    private String id = UUID.randomUUID().toString();
    private String tipo = "Motor";

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
