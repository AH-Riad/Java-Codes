
/*                      VARIABLE LENGTH ARGUMENTS -> VARAGS METHOD
                A MRTHOD THAT TAKES A VARIABLE NUMBER OF ARGUMENTS IS CALLED A VARAGS METHOD
 
*/
package vid113To130;

public class B1VaragsMethod {
   /* void add (int a , int b)                           
    {
        System.out.println("Addition: " +(a+b));
          
    }
   */
    
    void add ( int ... num)
    {
        int sum  = 0;
        for( int x : num)             //For-Each Loop
        {
            sum = sum + x;
            
        }
        System.out.println("Addition result is : " +sum );
                
                
    }
    public static void main(String [] args)
    {
        B1VaragsMethod ob1 = new B1VaragsMethod();
        
        ob1.add(10, 20);
        ob1.add(10,20,30);
        ob1.add(20,30,50);
    }
    
    
    
}
