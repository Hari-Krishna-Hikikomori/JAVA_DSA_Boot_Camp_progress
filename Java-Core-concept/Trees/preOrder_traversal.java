package Trees;

public class preOrder_traversal
{
    // this method used serialized base output
    // N -> L -> R
    // N - node.val
    // L - left.val
    // R - right.val
    preOrder_traversal(node node)
    {
        Display(node);
        System.out.println();
    }

    private void Display(node node)
    {
        if(node==null)
        {
            return;
        }
        // First print
        System.out.print(node.val+",");
        Display(node.l);// then go till end and print
        Display(node.r);// then go right and repeat the process left side process
    }
}
