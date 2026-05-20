import java.util.Scanner;

public class Ejercicio3 {

    public static class ParesEntreNumeros {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Generador de Números Pares entre dos Valores ---");


            System.out.print("Ingresa el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int num2 = scanner.nextInt();


            int inicio = Math.min(num1, num2);
            int fin = Math.max(num1, num2);

            System.out.println("\nLos números pares entre " + inicio + " y " + fin + " (inclusive) son:");


            int actual = inicio;
            boolean seEncontroPar = false;

            while (actual <= fin) {
                // Evaluamos si el número actual es par usando el operador residuo (%)
                if (actual % 2 == 0) {
                    System.out.print("[" + actual + "] ");
                    seEncontroPar = true;
                }

                actual++;
            }


            if (!seEncontroPar) {
                System.out.print("No existen números pares en este rango.");
            }

            System.out.println();
            scanner.close();
        }
    }
}