package Ejercicio17;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        //int altura = Integer.parseInt(System.console().readLine());
        int altura = 10;
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");    
        //int anchura = Integer.parseInt(System.console().readLine());
        int anchura = 20;
        int posicion = (int)(Math.random()*((altura-2)*(anchura-2)));
        int fila = posicion/(anchura-2)+1;
        int columna = posicion%(anchura-2)+1;
        System.out.printf("%d-%d%n", fila, columna);
        for(int i=0;i<altura;i++){
            for(int j=0;j<anchura;j++){
                if(i==0 || i==altura-1 || j==0 || j==anchura-1)
                    System.out.print("*");
                else if(i==fila && j==columna)
                    System.out.print("&");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
