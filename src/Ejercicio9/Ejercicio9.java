package Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        final int VALOR_FIN = 24;
        boolean salir = false;
        while(!salir){
            int valor = (int)(Math.random()*101);
            System.out.print(valor+" ");
            salir = (valor==VALOR_FIN);
        }
    }
    
}
