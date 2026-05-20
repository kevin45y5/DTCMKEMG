import java.util.Scanner;

public class Ejercicio5 {

    public static class SumaRepetitivaDoWhile {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double sumaTotal = 0.0;
            String respuesta;

            System.out.println("--- Acumulador de Números con Do-While ---");

            do {

                System.out.print("Ingresa un número cualquiera: ");
                double numero = scanner.nextDouble();


                sumaTotal += numero;


                scanner.nextLine();


                System.out.print("¿Deseas ingresar otro número? (si/no): ");
                respuesta = scanner.nextLine().toLowerCase().trim();
                System.out.println();

            } while (respuesta.equals("si") || respuesta.equals("s"));



            System.out.println("--- Resumen Final ---");
            System.out.printf("La suma total de todos los números ingresados es: %.2f%n", sumaTotal);
            System.out.println("¡Gracias por usar el programa!");

            scanner.close();
        }
    }
}