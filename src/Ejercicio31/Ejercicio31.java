package Ejercicio31;

public class Ejercicio31 {
    private static int dado1;
    private static int dado2;

    private static int tiradaDado(){
        return (int)(Math.random()*6 + 1);
    }

    private static void tiradaDados(){
        dado1 = tiradaDado();
        System.out.printf("Dado 1: %d%n", dado1);
        dado2 = tiradaDado();
        System.out.printf("Dado 2: %d%n", dado2);
        
    }


    private static boolean craps(int objetivo){
        boolean gana = false;
        System.out.printf("Tiene que seguir tirando, debe conseguir el %d para ganar.%n", objetivo);
        System.out.println("Si obtiene un 7, perderá la partida.");
        System.out.print("Pulse INTRO para tirar los dados.");
        System.console().readLine();
        while(!gana){
            tiradaDados();
            int suma = dado1 + dado2;
            System.out.printf("Suma: %d%n", suma);
            gana = suma==objetivo;
            if(suma==7 || suma==objetivo)
                break;
            else
                System.out.println("Continúe jugando.");
            System.out.print("Pulse INTRO para tirar los dados.");
            System.console().readLine();
        }
        return gana;
    }
    public static void main(String[] args) {
        try {
            int monedero = 10000;
            while (monedero>0) {
                System.out.println("¿Cuánto dinero quiere apostar? ");
                int apuesta = Integer.parseInt(System.console().readLine());
                tiradaDados();
                int suma = dado1 + dado2;
                System.out.printf("Suma: %d%n", suma);
                boolean gana = false;
                switch (suma) {
                    case 7, 11:
                        //he ganado
                        gana = true;
                        
                        break;
                    case 2, 3, 12:
                        //he perdido
                        gana = false;
                        
                        break;
                    default:
                        gana = craps(suma);
                        break;
                }
                if(gana){
                    System.out.printf("¡Enhorabuena! ¡Ha ganado otros %d €!", apuesta);
                    monedero += apuesta;
                    System.out.printf("¡Ahora tiene %d €!", monedero);
                }
                else{
                    System.out.println("Lo siento ha perdido todo su dinero");
                    monedero -= apuesta;
                }
                    
            }
        } catch (NumberFormatException e) {
            
        } catch (Exception e) {
            
        }
        

    }
    
}
