package OOPS.Static;

public class STATIC
{
    public static int a = 5;
    int c = 10;
    public static int b;
    static                 // this method only run one time when the class start at first time
    {
        b = a*5;
    }
    public static void main(String[] args) {

    }
    static int population;// it will make that content to accessible thought out his assigned area
                          // basically set this as common thought out his assigned area
    public static void function() // static is like a function it can be usable without Object
                                  // only the assigned content
                                  // meaning whatever thing that stored in stack memory (variable, reference variable...etc)
    {
        System.out.println("static - "+ b);
    }
    public void put(int a)
    {
        STATIC.a = a;
        System.out.println("static - "+b);
    }

}
