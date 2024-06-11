package ejercicio4.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManegadorDeMesa {

    private static final String FILE_PATH = "src/ejercicio4/clases/datosMesa.txt";

    public void guardarMesa(Mesa mesa) {
        List<Mesa> mesas = obtenerTodasLasMesas();
        mesas.add(mesa);
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(mesas);
        } catch (IOException e) {
            System.out.println("Error al guardar la mesa: " + e.getMessage());
        }
    }

    public List<Mesa> obtenerTodasLasMesas() {
        List<Mesa> mesas = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(FILE_PATH);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    ObjectInputStream ois = new ObjectInputStream(bis)) {
                mesas = (List<Mesa>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer las mesas: " + e.getMessage());
            }
        }
        return mesas;
    }
}
