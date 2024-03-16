import java.util.ArrayList;

class Cat {
    private String name;
    private int age;
    
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}
public class arrayslist{ 
public static void main(String []args) {
    ArrayList<Cat> cats = new ArrayList<>();
    

   System.out.println(cats.add(new Cat("Dog", 12)));
   Cat dog = cats.get(0);
   System.out.println(dog.getAge()+dog.getName());


}   
}
