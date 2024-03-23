package Trees.Segment_Tree;

import Trees.Adelson_Velsky_Landis.AVL_MK2;

public class Segment_MK1
{
    private class Node
    {
        int val;

        int start;
        int end;

        Node left ;
        Node right;
        Node(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
        Node(int val,int start,int end)
        {
            this.val = val;
            this.start = start;
            this.end = end;
        }
        Node(int val)
        {
            this.val = val;
        }
        Node()
        {

        }
    }



    private Node root;

    Segment_MK1(){root = null;}
    Segment_MK1(int[] arr)
    {
        root = ConstractTree(arr,0,arr.length-1);
    }

    private Node ConstractTree(int[] arr, int s, int e)
    {

        if(s == e)
        {
            return new Node(arr[s],s,e);
        }
        Node tamp = new Node(s,e);
        int m = (s + e) / 2;
        tamp.left = ConstractTree(arr,s,m);
        tamp.right = ConstractTree(arr,m+1,e);

        tamp.val = addNodevalue(tamp);
        return tamp;
    }

    public int sumofRange(int start , int end)
    {
        return sumofRange(start , end , root);
    }

    private int sumofRange(int start, int end, Node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(start <= root.start && end >= root.end)
        {
            return root.val;
        }

        return sumofRange(start,end,root.left) + sumofRange(start,end,root.right);
    }

    public void Display() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    private int addNodevalue(Node node)
    {
        return node.left.val + node.right.val;
    }

    public void updateTrees(int data, int index)
    {
//        updateTrees(root,data,index);
        System.out.println(updateTrees_MK2(root,data,index));
    }

    private void updateTrees(Node root, int data, int index)
    {
        if(root == null)
        {
            return;
        }
        if(root.start == index && root.end == index)
        {
            root.val = data;
            return;
        }

        int m = (root.start + root.end) / 2;

        if(index <= m)
        {
            updateTrees(root.left,data,index);

        }else if(index >= m+1)
        {
            updateTrees(root.right,data,index);
        }
        root.val = root.left.val + root.right.val;

    }

    private int updateTrees_MK2(Node root, int data, int index)
    {
        if(index >= root.start && index <= root.end)
        {
            if(root.start == index && root.end == index)
            {
                root.val = data;
                return root.val;
            }else
            {
                root.val = updateTrees_MK2(root.left,data,index) + updateTrees_MK2(root.right,data,index);
                return root.val;
            }
        }

        return root.val;
    }

}
