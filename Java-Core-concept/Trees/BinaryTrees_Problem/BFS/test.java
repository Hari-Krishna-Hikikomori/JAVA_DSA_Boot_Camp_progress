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
        BST_Mark2_selfBalc_clean bs = new BST_Mark2_selfBalc_clean(1);

        for (int i = 2; i <=15; i++)
        {
           bs.insertion(i);
        }

        bs.Display();
        node head = bs.head();

        BFS_test(head);
    }

    private static void BFS_test(node head)
    {
        Queue<node> q = new LinkedList<>();
        q.add(head);

        recur(q);
    }

        private static void recur(Queue<node> q)
        {
            if(q.isEmpty())
            {
                return;
            }

            node tamp = q.remove();
            if(tamp.l != null)
            {
                q.add(tamp.l);
            }
            if(tamp.r != null)
            {
                q.add(tamp.r);
            }

            System.out.print(tamp.val+", ");

            recur(q);
        }
}
