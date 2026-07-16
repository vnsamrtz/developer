public class TestPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Vanesa", 22);
        Persona persona2 = new Persona("Raúl", 24);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());

        System.out.println(persona2.getNombre());
        System.out.println(persona2.getEdad());

        persona2.setEdad(25); // Modificar la edad
        System.out.println(persona2.getEdad()); // Comprobar la edad modificada
    }
}