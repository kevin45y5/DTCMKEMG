import java.util.Scanner;

public class Ejercicio1 {

    public static class DescuentoEtiquetas {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Sistema de Descuentos por Color de Etiqueta ---");


            System.out.print("Ingresa el monto total de la compra: $");
            double compra = scanner.nextDouble();
            scanner.nextLine();


            System.out.println("\nColores de etiqueta disponibles:");
            System.out.println("- Verde (5%)  - Roja (10%)  - Azul (15%)  - Dorada (20%)");
            System.out.print("Ingresa el color de la etiqueta: ");
            String etiqueta = scanner.nextLine().toLowerCase().trim();

            double porcentajeDescuento = 0.0;
            boolean etiquetaValida = true;


            switch (etiqueta) {
                case "verde":
                    porcentajeDescuento = 0.05;
                    break;
                case "roja":
                case "rojo":
                    porcentajeDescuento = 0.10;
                    break;
                case "azul":
                    porcentajeDescuento = 0.15;
                    break;
                case "dorada":
                case "dorado":
                    porcentajeDescuento = 0.20;
                    break;
                default:
                    etiquetaValida = false;
                    System.out.println("\n❌ Error: Color de etiqueta no reconocido. No se aplicará descuento.");
                    break;
            }


            double montoDescuento = compra * porcentajeDescuento;
            double totalAPagar = compra - montoDescuento;


            System.out.println("\n--- Resumen de Cuenta ---");
            System.out.printf("Monto original:       $%8.2f%n", compra);

            if (etiquetaValida) {
                System.out.printf("Descuento (%s):   -$%8.2f (%.0f%%)%n", etiqueta, montoDescuento, (porcentajeDescuento * 100));
            } else {
                System.out.println("Descuento aplicado:   -$    0.00 (0%)");
            }

            System.out.println("------------------------------------");
            System.out.printf("Total a pagar:        $%8.2f%n", totalAPagar);

            scanner.close();
        }
    }
}