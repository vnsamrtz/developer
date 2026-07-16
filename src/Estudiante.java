// HERENCIA

public class Estudiante extends Persona {
    private String centroEstudios;

    public Estudiante(String nombreParametro, int edadParametro, String centroEstudiosParametro) {
        super(nombreParametro, edadParametro);
        centroEstudios = centroEstudiosParametro;
    }

    public String getCentroEstudios() {
        return centroEstudios;
    }

    public void setCentroEstudios(String nuevoCentro) {
        centroEstudios = nuevoCentro;
    }

    // POLIMORFISMO

    @Override
    public String presentarse() {
        return "Hola, soy " + getNombre() + " y estudio en " + getCentroEstudios();
    }
}