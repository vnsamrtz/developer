import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        // Declarar variables

        String nombre = "Vanesa";
        System.out.println("Mi nombre es " + nombre + ".");
        int edad = 22;
        System.out.println("Tengo " + edad + " años.");
        double altura = 1.70;
        System.out.println("Mi altura es " + altura + " m.");
        boolean meGustaProgramar = true;
        System.out.println("¿Te gusta programar? " + meGustaProgramar);

        // Operadores

        int numero1 = 10;
        int numero2 = 3;

        int suma = numero1 + numero2;
        System.out.println("El resultado de la suma de 10 + 3: "+ suma);

        int resta = numero1 - numero2;
        System.out.println("El resultado de la resta de 10 - 3 es " + resta);

        int multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicación de 10 x 3 es " + multiplicacion);

        int division = numero1/numero2;
        System.out.println("El resultado de la división de 10:3 es " + division);

        int resto = numero1 % numero2;
        System.out.println("El resto de la división de 10 : 3 es " + resto);

        boolean mayorque = numero1 > numero2;
        System.out.println("¿10 es mayor que 3? " + mayorque);

        boolean igualque = numero1 == numero2;
        System.out.println("¿El número 10 es igual que el número 3? " + igualque);

        boolean condicionCombinada = numero1 > numero2 && numero2 > 0;
        System.out.println("¿El número 10 es mayor que el número 3 y a su vez, el número 10 es mayor que el número 3? " + condicionCombinada);

        boolean noEsIgual = !(numero1 == numero2);
        System.out.println("¿El número 10 es diferente al número 3? " + noEsIgual);


    }
}