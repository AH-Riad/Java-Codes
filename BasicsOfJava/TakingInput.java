package BasicsOfJava;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        // Prompt the user to enter a number
        System.out.print("Enter any number: ");
        
        // Read an integer input from the user and store it in the 'number' variable
        number = input.nextInt();
        
        // Print the entered number
        System.out.println("Number = " + number);

        // Confirm that the number has been read
        System.out.println("Number read successfully.");
        
        // Close the scanner
    }
}