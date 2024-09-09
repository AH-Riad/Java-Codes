
package Static;


public class DiffStaticAndNonStatic1 {
    
    int count = 0;                      //COUNT IS NON STATIC HERE
    DiffStaticAndNonStatic1()
            {
                count ++;
                
                
            }

    void displayCount()
    {   
        System.out.println ( "Total student = " +count);
    }
    
 public static void main ( String[] args )
 {
     DiffStaticAndNonStatic1 s1 = new DiffStaticAndNonStatic1();     //DEFAULT CONSTRUCTOR IS BBING CALLED AUTOMATICALLY
     s1.displayCount();
     DiffStaticAndNonStatic1 s2 = new DiffStaticAndNonStatic1();     //DEFAULT CONSTRUCTOR IS BBING CALLED AUTOMATICALLY
     s2.displayCount();
     DiffStaticAndNonStatic1 s3 = new DiffStaticAndNonStatic1();     //DEFAULT CONSTRUCTOR IS BBING CALLED AUTOMATICALLY
     s3.displayCount();
   
 }
    
}
