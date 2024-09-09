

    
    
    
package Static;


public class DiffStaticAndNonStatic2 {
    
    static int  count = 0;              //MAKING COUNT STATIC TO COUNT TOTALL NUMBER 
    
   
  /*  DiffStaticAndNonStatic2()  
            {
                count ++;
                
                
            }
    
    */
    void displayCount()
    {
        
        System.out.println ( "Total student = " +count);
        count ++;
    }
    
 public static void main ( String[] args )
 {
     DiffStaticAndNonStatic2 s1 = new DiffStaticAndNonStatic2();    
     s1.displayCount();
     DiffStaticAndNonStatic2 s2 = new DiffStaticAndNonStatic2();
     s2.displayCount();
     DiffStaticAndNonStatic2 s3 = new DiffStaticAndNonStatic2();
     s3.displayCount();
   
 }
    
}

   