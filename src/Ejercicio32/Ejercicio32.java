package Ejercicio32;

public class Ejercicio32 {
    private static int imprimeTrozoCamino(int desplz){
        int movimiento = (int)(Math.random()*3 -1);
        String camino = "    ";
        if((int)(Math.random()*2)==1){
            char obstaculo = ((int)(Math.random()*2)==1)?'*':'O';
            int posicion = (int)(Math.random()*4 + 1);
            camino = "";
            for(int i=1;i<=posicion-1;i++)
                camino +=" ";
            camino += obstaculo;
            for(int i=posicion+1;i<=4;i++)
                camino +=" ";
        }
        desplz = Math.max(0, desplz+movimiento);
        System.out.printf((desplz==0?"%s":"%"+desplz+"s") +"|%s|%n","",camino);
        return desplz;
    }

    public static void main(String[] args) {
        try {
            final int RELLENO = 5;
            System.out.print("Introduzca la longitud del sendero en metros: ");
            int metros = Integer.parseInt(System.console().readLine());    
            int desplazamiento = RELLENO;
            for(int i=1;i<=metros;i++){
                desplazamiento = imprimeTrozoCamino(desplazamiento);
            }     
        } catch (Exception e) {
            System.out.print(e);
        }
        
    }
    
}
