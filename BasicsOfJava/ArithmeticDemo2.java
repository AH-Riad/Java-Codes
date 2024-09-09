
package BasicsOfJava;

import java.util.Scanner;


public class ArithmeticDemo2 {
    public static void main ( String [] args)
            
    {
        System.out.print("Enter your first positive number :");
        int num1,num2,result;
        
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        System.out.print("Enter your second positive number :");
        Scanner inp = new Scanner(System.in);
        num2 = inp.nextInt();
        result = num1 + num2 ;
        System.out.println ("Result = " +result);
        
    }
    
}
