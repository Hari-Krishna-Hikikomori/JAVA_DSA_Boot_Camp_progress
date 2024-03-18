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
    private node root = null;
    AVL()
    {

    }

    AVL(int val)
    {
        root = new node(val);
    }
    public void insertion(int val)
    {
        if(isEmpty())
        {
            root = new node(val);
            return;
        }

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

        tamp = isBalce(tamp);
        tamp.height = nodeHeight(tamp);

        return tamp;
    }

    private int nodeHeight(node tamp)
    {
        if(tamp.r == null && tamp.l == null) return 0;

        int r = tamp.r == null ? 0 : tamp.r.height;
        int l = tamp.l == null ? 0 : tamp.l.height;

        return Math.max(r,l) + 1;
    }

    private node isBalce(node Node)
    {
        if(Node.r == null && Node.l == null)
        {
            return Node;
        }


        if(Math.abs(Node.l.height - Node.r.height) <= 1)
        {
            node tamp;
            if(Node.l.height > Node.r.height)
            {
                tamp = rightRotate(Node);
            }
            else
            {
                tamp = leftRotate(Node);
            }
            return tamp;
        }

        return Node;
    }

    private node leftRotate(node parent)
    {
        node child = parent.r;
        node GChild = child.l;
        parent.height = Math.max(GChild.height,parent.height)+1;
        child.height  = Math.max(child.r.height,parent.height)+1;
        parent.r = GChild;
        child.l = parent;

        return child;
    }

    private node rightRotate(node parent)
    {
        node child = parent.l;
        node GChild = child.r;
        parent.height = Math.max(GChild.height,parent.height)+1;
        child.height  = Math.max(child.l.height,parent.height)+1;
        parent.l = GChild;
        child.r = parent;

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
