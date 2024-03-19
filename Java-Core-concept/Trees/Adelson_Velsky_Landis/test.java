package Trees.Adelson_Velsky_Landis;

public class test
{
    public static void main(String[] args)
    {
        AVL test = new AVL(0);
        for (int i = 1; i < 1000; i++)
        {
            test.insertion(i);
        }
        test.Display();
//        System.out.println("=======");
//        test.insertion(3);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(4);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(17);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(10);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(20);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(11);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(16);
//        test.Display();
//        System.out.println("=======");
//        test.insertion(9);
//        test.insertion(8);
//        test.insertion(6);
//        test.insertion(5);
        test.Display();
    }
}
