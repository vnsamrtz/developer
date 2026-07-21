import java.io.FileWriter;
import java.io.IOException;

    public class EscribirArchivo {
        public static void main(String[] args) {
            try {
                FileWriter writer = new FileWriter("datos.txt");
                writer.write("Hola, Vanesa\n");
                writer.write("Segunda línea\n");
                writer.close();
                System.out.println("Archivo escrito correctamente");
            } catch (IOException e) {
                System.out.println("Error al escribir: " + e.getMessage());
            }
        }
    }
