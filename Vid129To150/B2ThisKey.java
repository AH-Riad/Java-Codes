
package Vid129To150;

public class B2ThisKey {
    String name ;
    int age;
    
    B2ThisKey(String name, int age)
    {
        this.name = name; 
        this.age = age;
    }
    
    void display()
    {
        System.out.println("Name =" +name);
        System.out.println("Age =" +age);
    }
    
    public static void main(String[] args) {
        B2ThisKey p1 = new B2ThisKey("Riad", 22);
        p1.display();
    }
    
}


        
