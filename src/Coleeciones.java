import java.util.ArrayList;

public class Coleeciones {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Vanesa");
        nombres.add("Raúl");
        nombres.add("Fran");
        nombres.add("Andrea");

        nombres.remove("Andrea");

        System.out.println(nombres);        // [Vanesa, Raúl, Fran, Andrea]
        System.out.println(nombres.get(0)); // Vanesa
        System.out.println(nombres.size()); // 3

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
