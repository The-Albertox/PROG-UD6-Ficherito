package ejercico2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "";

        System.out.println("Introduce un texto:");
        texto = teclado.nextLine();

        String textoFormateado = texto.toUpperCase().replace(" ", "_");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ejercico2/formateado2.txt"))) {
            writer.write(textoFormateado);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El texto formateado se ha guardado en src/ejercico2/formateado2.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader("src/ejercico2/formateado2.txt"))) {
            
            int caracteres;
            StringBuilder resultado = new StringBuilder();
            while ((caracteres = reader.read()) != -1) {
                if (resultado.length() > 0) {
                    resultado.append(", ");
                }
                resultado.append((char) caracteres).append("_").append((int) caracteres);
            }
            System.out.println(resultado.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        teclado.close();
    }
}
