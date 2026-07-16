public class Excepciones {
    public static void main(String[] args) {

        try {
            int[] numeros = { 1, 2, 3};
            System.out.println(numeros[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ha ocurrido un error: índice fuera de rango.");
        } finally {
            System.out.println("Fin del intento de acceso");
        }

        System.out.println("El programa sigue funcionando con normalidad.");

    }
}

