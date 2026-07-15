public class TestPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Vanesa", 22);
        Persona persona2 = new Persona("Raúl", 24);

        System.out.println(persona1.nombre);
        System.out.println(persona1.edad);

        System.out.println(persona2.nombre);
        System.out.println(persona2.edad);
    }
}