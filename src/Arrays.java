public class Arrays {
    public static void main(String[] args) {

        // Estructura: tipo[] nombreArray = new tipo[tamaño];
        // Acceder a la posición que queremos: int[] edades = {22, 25, 30, 18, 40}; System.out.println(edades[0]);   // imprime 22 (el PRIMER elemento)

        // Saber el número de elementos que tiene el array: System.out.println(edades.length);   // imprime 5

        String[] nombres = {"Vanesa", "Raúl", "Fran", "Vera", "Andrea"};

        System.out.println(nombres[0]);
        System.out.println(nombres[4]);
        System.out.println(nombres.length);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}