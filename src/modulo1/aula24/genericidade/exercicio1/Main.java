package modulo1.aula24.genericidade.exercicio1;

public class Main {

    public static void main(String[] args) {
        /*K key = new K("Numero1");
        V value = new V(1);

        Pair<K, V> pair = new Pair<K, V>(key, value);

        System.out.println(pair.getKey().getKey() + " " + pair.getValue().getValue());*/

        Pair<Integer, String> pair1 = new Pair<Integer, String>(1, "Isto");

        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());
    }

}
