
package Vid129To150;

public class B3ThisKey {
    String name;
    int age;
    String hairColor;
    B3ThisKey(String name, int age)
    {
        this.name = name;
        this.age = age;    
    }  
    
    B3ThisKey(String name, int age, String hairColor)
    {
        this (name,age);
        this.hairColor = hairColor;
        
    }
    
    void displayInfo()
    {
        System.out.println("Name = "+name);
        System.out.println("AGe = "+age);
        System.out.println("Hair Color = "+hairColor);
    }
    public static void main(String[] args) {
        B3ThisKey p1 = new B3ThisKey("A H Riad",22,"Blonde");
        p1.displayInfo();
        
        B3ThisKey p2 = new B3ThisKey("Riad",22,"Black");
        p2.displayInfo();
                
                
    }
    
}
