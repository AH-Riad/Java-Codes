
package BasicsOfJava;

import java.util.Scanner;


public class Assignment3UserInput {
    public static void main (String [] args)
    {
        System.out.print ("Enter your ID :");
        Scanner input = new Scanner(System.in);
        int id;
        id = input.nextInt();
  
        System.out.print ("Enter product tittle :");
        Scanner abc = new Scanner(System.in);
        String tittle;
        tittle = abc.nextLine();
        
        System.out.print ("Enter product category :");
        Scanner de = new Scanner(System.in);
        String category;
        category = de.nextLine();
        
        System.out.print ("Your entered ID :" +id);
        System.out.print ("Your entered tittle :" +tittle);
        System.out.print ("Your entered category :" +category);
                
        
    }
    
}
