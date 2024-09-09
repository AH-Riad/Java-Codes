
package Constructor;

public class PrintInfoUsingMethod {
    String name,gender;
    int phone;
    void SetInformation ()
    {
         System.out.println ("Name = " +name);
         System.out.println ("gender = " +gender);
         System.out.println ("phone = " +phone);
        
    }
    
    public static void main (String [] args)
    {
        System.out.println ("Information for student 1");

        PrintInfoUsingMethod s1 = new PrintInfoUsingMethod();
        s1.name = "A H Riad";
        s1.gender = "Male";
        s1.phone = 884862019;
        s1.SetInformation();
        
        System.out.println ("Information for student 2");
        
        PrintInfoUsingMethod s2 = new PrintInfoUsingMethod();
        
        s2.name = "A H Riad khan";
        s2.gender = "Male";
        s2.phone = 884862019;
        
        s2.SetInformation();
        
    }
    
    
}