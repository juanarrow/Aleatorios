package Ejercicio12;
import java.lang.Thread;

public class Ejercicio12 {
    private static char obtenerAscii(){
        final int MIN_ASCII = 32;
        final int MAX_ASCII = 126;
        return (char)(Math.random()*(MAX_ASCII-MIN_ASCII+1) + MIN_ASCII);
    }
    public static void main(String[] args) {
        while(true){
            System.out.printf("%s", obtenerAscii());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                
            }
        }
    }
    
}
