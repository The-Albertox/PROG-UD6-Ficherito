package ejercicio4;

import java.util.List;
import java.util.Scanner;

import ejercicio4.clases.ManegadorDeMesa;
import ejercicio4.clases.Mesa;

public class Ejercicio4 {
    public static void main(String[] args) {
        ManegadorDeMesa manegador = new ManegadorDeMesa();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas almacenadas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el color de la mesa: ");
                    String color = teclado.nextLine();
                    System.out.print("Introduce el número de patas de la mesa: ");
                    int numeroPatas = teclado.nextInt();
                    teclado.nextLine();

                    Mesa nuevaMesa = new Mesa(color, numeroPatas);
                    manegador.guardarMesa(nuevaMesa);
                    System.out.println("Mesa guardada con éxito.");
                    break;

                case 2:
                    List<Mesa> mesas = manegador.obtenerTodasLasMesas();
                    System.out.println("Mesas almacenadas:");
                    for (Mesa mesa : mesas) {
                        System.out.println(mesa);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}
