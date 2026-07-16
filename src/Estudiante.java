// HERENCIA

public class Estudiante extends Persona implements Nadador {
    private String centroEstudios;
    private double nota;
    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("La nota debe estar entre 0 y 10");
        }
        this.nota = nota;
    }

    public Estudiante(String nombreParametro, int edadParametro, String centroEstudiosParametro) {
        super(nombreParametro, edadParametro);
        centroEstudios = centroEstudiosParametro;
    }

    public String getCentroEstudios() {
        return centroEstudios;
    }

    public double getNota() {
        return nota;
    }

    public void setCentroEstudios(String nuevoCentro) {
        centroEstudios = nuevoCentro;
    }

    // POLIMORFISMO

    @Override
    public String presentarse() {
        return "Hola, soy " + getNombre() + " y estudio en " + getCentroEstudios();
    }
    @Override
    public void nadar() {
        System.out.println(getNombre() + " está nadando.");
    }
}