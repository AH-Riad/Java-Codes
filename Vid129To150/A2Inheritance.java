package Vid129To150;

public class A2Inheritance {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName ("Riad");
        s1.setAge(22);
        s1.setQualification("Bsc in Cse");
        
        //System.out.println("Name :"+s1.getName());
        //System.out.println("Age :"+s1.getAge());
        //System.out.println("Qualification :"+s1.getQualification());
        s1.displayInfo3();
    }
   
    
}
class Students extends A2Inheritance{
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    void displayInfo3(){
          System.out.println ("Name :"+getName());
          System.out.println ("Age :"+getAge());
          System.out.println ("Qualification :"+getQualification());
  
    }
           
            
            
            
    
    
}
