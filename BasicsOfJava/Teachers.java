
package BasicsOfJava;


public class Teachers {
            String name,gender;
            int phone;
        public static void main (String[] args)
    {

        
        Teachers teacher1 = new Teachers();
        teacher1.name = "Riad";
        teacher1.gender = "Male";
        teacher1.phone = 1884862019 ;
        
        System.out.println("Name = "+teacher1.name);
        System.out.println ("Gender = "+teacher1.gender);
        System.out.println ("Phone number = " +teacher1.phone);
    }
    
}
