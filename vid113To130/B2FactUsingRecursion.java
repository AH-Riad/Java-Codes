
package vid113To130;
    class B2FactUsingRecursion {
    int fact(int n)
    {
        if (n==1)                   //BASE CASE
            return 1;
        else
            return n*fact(n-1);
        
    }
    public static void main(String [] args)
    {
        B2FactUsingRecursion ob1 = new B2FactUsingRecursion();
        int result =ob1.fact(5);
        
        System.out.println("result =" +result);
        
    }
    
}
