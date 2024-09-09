
package Vid129To150;

public class A40OverRriding {
String name;
int agee;

void displayInfo()
{
    
    System.out.println("Name:" +name);
    System.out.println("Age:" +agee);
    
}
    public static void main(String[] args) {
        Teacher t1 = new Teacher ();
        t1.name = "Riad";
        t1.agee = 22;
        t1.qualification = "Bsc in CSE";
        t1.displayInfo();                                       //CALLING 2nd ONE
        
        A40OverRriding t2 = new A40OverRriding ();
        t2.name = "A H Riad";
        t2.agee = 22;
        t2.displayInfo();                                       //CALLING  1st ONE

                        
    }
}
 class Teacher extends A40OverRriding{
    String qualification ;
    
    @Override
    void displayInfo()
    {
        System.out.println("Name :" +name);
        System.out.println("Age :" +agee);
        System.out.println("Qualification :" +qualification);
    }
}






