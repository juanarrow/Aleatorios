package Ejercicio0;

public class Ejercicio0 {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++){
            int aleatorio = (int)(Math.random()*6 + 1);
            if(Math.random()>0.1){
                aleatorio = 1;
            }
            
            System.out.println(aleatorio);

        }

    }
    
}
