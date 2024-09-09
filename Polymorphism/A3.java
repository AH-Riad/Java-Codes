
package Polymorphism;


public class A3 {
    void Area()
    {
        System.out.println("Area of shape :");
    }
    
    public static void main(String[] args) {
        
        A3 s1 = new A3();
        s1.Area();
        s1 = new rectangle(10,20);
        s1.Area();
        s1 = new triangle(10,20);
        s1.Area();
        
        
        
    }
    
}
class triangle extends A3
{
    double base, height;
    triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    
    @Override
    void Area()
    {
        System.out.println("Area of triangle :" +(0.5*base*height));
    }
    
}

class rectangle extends A3
{
    double length, width;
    rectangle(double height, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    @Override
    void Area()
    {
        System.out.println("Area of rectangle :" +(length*width));
    }
    
}

