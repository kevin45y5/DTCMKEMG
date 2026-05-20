import java.util.Scanner;

public class ejercicio2 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int numero;
            int contador = 0;

            System.out.println("--- Sistema de Números Pares ---");

            System.out.print("Ingresa un número límite: ");
            numero = entrada.nextInt();

            System.out.println("\nNúmeros pares encontrados:");

            while (contador <= numero) {

                if (contador % 2 == 0) {
                    System.out.println("✔ Número par: " + contador);
                }

                contador++;
            }

            System.out.println("\n--- Proceso Finalizado ---");

            entrada.close();
        }
    }
