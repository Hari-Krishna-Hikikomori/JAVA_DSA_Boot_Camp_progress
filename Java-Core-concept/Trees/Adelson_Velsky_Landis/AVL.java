package Trees.Adelson_Velsky_Landis;

import Trees.node;

public class AVL
{
    private class node {

        int val;
        int height;

        node l;
        node r;
        node(int val)
        {
            this.val = val;
        }

    }
    private node root ;
    AVL()
    {
        root = null;
    }

    AVL(int val)
    {
        root = new node(val);
    }
    public void insertion(int val)
    {
        root = insertion(root,val);
    }

    private node insertion(node tamp, int val)
    {
        if(tamp == null)
        {
            tamp = new node(val);
            return tamp;
        }

        if(tamp.val > val)
        {
            tamp.l = insertion(tamp.l,val);
        }else
        {
            tamp.r = insertion(tamp.r,val);
        }

        tamp.height = nodeHeight(tamp);
        tamp = isBalce(tamp);
        return tamp;
    }

    public int nodeHeight()
    {
        return this.root.height;
    }

    private int nodeHeight(node tamp)                     // return the height of the Node by calculate Left and Right plus one
    {
        if(tamp == null || tamp.r == null && tamp.l == null) return 0;

        int r = tamp.r == null ? 0 : tamp.r.height;
        int l = tamp.l == null ? 0 : tamp.l.height;

        return Math.max(r,l) + 1;
    }

    private node isBalce(node Node)
    {

            if(nodeHeight(Node.l) - nodeHeight(Node.r) > 1)         // left height is long then it will positive
            {
                if(nodeHeight(Node.l.l) - nodeHeight(Node.l.r) > 0)
                { // left left
                    return rightRotate(Node);
                }
                if(nodeHeight(Node.l.l) - nodeHeight(Node.l.r) < 0)
                {// left right
                    Node.l = leftRotate(Node.l);
                    return rightRotate(Node);
                }
            }

            if(nodeHeight(Node.l) - nodeHeight(Node.r) < -1)         // right height is long then it will negative
            {
                if(nodeHeight(Node.r.l) - nodeHeight(Node.r.r) < 0)
                { // rigth rigth
                    return leftRotate(Node);
                }if(nodeHeight(Node.r.l) - nodeHeight(Node.r.r) > 0)
                { // right left
                    Node.r = rightRotate(Node.r);
                    return leftRotate(Node);
                }
            }

        return Node;
    }


    private node leftRotate(node parent)
    {
        node child = parent.r;
        parent.r   = child.l;
        child.l = parent;

        parent.height = Math.max(nodeHeight(parent.l),nodeHeight(parent.r))+1;
        child.height = Math.max(nodeHeight(child.l),nodeHeight(child.r))+1;
        return child;
    }

    private node rightRotate(node parent)
    {
        node child = parent.l;
        parent.l   = child.r;
        child.r = parent;

        parent.height = Math.max(nodeHeight(parent.l),nodeHeight(parent.r))+1;
        child.height = Math.max(nodeHeight(child.l),nodeHeight(child.r))+1;

        return child;
    }

    private boolean isEmpty()
    {
        return root == null;
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

        Display(Node.r,level+1);

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
        Display(Node.l,level+1);
    }


}
