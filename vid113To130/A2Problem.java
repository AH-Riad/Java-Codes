/*
   CREAT A CLASS CALLED BOX THAT INLCUDED 3 PIECES OF INFORMATION AS INSTANCE VARIABLES- HEIGHT,WIDTH AND DEPTH(TYPE DOUBLE)
OF TWO BOXES. YOUR CLASS SHOULD HAVE A CONSTRUCTOR AND INITIALIZES THE THREE INSTANCE VARIABLES. PROVIDE A METHOD DISPLAYVOL 
THAT DISPLAY THE VOLUME OF TWO BOXES. SUPPOSE, THE VALUES OF INSTANCE VARIABLES FOR THE FIRST BOX'S ARE (10,10,10) AND SECOND 
BOX'S ARE (20,30,100).
*/
package vid113To130;
//LET'S ASSUME OUR CLASS NAME AS BOX

public class A2Problem {
    double height, width, depth;
    
    A2Problem(double h, double w, double d)
    {
        height = h;
        width = w;
        depth = d;      
    }
    void displayVol()
    {
        double vol = height*width*depth;
        System.out.println ("VOLUME IS :" + vol);
    }
    public static void main (String[] args)
    {
        A2Problem box1 = new A2Problem(10,10,10);
        box1.displayVol();
        A2Problem box2 = new A2Problem(20,30,10);
        box2.displayVol();

        
    }
    
    
}
