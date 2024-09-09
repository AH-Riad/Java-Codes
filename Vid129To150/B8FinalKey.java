
package Vid129To150;


public class B8FinalKey {
    final String name= "BSFMSTU";
    static final int fees;    //static blank final variable
                             //we must need to creat a static block to initialize black final variable
    static
    {
        fees = 5000;
    }
    void display ()
    {
        System.out.println("University Name =" +name);
        System.out.println("University fees =" +fees);
    }
    
    public static void main(String[] args) {
        B8FinalKey ob1 = new B8FinalKey();
        ob1.display();
    }
    
}
