package Trees.BinaryTrees_Problem.BFS;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class symmetricTree
{
    class Solution {
        public boolean isSymmetric(TreeNode root)
        {
            if(root == null)
            {
                return true;
            }
            Queue<TreeNode> q = new LinkedList<>();

            if(root.left != null)
            {
                q.add(root.left);
            }
            if(root.right != null)
            {
                q.add(root.right);
            }

            return isSymmetric(q);
        }

        private boolean isSymmetric(Queue<TreeNode> q)
        {
            if(q.isEmpty())
            {
                return true;
            }

            Deque<TreeNode> tamp = new LinkedList<>();

            int lim = q.size();

            if(lim % 2 != 0)
            {
                return false;
            }
            for (int i = 0; i < lim / 2 ; i++)
            {
                if( q.peek() == null)
                {
                    tamp.addFirst(q.remove());
                }else{
                    if(q.peek().left != null)
                    {
                        q.add(q.peek().left);
                    }
                    else q.add(null);

                    if(q.peek().right != null)
                    {
                        q.add(q.peek().right);
                    }else q.add(null);

                    tamp.addFirst(q.remove());
                }
            }

            for (int i = lim / 2; i < lim; i++)
            {

                if(q.peek() == null && tamp.peek() == null)
                {
                    q.remove();
                    tamp.remove();
                }else{
                    if(q.peek() == null || tamp.peek() == null|| q.peek().val != tamp.remove().val)
                    {
                        return false;
                    }
                    if(q.peek().left != null)
                    {
                        q.add(q.peek().left);
                    }else q.add(null);

                    if(q.peek().right != null)
                    {
                        q.add(q.peek().right);
                    }else q.add(null);

                    q.remove();}
            }

            return isSymmetric(q);
        }
    }
}
