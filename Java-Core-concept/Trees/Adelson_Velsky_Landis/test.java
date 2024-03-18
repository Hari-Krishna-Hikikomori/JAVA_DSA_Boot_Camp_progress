package Trees.Adelson_Velsky_Landis;

public class test
{
    public static void main(String[] args)
    {
        AVL test = new AVL(15);
        test.Display();
        System.out.println("=======");
        test.insertion(3);
        test.Display();
        System.out.println("=======");
        test.insertion(4);
        test.Display();
        System.out.println("=======");
        test.insertion(17);
        test.Display();
        System.out.println("=======");
        test.insertion(10);
        test.Display();
        System.out.println("=======");
        test.insertion(20);
        test.insertion(11);
        test.insertion(16);
        test.insertion(9);
        test.insertion(8);
        test.insertion(6);
        test.insertion(5);
        test.Display();
    }
}
