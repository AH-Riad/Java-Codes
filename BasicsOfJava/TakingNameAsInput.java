
package BasicsOfJava;

import java.util.Scanner;


public class TakingNameAsInput {
    public static void main (String [] args)
    {
        System.out.print ("Enter your name :");
        Scanner input = new Scanner (System.in);
        String name;
        name = input.nextLine();
        System.out.println ("WELCOME  :"+name);
    }
    
}
