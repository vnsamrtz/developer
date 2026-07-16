public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Vanesa", 22, "MEDAC");
        Persona persona1 = new Persona("Raúl", 24);

        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante1.getEdad());
        System.out.println(estudiante1.getCentroEstudios());
        System.out.println(estudiante1.presentarse());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.presentarse());

    }
}
