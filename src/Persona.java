public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombreParametro, int edadParametro) {
        nombre = nombreParametro;
        edad = edadParametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            edad = nuevaEdad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    public String presentarse() {
        return "Hola, soy " + nombre;
    }
}
