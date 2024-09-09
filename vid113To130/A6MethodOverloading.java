
package vid113To130;


public class A6MethodOverloading {
    void add (int a ,int b )
    {
        System.out.println(a+b);
        
    }
    
    void add (double a ,double b )
    {
        System.out.println(a+b);
        
    }
    
    void add (int a ,int b, int c )
    {
        System.out.println(a+b+c);
        
    }
    
    void add ()
    {
        System.out.println("Nothing to add");
        
    }
 
    public static void main (String[] args)
    {
        A6MethodOverloading ob = new A6MethodOverloading();
        ob.add();
        ob.add(5,6);
        ob.add(2.5,8.5);
        ob.add(5,6,7);
    }
    
}
