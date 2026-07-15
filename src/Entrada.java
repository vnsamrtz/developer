import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Escribe tu edad");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + " tienes " + edad + " años.");
        }
    }
