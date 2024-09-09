package ExceptionAndHash;

public class A3 {

    public static void main(String[] args) {
        try {                                  //  In try  block we'll write those code whcih 
            //  can give exception...
            int x = 10;                        // Try block detects the problem nd sends it to catch block
            int y = 0;
            int result = x / y;

        } catch (Exception e) {                // WE CAN SIMPLY USE JUST "EXCEPTION" IF WE DON'T KNOW THE TYPE
            System.out.println("Exception type :" + e);

        } //System.out.println("Result =" + result);
        //System.out.println("Last line of the program");
        finally {
            System.out.println("Last line of the program");
                                                //FINALLY BLOCK ALWAYS EXECUTES EVEN IF THERE'S ERROR

        }

    }

}
