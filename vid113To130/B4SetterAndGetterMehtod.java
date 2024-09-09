
package vid113To130;

public class B4SetterAndGetterMehtod {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;                 // USING THIS OPERATOR TO ACCESS PRIVATE METHOD
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public static void main (String[] args)
    {
        B4SetterAndGetterMehtod ob1 = new B4SetterAndGetterMehtod();
        ob1.setName("Riad ");
        System.out.println(ob1.getName());
        ob1.setAge(22);
        System.out.println(ob1.getAge());
        
        
        
    }
    
    
}
