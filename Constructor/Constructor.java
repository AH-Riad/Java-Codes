
package Constructor;


public class Constructor {
    
    String name,gender;
    int phone;
    
    Constructor()
    {
            System.out.println ( " I'M A DEFAULT CONSTRUCTOR ");
            
            }
    
    Constructor(String n, String g, int p)
    { 
        // You must need to initialize the instance variable o
        // Otherwise you need to use this keyword
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInfo()
    
    {
        System.out.println ( "Name = "+name);
        System.out.println ( "gender = "+gender);
        System.out.println (  "Phone Number = "+phone);
        
    }
    public static void main (String [] args)
    {
        Constructor s1= new Constructor ("A H Riad", "Male", 884862019);
        s1.displayInfo();
    }
    
}