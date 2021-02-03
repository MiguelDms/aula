package teste2.pergunta2;

public class Car {

    private String matricula;

    public Car(String matricula, int i) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toCurrentPlate() {
        String license = this.matricula;
       // if (license.charAt(2) == '-' && license.charAt(5) == '-') { //com charAt colocar ''
           return license.replaceAll("-", " ");
        /*} else {
            return license;
        }*/
    }
}
