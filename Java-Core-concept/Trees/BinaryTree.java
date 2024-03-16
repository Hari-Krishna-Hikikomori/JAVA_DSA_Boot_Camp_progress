package Trees;


import java.util.Scanner;

public class BinaryTree
{
    private class node
    {
        int val;
        node left = null;
        node right = null;
        node()
        {}
        node(int val)
        {
            this.val = val;
        }
    }
    node root;

    BinaryTree(int val)
    {
        root = new node(val);
    }
    BinaryTree(Scanner scanner)
    {
        System.out.println("Enter Root value");
        int val = scanner.nextInt();
        root = new node(val);
        insertion();
    }

     void insertion()
    {
        System.out.println("Do you insert Left '1' or Right '2' ");
        System.out.println("To Stop '0'");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        if(action != 0) {
            insertion(root,action);
        }
    }

    private void insertion(node root, int action)
    {
        if(action != 0)
        {
        System.out.println("enter the value for");
        if(action == 1)
        {
            System.out.println(root.val+"-Left");
            Scanner scanner = new Scanner(System.in);
            root.left = new node(scanner.nextInt());
            root = root.left;
        }
        if(action == 2)
        {
            System.out.println(root.val+"-Right");
            Scanner scanner = new Scanner(System.in);
            root.right = new node(scanner.nextInt());
            root = root.right;
        }
            System.out.println("Do you insert Left '1' or Right '2' ");
            System.out.println("To Stop '0'");
            Scanner scanner = new Scanner(System.in);
            insertion(root,scanner.nextInt());
        }

    }
    void Display()
    {
        Display(root,0);
    }
    private void Display(node Node, int level)
    {
        if(Node == null)
        {
            return;
        }

        Display(Node.right,level+1);

        if(level != 0)
        {
            for (int i = 0; i < level-1; i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("-------->"+Node.val);
        }
        else
        {
            System.out.println(Node.val);
        }
        Display(Node.left,level+1);
    }
}
