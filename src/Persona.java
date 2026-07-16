public abstract class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas = 0;

    public Persona(String nombreParametro, int edadParametro) {
        nombre = nombreParametro;
        edad = edadParametro;
        contadorPersonas++;
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
        if (nuevaEdad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        edad = nuevaEdad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public abstract String presentarse();
}

