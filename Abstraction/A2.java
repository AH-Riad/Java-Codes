
package Abstraction;

public abstract class A2 {
    
    void call()                                  // Non abstract method
    {
        System.out.println("I am call method");
    }
    
    abstract void sendMessage();                 //Abstract method
    
    
    public static void main(String[] args) {
        //A2 ob1= new A2();                      // obeject can't be created in abstract class
        A2 ob1;                                  //We Need to creat reference variable instead of object
        
        ob1 = new Riad();
        ob1.sendMessage();
        
        ob1 = new Ah();
        ob1.sendMessage();
        ob1.call();
    }
    
}
      
    class Riad extends A2{
       @Override
       void sendMessage()
        {
            System.out.println("I'm no one");
            
        }
      
    }

class Ah extends A2{
       @Override
       void sendMessage()
        {
            System.out.println("I'm Ahona");
            
        }
      
    }
    
    

