import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Streams {
    public static void main(String[] args) {

        ArrayList<Integer> edades = new ArrayList<>();
        edades.add(7);
        edades.add(15);
        edades.add(20);
        edades.add(35);
        edades.add(26);

        List<Integer> pares = edades.stream()
                //.filter(n -> n % 2 == 0)
                .map(n -> n + 1)
                .collect(Collectors.toList());

        System.out.println(pares);

        int suma = edades.stream()
                .reduce(0, (acumulado, actual) -> acumulado + actual);

        System.out.println(suma);
    }
}
