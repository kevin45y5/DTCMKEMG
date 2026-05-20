import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2, suma;
        String opcion = "si";

        System.out.println("--- Sistema de Suma de Números ---");

        while (opcion.equalsIgnoreCase("si")) {

            System.out.print("\nIngresa el primer número: ");
            num1 = entrada.nextInt();

            System.out.print("Ingresa el segundo número: ");
            num2 = entrada.nextInt();

            suma = num1 + num2;

            System.out.println("\n--- Resultado ---");
            System.out.println("✔ La suma de los números es: " + suma);

            entrada.nextLine();

            System.out.print("\n¿Deseas realizar otra suma? (si/no): ");
            opcion = entrada.nextLine();
        }

        System.out.println("\n--- Programa Finalizado ---");

        entrada.close();
    }
}