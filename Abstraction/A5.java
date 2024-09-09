
package Abstraction;

public interface A5 {
    
    public abstract void eat();
    
    
    public static void main(String[] args) {
        
        A5 d ;
        d = new dog();
        d.eat();
        
        d = new cat();
        d.eat();
        
    }
    
}
    
    class dog implements A5{
         @Override
        public void eat()
        {
            System.out.println("Dogs can eat");
            
        }
    }

    class cat implements A5{
         @Override
        public void eat()
        {
            System.out.println("cats can eat");
            
        }
    }
    
    

