package ExceptionAndHash;

public class A2 {

    public static void main(String[] args) {
        try {                                  //  In try  block we'll write those code whcih 
                                               //  can give exception...
            int x = 10;                        // Try block detects the problem nd sends it to catch block
            int y = 0;
            int result = x / y;
            
        }catch(ArithmeticException e){                   //catch block cathes the exception and tries to solve it
            System.out.println("Exception type :"  +e);
            
            
        }

        //System.out.println("Result =" + result);
        System.out.println("Last line of the program");
    }

}
