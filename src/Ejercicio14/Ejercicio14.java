package Ejercicio14;

public class Ejercicio14 {
    public static void main(String[] args) {
        final int INTENTOS = 5;
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 100;
        System.out.printf("""
                Piensa un número del %d al %d. Intentaré adivinarlo en %d intentos.
                Pulsa la tecla INTRO cuando estés preparado.
                """, MIN_VALUE, MAX_VALUE, INTENTOS);
        System.console().readLine();
        boolean salir = false;
        boolean acierto = false;
        int intentos = 0;
        int intervaloMin = MIN_VALUE;
        int intervaloMax = MAX_VALUE;
        while(!salir){
            int valor = (intervaloMax-intervaloMin)/2 + intervaloMin;
            System.out.printf("Es el %d?%n", valor);
            System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
            int opcion = Integer.parseInt(System.console().readLine());
            switch(opcion){
                case 1:
                    intervaloMin = valor+1;
                    break;
                case 2:
                    intervaloMax = valor-1;
                    break;
                case 3:
                    acierto = true;
                    break;
                default:
                    break;
            }
            intentos++;
            salir = acierto || intentos >= INTENTOS;
        }
        if(acierto)
            System.out.println("¡Bien! ¡he acertado!");
        else
            System.out.println("Vaya, no he conseguido acertar el número.");
    }
    
}
