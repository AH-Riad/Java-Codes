
package Vid129To150;


public class B7FinalKey {
    final String name= "BSFMSTU";
    final int fees;    //blank final variable
                       //we must need to creat a constructor to initialize black final variable
    B7FinalKey()
    {
        fees = 5000;
    }
    void display ()
    {
        System.out.println("University Name =" +name);
        System.out.println("University fees =" +fees);
    }
    
    public static void main(String[] args) {
        B7FinalKey ob1 = new B7FinalKey();
        ob1.display();
    }
    
}
