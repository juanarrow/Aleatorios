package Ejercicio16;

public class Ejercicio16 {
    private static String obtenerFigura(){
        return switch((int)(Math.random()*5)){
            case 0->"corazón";
            case 1->"diamante";
            case 2->"herradura";
            case 3->"campana";
            case 4->"limón";
            default->"";
        };
    }
    public static void main(String[] args) {
        int iguales = 0;
        while(iguales <= 2){
            String figura1, figura2, figura3;
            figura1 = obtenerFigura();
            System.out.print(figura1+" ");
            figura2 = obtenerFigura();
            System.out.print(figura2+" ");
            figura3 = obtenerFigura();
            System.out.println(figura3);
            iguales = 0;
            if(figura1.equals(figura2) && figura1.equals(figura3))
                iguales = 3;
            else 
            {
                iguales += (figura1.equals(figura2))?2:0;
                iguales += (figura1.equals(figura3))?2:0;
                iguales += (figura2.equals(figura3))?2:0;
            }

            switch(iguales){
                case 0:
                    System.out.println("Lo siento ha perdido");
                    break;
                case 2:
                    System.out.println("Bien, ha recuperado su moneda");
                    break;
                case 3:
                    System.out.println("Enhorabuena, ha ganado 10 monedas");
                    break;
                default:
                    break;
            }
        }
        
    }
    
}
