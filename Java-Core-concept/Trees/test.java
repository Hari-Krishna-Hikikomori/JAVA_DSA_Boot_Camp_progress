package Trees;

public class test
{
    public static void main(String[] args) {
        BST_mark1_and_selfBalc t = new BST_mark1_and_selfBalc(15);
        t.inSert(3);
        t.inSert(4);
        t.inSert(17);
        t.inSert(10);
        t.inSert(20);
        t.inSert(11);
        t.inSert(16);
        t.inSert(9);
        t.inSert(8);
        t.inSert(6);
        t.inSert(5);
        t.NiceDisplay();
        System.out.println();
        System.out.println("=======");

        BST_Mark2_selfBalc_clean test = new BST_Mark2_selfBalc_clean(15);
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

//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree(scanner);
//        tree.insertion();
//        tree.Display();

        new preOrder_traversal(test.getNode());
        new inOrder_traversal(test.getNode());
        new post_traversal(test.getNode());

    }
}
