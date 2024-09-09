
package Abstraction;

public abstract class A3 {
    double dim1, dim2;
    
    A3(double dim1, double dim2){
    this.dim1 = dim1;
    this.dim2 = dim2;
    
}
 
    abstract void area ();
    
    public static void main(String[] args) {
        A3 ob1;
        ob1 = new Rectangle (10, 20);
        ob1.area();
        
        ob1= new triangle (10, 20);
        ob1.area();
        
        ob1 = new circle (10);
        ob1.area();
    
}
    
}

class Rectangle extends A3{
    //dim1,dim2
    Rectangle (double dim1, double dim2)
    { 
         super(dim1,dim2);
 
}
    @Override
         void area ()
        {  
            double result = dim1*dim2;
            System.out.println("Area of rectangle = " +result);
    
        }
    
}

class triangle extends A3{
    //dim1,dim2
    triangle (double dim1, double dim2)
    { 
         super(dim1,dim2);
 
}
    @Override
         void area ()
        {  
            double result = 0.5*dim1*dim2;
            System.out.println("Area of triangle = " +result);
    
        }
    
}


class circle extends A3{
    //dim1,dim2
    circle (double dim1)
    { 
         super(dim1,dim1);
 
}
    @Override
         void area ()
        {  
            double result = dim1*dim1;
            System.out.println("Area of triangle = " +result);
    
        }
    
}