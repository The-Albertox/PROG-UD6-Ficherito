package ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "";

        while (true) {
            System.out.println("Introduce un texto que tenga al menos 30 caracteres:");
            texto = teclado.nextLine();
            if (texto.length() < 30) {
                int letrasFaltantes = 30 - texto.length();
                System.out.println("Te faltaron " + letrasFaltantes + " caracteres.");
            } else {
                break;
            }
        }

        String textoFormateado = texto.toUpperCase().replace(" ", "_");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ejercicio1/formateado.txt"))) {
            writer.write(textoFormateado);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El texto formateado se ha guardado en formateado.txt");
    }
}
