
package Static;

public class StaticExample1 {
    String Name;
    int Id ;
    static String UniversityName = "BSFMSTU" ;
    StaticExample1 (String n, int i)
    {
        Name = n;
        Id = i;
    }
    
    void displayInfo ()
    {
        System.out.println ( " Name= " + Name);
        System.out.println( "ID =" +Id);
        System.out.println ( "UNIVERSITY NAME = " +UniversityName);       
    } 
    
    public static void main ( String [] args)
    {
        StaticExample1 s1 = new StaticExample1("A H Riad" , 22111127);  //WE DIDN'T ENTER UNIVERSITY NAME BUT MADE IT STATIC TO
                                                                        //SAVE MEMORY SO THAT IT CAN BE EXECUTED AUTOMATICALLY 
                                                                        //EVERYTIME WHEN DISPLAY FUNCTION IS CALLED
        StaticExample1 s2 = new StaticExample1 ( "Riad", 22111127);
        s1.displayInfo();
        s2.displayInfo();
           
    }
    
    
}
