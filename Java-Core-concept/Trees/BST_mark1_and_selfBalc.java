package Trees;

import java.util.ArrayList;

public class BST_mark1_and_selfBalc
{
    private class bNode
    {
        int val;
        bNode right;
        bNode left;
        int lefthieght;
        int rightheight;
    }

    int balc;
    bNode root = null;

    BST_mark1_and_selfBalc(int val)
    {
        root = new bNode();
        root.val = val;
        root.lefthieght = 0;
        root.rightheight= 0;
    }


    public void inSert(int val)
    {
        if(root == null)
        {
            new BST_mark1_and_selfBalc(val);
            return;
        }

        BalcInsetion(root,val,0,0);
    }

    private void BalcInsetion(bNode node, int val,int height,int side)
    {

        if(node.val > val)
        {
            if(root == node)
            {
                height++;
                side--;
            }
            if(node.left == null)
            {

                node.left = new bNode();
                node.left.val = val;

                if(side == -1)
                {
                    root.lefthieght = Math.max(height, root.lefthieght);
                    if(height > root.rightheight+1)
                    {
                        Balc(root,val);
                    }
                }
                else
                {
                    root.rightheight = Math.max(height, root.rightheight);
                    if(height > root.lefthieght+1)
                    {
                        Balc(root,val);
                    }
                }

            }else
            {
                BalcInsetion(node.left,val,height+1,side);
            }
        }
        else
        {
            if(root == node)
            {
                height++;
                side++;
            }
            if(node.right == null)
            {
                node.right = new bNode();
                node.right.val = val;

                if(side == -1)
                {
                    root.lefthieght = Math.max(height, root.lefthieght);
                    if(height > root.rightheight+1)
                    {
                        Balc(root,val);
                    }
                }
                else
                {
                    root.rightheight = Math.max(height, root.rightheight);
                    if(height > root.lefthieght+1)
                    {
                        Balc(root,val);
                    }
                }

            }else
            {
                BalcInsetion(node.right,val,height+1,side);
            }
        }
    }

    private void Balc(bNode root, int val)
    {
        ArrayList<Integer> list = arrysSet(root,new ArrayList<>());
        root.rightheight = -1;
        root.lefthieght = -1;
        root = Noderecr(root,list,0,list.size()-1);
    }

    private bNode Noderecr(bNode tamp, ArrayList<Integer> list,int s, int e)
    {
        if(s > e)
        {
            return null;
        }
        if(s == e)
        {
            tamp = new bNode();
            tamp.val = list.get(e);
            return tamp;
        }

        int m = e -(e-s)/2-1;
        tamp.left = new bNode();
        tamp.right = new bNode();
        root.lefthieght++;
        root.rightheight++;
        tamp.val = list.get(m);

        tamp.left  = Noderecr(tamp.left,list,s,m-1);
        tamp.right = Noderecr(tamp.right,list,m+1,e);

        return tamp;
    }

    private ArrayList<Integer> arrysSet(bNode root,ArrayList<Integer> list)
    {
        if(root == null)
        {
            return list;
        }
        list = arrysSet(root.left,list);
        list.add(root.val);
        list = arrysSet(root.right,list);

        return list;
    }
    public void NiceDisplay()
    {
        if(root == null)
        {
            return;
        }

        recurNiceprint(root,0);
    }

    private void recurNiceprint(bNode head, int level)
    {
        if(head == null)
        {
            return;
        }
        recurNiceprint(head.right,level+1);

        if(level != 0)
        {
            for (int i = 0; i < level-1; i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+head.val);
        }else
        {
            System.out.println(head.val);
        }
        recurNiceprint(head.left,level+1);

    }
}
