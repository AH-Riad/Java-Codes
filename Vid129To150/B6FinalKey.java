
package Vid129To150;

public class B6FinalKey {
    final String name ="BSFMSTU";     
    int fees = 5000;
    
    void displayInfo()
    { 
       // name = JU; Once we use final keyword we can't reinitialize that varibale with another.
        System.out.println("University name= "+name);
        System.out.println("University fees= "+fees);
    }
    
    public static void main(String[] args) {
        B6FinalKey ob1= new B6FinalKey();
        ob1.displayInfo();
        
    }
}
