
package Static;


public class StaticMethod {
    
    
    static int x = 10;
    void display1 ()
    {
        System.out.println ( " I'm a non static method");
    }
    
    static void display2 ()
    {
        System.out.println (" " +x);     // STATIC MEMBERS ONLY CAN BE  PRINTED USING STATIC FUNCTION
        System.out.println ("I'm a static method");
        
    }
    
    public static void main ( String [] args)
    {
        StaticMethod ob1 = new StaticMethod ( );
        ob1.display1 (); //CALLING NON STATIC METHOD USINFG FUNCTION
        
        StaticMethod.display2(); // CALLING STATIC METHOD USING CLASS(Properties of static method
        
    
}

    
}
