package moduloLaboratorio.aula4.exercicio6;

public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Log log = new Log();
        FabricanteChassis fabricanteChassis1 = new FabricanteChassis(1, fabrica);
        FabricanteChassis fabricanteChassis2 = new FabricanteChassis(2, fabrica);
        FabricanteMotor fabricanteMotor1 = new FabricanteMotor(1, fabrica);
        FabricanteMotor fabricanteMotor2 = new FabricanteMotor(2, fabrica);
        FabricanteMotor fabricanteMotor3 = new FabricanteMotor(3, fabrica);
        FabricanteMotor fabricanteMotor4 = new FabricanteMotor(4, fabrica);
        FabricanteRodas fabricanteRodas1 = new FabricanteRodas(1, fabrica);
        FabricanteRodas fabricanteRodas2 = new FabricanteRodas(2, fabrica);


        log.start();
        fabricanteChassis1.start();
        fabricanteChassis2.start();
        fabricanteMotor1.start();
        fabricanteMotor2.start();
        fabricanteMotor3.start();
        fabricanteMotor4.start();
        fabricanteRodas1.start();
        fabricanteRodas2.start();
    }
}
