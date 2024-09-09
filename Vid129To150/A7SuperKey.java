
package Vid129To150;

public class A7SuperKey {
    int x = 10;
    
    public static void main(String[] args) {
        B s1 = new B();
        s1.display();
    }
    
}

class B extends A7SuperKey {
    int x =5;
    void display()
    {
        System.out.println("Value of x = " +super.x);     // WITHOUT SUPER CLASS VALUE OF X WILL BE 5
                                                          // WITH SUPER CLASS VALUE OF X WILL BE 10
    }
    
}
