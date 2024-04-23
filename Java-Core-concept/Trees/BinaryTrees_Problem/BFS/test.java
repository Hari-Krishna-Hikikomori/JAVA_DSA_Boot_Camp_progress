package Trees.BinaryTrees_Problem.BFS;

import Trees.BST_Mark2_selfBalc_clean;
import Trees.node;

import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        BST_Mark2_selfBalc_clean bs = new BST_Mark2_selfBalc_clean(5);


        bs.insertion(6);
        bs.insertion(4);
        bs.insertion(3);

        test t = new test();

        List<Integer> arr = t.rightSideView(bs.head());
        bs.Display();

        System.out.println(arr);

    }

        public List<Integer> rightSideView(node root) {
            if (root == null) {
                return new ArrayList<>();
            }


            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);

            rightSideView(root, arr,0,0);
            return arr;
        }

        private int rightSideView(node root, List<Integer> arr,int level,int right)
        {
            if(root == null)
            {
                return level;
            }
            if(right > level)
            {
                arr.add(root.val);
                ++level;
            }
            if(root.r != null)
            {
                level = rightSideView(root.r,arr,level,right+1);
            }

            return rightSideView(root.l,arr,level,right+1);
        }


    private static int SuccessorOfnode_test(node head,int find)
    {
        if(head == null)
        {
            return -1;
        }

        Queue<node> q = new LinkedList<>();
        q.add(head);

        return SuccessorOfnode_test(find,q);
    }

    private static int SuccessorOfnode_test(int find, Queue<node> q)
    {
        if(!q.isEmpty() && q.peek().val == find)
        {
            if(q.peek().l != null)
            {
                q.add(q.peek().l);
            }
            q.remove();
            return q.isEmpty() ? -1 : q.remove().val;
        }

        if(q.peek().l != null)
        {
            q.add(q.peek().l);
        }

        if(q.peek().r != null)
        {
            q.add(q.peek().r);
        }

        q.remove();

        return SuccessorOfnode_test(find,q);
    }


}
