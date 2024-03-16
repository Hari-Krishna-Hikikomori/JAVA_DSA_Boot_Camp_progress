package Trees;

public class inOrder_traversal
{
    // this method used for get Sorted list in BST
    // L -> N -> R
    // N - node.val
    // L - left.val
    // R - right.val
    inOrder_traversal(node Node)
    {
        Diplay(Node);
        System.out.println();
    }
    private void Diplay(node Node)
    {
        if(Node == null)
        {
            return;
        }

        Diplay(Node.l);                  // Travers to the end on left side
        System.out.print(Node.val+",");  // end and Print
        Diplay(Node.r);                  // then rigth
    }
}
