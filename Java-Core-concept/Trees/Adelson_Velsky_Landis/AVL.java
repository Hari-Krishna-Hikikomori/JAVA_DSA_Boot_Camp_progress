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
        int r = Node.r == null ? 0 : Node.r.height;
        int l = Node.l == null ? 0 : Node.l.height;

        if(Math.abs(r - l) > 1)
        {

            if(rotateChcek(Node))  // left height is long
            {
                if(Node.l != null) {
                    if (rotateChcek(Node.l))               // left side height long rotate Right
                    {
                        Node = rightRotate(Node);

                    } else {                                      // Right side height long rotate left
                        Node.l = leftRotate(Node.l);
                        if (rotateChcek(Node)) {
                            Node = rightRotate(Node);
                        }
                    }
                }else
                {
                    Node = rightRotate(Node);
                }
            }
            else            // right side height is long
            {
                if(Node.r != null) {
                    if (rotateChcek(Node.r))                 // left side height long rotate Right
                    {
                        Node = rightRotate(Node.r);

                        if (Node.l.height < Node.r.height) {
                            Node = leftRotate(Node);
                        }
                    } else                                   // Right side height long rotate left
                    {
                        Node = leftRotate(Node);

                    }
                }else
                {
                    Node = leftRotate(Node);
                }
            }

        }

        Node.height = nodeHeight(Node);
        return Node;
    }

    private boolean rotateChcek(node Nodee)
    {
        int r = Nodee.r == null ? 0 : Nodee.r.height;
        int l = Nodee.l == null ? 0 : Nodee.l.height;

        return l > r;
    }

    private node leftRotate(node parent)
    {
        node rightChild = parent.r;
        if(parent.l != null)
        {
            if(rightChild.l != null)
            {
                parent.height = Math.max(rightChild.l.height,parent.l.height)+1;
                parent.r = rightChild.l;
            }
            else
            {
                parent.height = parent.l.height + 1;
                parent.r = null;
            }
            rightChild.l = parent;
        }
        else
        {
            if(rightChild.l != null)
            {
                parent.height = rightChild.l.height + 1;
                parent.r = rightChild.l;
            }
            else
            {
                parent.height = 0;
                parent.r = null;
            }
            rightChild.l = parent;
        }

        return  rightChild;
    }

    private node rightRotate(node parent)
    {
        node leftCHild = parent.l;
        if(parent.r != null)
        {
            if(leftCHild.r != null)
            {
                parent.height = Math.max(leftCHild.r.height,parent.r.height)+1;
                parent.l = leftCHild.r;
            }
            else
            {
                parent.height = parent.r.height + 1;
                parent.l = null;
            }
            leftCHild.r = parent;
        }
        else
        {
            if(leftCHild.r != null)
            {
                parent.height = leftCHild.r.height + 1;
                parent.l = leftCHild.r;
            }
            else
            {
                parent.height = 0;
                parent.l = null;
            }
            leftCHild.r = parent;
        }

        return  leftCHild;
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
