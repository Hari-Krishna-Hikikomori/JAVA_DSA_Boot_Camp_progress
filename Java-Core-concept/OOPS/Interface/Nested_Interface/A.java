package OOPS.Interface.Nested_Interface;

public class A {
    int num;
    public interface nest                 //Nested interFace inside a class Interface is allowed
    {
        void Greeting();
    }

    void Greeting()
    {
        System.out.println("hello");
    }
}
