
package Vid129To150;

public class B4ThisKey {
    void printInfo()
    {
        System.out.println("I am printInfo method");
    }
    
    void displayInfo()
    { 
        this.printInfo();
        System.out.println("I am displayInfo mehtod");
    }
    
    public static void main(String[] args) {
        B4ThisKey p1 = new B4ThisKey();
        p1.displayInfo();
    }
}
