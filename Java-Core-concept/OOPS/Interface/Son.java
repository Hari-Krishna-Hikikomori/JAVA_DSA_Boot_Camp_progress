package OOPS.Interface;

public class Son implements Parent ,Parent_copy{

    void Graduvation()
    {
        System.out.println(Parent.graduation);    // can use static variables in implemented class but value always same in Parent class
    }
    @Override
    public void Career() {                         // public access modifier will allow
        System.out.println("I want to be Good man");
    }

    @Override
    public void Partner() {                         // public access modifier will allow
        System.out.println("I wanna married some who loves me like I am a King");
    }
    static void Life()                              // public access modifier will allow
    {
        System.out.println("live life without any Debit");
    }
}
