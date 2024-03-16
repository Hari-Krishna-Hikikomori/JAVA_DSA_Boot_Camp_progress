package Trees;

public class post_traversal
{
    // this method used for remove a node
    // to achieve that use first secure the child Node
    // L -> R -> N
    // N - node.val
    // L - left.val
    // R - right.val
    post_traversal(node Node)
    {
        display(Node);
        System.out.println();
    }

    private void display(node Node)
    {
        if(Node == null)
        {
            return;
        }

        // will cover every node in the Tree
        display(Node.l);
        display(Node.r);

        // take a Node go left and right
        show(Node);
    }

    private void show(node Node)
    {
        // if both child is null it is point less to point to other node
        if(Node.r == null && Node.l == null)
        {
            return;
        }

        // there will be case any of child node will be null
        // to avoid a null pointer exception check each of them
        System.out.print("[ L");
        if(Node.l != null)
        {
            System.out.print("-"+Node.l.val);
        }
        System.out.print(",R");
        if(Node.r != null)
        {
            System.out.print("-"+Node.r.val);
        }

        System.out.print(",N-"+Node.val+" ]");
    }
}
