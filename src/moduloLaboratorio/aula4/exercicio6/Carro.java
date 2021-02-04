package moduloLaboratorio.aula4.exercicio6;

import java.util.Collections;
import java.util.List;

public class Carro {

    private List<Roda> rodas;
    private Motor motor;
    private Chassis chassis;

    public Carro(List<Roda> rodas, Motor motor, Chassis chassis) {
        this.rodas = rodas;
        this.motor = motor;
        this.chassis = chassis;
    }

    public List<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "rodas=" + rodas +
                ", motor=" + motor.getId() +
                ", chassis=" + chassis.getId() +
                '}';
    }
}
