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
        System.out.println("MK1_height - "+test.nodeHeight());


        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        AVL_MK2 test2 = new AVL_MK2(0);
        for (int i = 1; i < 1000; i++)
        {
            test2.insertion(i);
        }
        test2.Display();
        System.out.println("MK2_height - "+test2.nodeHeight());


    }
}
