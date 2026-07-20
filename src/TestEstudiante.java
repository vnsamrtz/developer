import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Vanesa", 22, "MEDAC");
        Estudiante estudiante2 = new Estudiante("Raúl", 24, "AYALA");
        // Persona persona1 = new Persona("Raúl", 24);

        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante1.getEdad());
        System.out.println(estudiante1.getCentroEstudios());
        System.out.println(estudiante1.presentarse());
        estudiante1.nadar();
        System.out.println(Persona.getContadorPersonas());
        // System.out.println(persona1.getNombre());
        // System.out.println(persona1.getEdad());
        // System.out.println(persona1.presentarse());

        try {
            estudiante1.setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error de edad: " + e.getMessage());
        }

        try {
            estudiante1.setNota(15);
        } catch (NotaInvalidaException e) {
            System.out.println("Error de nota: " + e.getMessage());
        }

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        Comparator<Estudiante> porNombre = new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e1.getNombre().compareTo(e2.getNombre());
            }
        };

        System.out.println("Antes: " + estudiantes);
        Collections.sort(estudiantes, porNombre);
        System.out.println("Después: " + estudiantes);
    }
}
