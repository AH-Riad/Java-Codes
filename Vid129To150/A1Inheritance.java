
package Vid129To150;

public class A1Inheritance {
    String name;
    int age;
    void displayInfo ()
    {
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);

    }
    
    public static void main(String[] args) {
        Student s1 = new Student ();
        s1.name = "A H Riad";
        s1.age = 22;
        s1.qualification = "BSc in CSE";
        
        Student s2 = new Student ();
        s2.name = "Riad";
        s2.age = 22;
        s2.qualification = "BSc in CSE";
        
        s1.displayInfo2();
        s2.displayInfo2();
        
        
    }   
}
    class Student  extends A1Inheritance{
        String qualification;
        void displayInfo2()
        {
            //System.out.println("Name :" +name);
            //System.out.println("Age :" +age);
            displayInfo();
            System.out.println("Qualification :" +qualification);
        }
        
    }

