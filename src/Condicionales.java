public class Condicionales {
    public static void main(String[] args) {

        int edad = 5;

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres jubilado.");
        }

        int mes = 6;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;
        }

        // El break no depende de si los case están agrupados o separados — depende de si quieres que la ejecución PARE ahí o SIGA cayendo hacia el siguiente case.


    }
}
