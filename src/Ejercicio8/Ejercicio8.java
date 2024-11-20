package Ejercicio8;

public class Ejercicio8 {
    private static String obtenerApuestaAleatoria(){
        return switch((int)(Math.random()*6)){
            case 0,1,2->"1  ";
            case 3,4->" X ";
            case 5->"  2";
            default->"";
        };
    }

    private static String obtenerGolesAleatorios(){
        int aleatorio = (int)(Math.random()*4);
        return switch(aleatorio){
            case 0,1,2->""+aleatorio;
            case 3->"M";
            default->"";
        };
    }
    public static void main(String[] args) {
        final int PARTIDOS = 14;
        for(int i=1;i<=PARTIDOS; i++){
            System.out.printf("%2s. |%s|%s|%s|%n",
            ""+i, 
            obtenerApuestaAleatoria(), 
            obtenerApuestaAleatoria(), 
            obtenerApuestaAleatoria());
        }
        System.out.printf("PLENO AL 15 - Local...%s Visitante...%s",
            obtenerGolesAleatorios(),
            obtenerGolesAleatorios());
    }
    
}
