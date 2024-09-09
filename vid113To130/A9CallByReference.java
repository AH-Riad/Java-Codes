
package vid113To130;

public class A9CallByReference {
    String name;
    void change (A9CallByReference r2)     //WHAT IS THIS ???  
    {
        r2.name = "Rubel";
    }
    
    public static void main (String [] args)
    {
        A9CallByReference r1 = new A9CallByReference();
        r1.name = "Anis";
        
        System.out.println("BEFORE CALLING :"+r1.name);
        
        r1.change (r1);
        
        System.out.println("AFTER CALLING :"+r1.name);
    }
    
}
