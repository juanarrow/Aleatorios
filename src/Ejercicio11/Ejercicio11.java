package Ejercicio11;

public class Ejercicio11 {
    private static String obtenerNota(){
        return switch((int)(Math.random()*5)){
            case 0->"suspenso";
            case 1->"suficiente";
            case 2->"bien";
            case 3->"notable";
            case 4->"sobresaliente";
            default->"";
        };
    }
    public static void main(String[] args) {
        final int NUMERO_NOTAS = 20;
        int sobresalientes = 0;
        int notables = 0;
        int bienes = 0;
        int suficientes = 0;
        int suspensos = 0;


        for(int i=1;i<=NUMERO_NOTAS;i++){
            String nota = obtenerNota();
            System.out.printf("%s ", nota);
            switch(nota){
                case "suspenso":
                    suspensos++;
                    break;
                case "suficiente":
                    suficientes++;
                    break;
                case "bien":
                    bienes++;
                    break;
                case "notable":
                    notables++;
                    break;
                case "sobresaliente":
                    sobresalientes++;
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        System.out.printf("Nº de suspensos: %d%n", suspensos);
        System.out.printf("Nº de suficientes: %d%n", suficientes);
        System.out.printf("Nº de bienes: %d%n", bienes);
        System.out.printf("Nº de notables: %d%n", notables);
        System.out.printf("Nº de sobresalientes: %d%n", sobresalientes);

    }
    
}
