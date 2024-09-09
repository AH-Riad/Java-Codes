
package vid113To130;


public class A8CallByValue {
    void change (int i)                           // FORMAL PARAMETER
    {
        i=20;
    }

public static void main (String [] args)
{
    A8CallByValue ob = new A8CallByValue();
    int x = 10;                                   // PRIMITIVE DATA
    
    System.out.println("X before call:" +x );
    
    ob.change(x);                                 // ACTUAL PARAMETER
    
    System.out.println("X after call:" +x);
}
     
}
