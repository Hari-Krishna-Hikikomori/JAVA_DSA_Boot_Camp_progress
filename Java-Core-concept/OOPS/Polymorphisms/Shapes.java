package OOPS.Polymorphisms;

public class Shapes {

    int length;
    int width;
    int radius;
    void shape(int length,String side)       // load same name is know as Overload
    {
        if(side.trim().equals("noside"))
        {
            System.out.println("Circle");
        }
        if(side.trim().equals("fourside"))
        {
            System.out.println("Square");
        }
    }
    void shape(int length, int Wight)
    {
        System.out.println("Rectangle");
    }

}
