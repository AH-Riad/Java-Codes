
package Constructor;

public class PrintInfoUsingMethod2 {
   String name,gender;
   int phone;
   
   void displayInfo(String name, String gender, int phone)
   {
       System.out.println ("Name = " +name);
       System .out.println ("Gender = " +gender);
       System.out.println ("Phone Number = " +phone);   
   }
   
   public static void main (String[] args)
   {
          PrintInfoUsingMethod2 s1= new PrintInfoUsingMethod2();
          s1.displayInfo ( " A H Riad", "Male", 1884862019);
     
   }
   
   
}

