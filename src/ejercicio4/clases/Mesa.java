package ejercicio4.clases;
import java.io.Serializable;
public class Mesa implements Serializable{
    
    private String color;
    private int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Mesa es de color: " + color + " y tiene " + numeroPatas + " patas";
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return this.numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

   

}
