package ejercicio3;

import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ejercicio3/resultado.txt"));
                BufferedReader reader1 = new BufferedReader(new FileReader("src/ejercicio1/formateado1.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("src/ejercico2/formateado2.txt"))) {

            writer.write("Contenido del Fichero Uno:\n");
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.newLine();

            writer.write("Contenido del Fichero Dos:\n");
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.newLine();

            // Añadir el mensaje de firma
            writer.write("Firmado por: Alberto");
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El contenido fusionado se ha guardado en resultado");
    }
}
