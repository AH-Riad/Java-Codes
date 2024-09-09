
package Vid129To150;

public class A9SuperKey {
    
    A9SuperKey()
    {
        System.out.println("A'S CONSTRUCTOR");
    }
    
    public static void main(String[] args) {
        D ob1 = new D();
        
    }
    
}


class D extends A9SuperKey{
    D(){
        super();
        System.out.println("B'S CONSTRUCTOR");
    }
            
}
