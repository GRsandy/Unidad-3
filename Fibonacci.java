
package fibonacci;

import java.util.Scanner;
/**
 *
 * @author sandy GR
 */
public class Fibonacci {

   
    public static void main(String[] args) {
        
 Scanner n = new Scanner(System.in);
        System.out.println("Serie fibonacci");
        System.out.print(" Ingrese el numero de datos que quiere ver: ");
         int numero,  a = 0, b = 1, c;
          
         numero = n.nextInt();
          for (int i = 0; i < numero ; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            
            }
        }
  
        
    }
    
    





       







