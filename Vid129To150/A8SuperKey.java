
package Vid129To150;

public class A8SuperKey {
    void display()
    {
        System.out.println("INSIDE A CLASS");
    }
    
    public static void main(String[] args) {
        C ob1 = new C();
        ob1.display();
    }
    
}


class C extends A8SuperKey{

    @Override
    void display() {
        super.display();
    }
    {
        System.out.println("INSIDE B CLASS");
    }
}