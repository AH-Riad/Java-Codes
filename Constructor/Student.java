
package Constructor;


public class Student {
String name,id;
int phone;

    
    public static void main ( String [] args)
    {
        System.out.println ( "Information of student 1");

        Student s = new Student();
        s.name = "A H Riad";
        s.id = "22111127";
        s.phone = 884862019;
        
        System.out.println ( "Name = "+s.name);
        System.out.println ( "id = "+s.id);
        System.out.println ( "Number = "+s.phone);

        System.out.println ( "Information of student 2");
        
        
        Student s1 = new Student();
        s1.name = "Riad";
        s1.id = "22111127";
        s1.phone = 884862019;
        
        System.out.println ( "Name = "+s1.name);
        System.out.println ( "id = "+s1.id);
        System.out.println ( "Number = "+s1.phone);
    }
   
}
