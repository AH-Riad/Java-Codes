
package Static;

public class StaticMethod0 {
    
    void display1()
    {
        System.out.println("I am a non static method");
    }
    
    static void display2()
    {
        System.out.println("I am static method");
    }
    
    public static void main ( String[] args)
    {
        StaticMethod ob1 = new StaticMethod();
        ob1.display1();
        
        StaticMethod.display2();     // STATIC METHODS ARE CALLES THROUGH CLASSSES NOT OBJECT
    }
    
}

