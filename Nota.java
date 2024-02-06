import java.util.Scanner;

public class Nota{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca su nota");
        byte qualification = in.nextByte();
        
        if (qualification == 3 || qualification == 4) {
          System.out.println("Aprobado");   
        }else if(qualification == 5) {
          System.out.println("Excelente");
        }else if (qualification == 2) {
          System.out.println("suspenso");
        }else{
          System.out.println("Nota invalida");
        }
    }
}