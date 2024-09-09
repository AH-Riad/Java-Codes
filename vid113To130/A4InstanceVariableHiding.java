


package vid113To130;

public class A4InstanceVariableHiding {
    
    double height, width, depth;                              //instance variable
    
    A4InstanceVariableHiding(double height, double width, double depth)
    {
        this.height = height;   //IF WE WANT TO USE THE SAME NAME THAT HAS BEEN USED AS PARAMETER
        this.width = width;     //WE HAVE TO USE THIS KEYWORAD
        this.depth = depth;      
    }
    void displayVol()
    {
        double vol = height*width*depth;
        System.out.println ("VOLUME IS :" + vol);
    }
    public static void main (String[] args)
    {
        A4InstanceVariableHiding box1 = new A4InstanceVariableHiding(10,10,10);
        box1.displayVol();
        A4InstanceVariableHiding box2 = new A4InstanceVariableHiding(20,30,10);
        box2.displayVol();
        
    }
        
}