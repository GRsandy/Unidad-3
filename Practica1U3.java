package u3.practica1;
import java.util.Scanner;
/**
 *
 * @author sandy
 */
public class U3Practica1 {

    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num=scanner.nextInt();  
        if (num%2==0){
            System.out.println("El2 numero es par");
        }
        else{
            System.out.println("El numero no es par");
        }
    } 
}
    
