package Trees;

import java.util.ArrayList;

public class BST_Mark2_selfBalc_clean
{





    private node root = null;
    BST_Mark2_selfBalc_clean()
    {

    }

    public BST_Mark2_selfBalc_clean(int val)
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

        if(!isBalanced())
        {
            selfBalc(root);
        }
    }

    public node head()
    {
        return root;
    }
    private void selfBalc(node root)
    {
        ArrayList<Integer> list = inOrder(new ArrayList<Integer>(),root);

        this.root = balancedTree(list,new node(0),0,list.size()-1);
    }

    private node balancedTree(ArrayList<Integer> list, node Node,int s ,int e)
    {
        if(s > e)
        {
            return null;
        }
        if(s == e)
        {
            return new node(list.get(e));
        }

        int m = e-(e-s)/2 ;
        Node = new node(list.get(m));

        Node.l = balancedTree(list,Node,s,m-1);
        Node.r = balancedTree(list,Node,m+1,e);

        Node.height = height(Node);

        return Node;
    }

    private int height(node Node)
    {
        int left  = Node.l == null ? 0 : Node.l.height;
        int right = Node.r == null ? 0 : Node.r.height;

        return Math.max(left,right)+1;
    }


    private ArrayList<Integer> inOrder(ArrayList<Integer> list, node Node)
    {
        if(Node == null)
        {
            return list;
        }

        list = inOrder(list,Node.l);
        list.add(Node.val);
        list = inOrder(list,Node.r);

        return list;
    }

    private boolean isBalanced()
    {
        if(isEmpty())
        {
            return true;
        }
        int left  = root.l == null ? -1 : root.l.height;
        int right = root.r == null ? -1 : root.r.height;

        return Math.abs(left-right) <= 1;
    }

    private node insertion(node Node, int val)
    {
        if(Node == null)
        {
            Node = new node(val);
            return Node;
        }

        if(Node.val > val)
        {
           Node.l = insertion(Node.l,val);
        }
        else
        {
            Node.r = insertion(Node.r,val);
        }

        Node.height = height(Node);

        return Node;
    }

    private boolean isEmpty()
    {
        return root == null;
    }

    public void Display()
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

    public node getNode()
    {
        return root;
    }
}
