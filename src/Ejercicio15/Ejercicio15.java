package Ejercicio15;

public class Ejercicio15 {
    private static String obtenerNota(){
        return switch((int)(Math.random()*7)){
            case 0->"do";
            case 1->"re";
            case 2->"mi";
            case 3->"fa";
            case 4->"sol";
            case 5->"la";
            case 6->"si";
            default->"";
        };
    }
    
    public static void main(String[] args) {
        int compases = (int)(Math.random()*7 + 1);
        
        String primera = "";
        for(int i=1;i<=compases;i++){
            String nota = obtenerNota();
            System.out.print(nota+" ");
            if(i==1)
                primera = nota;
            nota = obtenerNota();
            System.out.print(nota+" ");
            nota = obtenerNota();
            System.out.print(nota+" ");
            if(i==compases){
                nota = primera;
                System.out.print(nota+" ||");
            }
            else{
                nota = obtenerNota();
                System.out.print(nota+" | ");
            }
            
        }  
        
    }
    
}
