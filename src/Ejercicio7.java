import java.util.Scanner;

public class Ejercicio7 {

    public static class TablaMultiplicarFor {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Generador de Tablas de Multiplicar ---");


            System.out.print("Ingresa un número natural (mayor a 0): ");
            int numero = scanner.nextInt();


            while (numero <= 0) {
                System.out.println("Error: El número ingresado no es un número natural.");
                System.out.print("Inténtalo de nuevo. Ingresa un número mayor a 0: ");
                numero = scanner.nextInt();
            }


            System.out.println("\n--- Tabla del " + numero + " ---");


            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.printf("%d x %2d = %d%n", numero, i, resultado);
            }

            System.out.println("--------------------");
            scanner.close();
        }
    }
}
