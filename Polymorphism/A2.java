
package Polymorphism;

public class A2 {
    void display()
    {
        System.out.println("I am person");
    }
    
    public static void main(String[] args) {
        A2 ob1 = new A2();
        ob1.display();

        ob1 = new teacher();
        ob1.display();                  //STATIC BINDING
        
        ob1 = new student();
        ob1.display();

    }
    
}

class teacher extends A2{
    @Override
    void display()
        {
            System.out.println("I am a Teacher");
        }


}


class student extends A2{
    @Override
    void display()
        {
            System.out.println("I am Student");
        }


}



