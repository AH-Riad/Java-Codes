
package Vid129To150;

public class A10SuperKey {
    String color;
    double weight;
    
    A10SuperKey(String c, double w)
    {
        color = c;
        weight = w;
    }
    void displayInfo()
    {
        System.out.println("Color = "+color);
        System.out.println("Weight = "+weight);
        
    }
    
    public static void main(String[] args) {
        
        Car volbo = new Car("White", 350, 5);
        volbo.displayInfo();
        
    }
    
}
    
    
    class Car extends A10SuperKey{
        int gear;
        
        Car(String c, double w, int g)
        {
            super (c,w);
            
            //color = c;
            //weight = w;
            gear = g;
        }
        
        
        @Override
       void displayInfo()
       {
           super.displayInfo();
           System.out.println("Gear =" +gear);
       }
           
        
    }
        
            
       

