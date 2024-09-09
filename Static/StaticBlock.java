
package Static;

public class StaticBlock {
    static int id ;                  // WE COULD HAVE DECALARE ID, NAME AND INITIALIZE VALUES
    static String name ;             // AT THE SAME TIME INSTEAD OF USING STATIC BLOCK
    
    static{
        id = 22111127;
        name = "BSFMSTU";
    }
    
    static void display()
    {
        System.out.println ("ID = " +id);
        System.out.println("name = " +name);
    }
    
    public static void main ( String [] args)
    {
        StaticBlock.display();
    }
    
}

