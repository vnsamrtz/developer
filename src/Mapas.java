import java.util.HashMap;

public class Mapas {
    public static void main(String[] args) {

        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Vanesa", 22);
        edades.put("Raúl", 24);
        edades.put("Fran", 17);

        System.out.println(edades.get("Vanesa"));   // 22
        System.out.println(edades.containsKey("Raúl"));   // true
        System.out.println(edades.size());   // 2

        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años");
        }
    }
}
