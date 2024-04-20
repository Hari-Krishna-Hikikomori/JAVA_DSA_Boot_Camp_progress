package Trees.BinaryTrees_Problem.BFS;

import Trees.BST_Mark2_selfBalc_clean;
import Trees.node;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class test
{
    public static void main(String[] args)
    {
        System.out.println(0 % 2);
        BST_Mark2_selfBalc_clean bs = new BST_Mark2_selfBalc_clean(1);

        for (int i = 2; i <=15; i++)
        {
           bs.insertion(i);
        }

        bs.Display();
        node head = bs.head();

        System.out.println();
        System.out.println(SuccessorOfnode_test(head,8));

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
