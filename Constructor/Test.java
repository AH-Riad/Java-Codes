 
package Constructor;

public class Test {
    public static void main (String [] args)
    {
        Teacher teacher1  = new Teacher();// Object declare and initialization
                                          //Here teacher1 is an object
        teacher1.name = "A H Riad";
        teacher1.gender = "Male";
        
        teacher1.phone = 884862019;
        
        
        System.out.println( "Name = "+teacher1.name);
        System.out.println("gender = "+teacher1.gender);
        System.out.println("Phone = "+teacher1.phone);
 
        

        
        Teacher teacher2  = new Teacher();
        teacher2.name = "Riad";
        teacher2.gender = "Male";
        
        teacher2.phone = 4862019;
        
        
        System.out.println( "Name = "+teacher2.name);
        System.out.println("gender = "+teacher2.gender);
        System.out.println("Phone = "+teacher2.phone);
 
        
    }
}
