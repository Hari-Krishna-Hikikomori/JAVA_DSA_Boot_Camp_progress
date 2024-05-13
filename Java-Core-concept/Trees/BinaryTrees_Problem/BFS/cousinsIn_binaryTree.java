package Trees.BinaryTrees_Problem.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class cousinsIn_binaryTree
{

    // Solution_01  -  with BFS - run time is 0 ms - memory is 40.80 MB
    // SOlution_02  - with recursive and three helper class - run time is 0ms - memory is 41.04 MB
    class Solution_01_mine {
        public boolean isCousins(TreeNode root, int x, int y)
        {
            if(root == null)
            {
                return false;
            }

            if(root.val == x || root.val == y)
            {
                return false;
            }

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty())
            {
                int lim = q.size();
                TreeNode left_tamp = null;
                TreeNode right_tamp = null;
                for (int i = 0; i <lim; i++)
                {
                    if(q.peek().left != null)
                    {
                        if(q.peek().left.val == x)
                        {
                            left_tamp = q.peek();
                        }
                        if(q.peek().left.val == y)
                        {
                            right_tamp = q.peek();
                        }
                        q.add(q.peek().left);
                    }

                    if(q.peek().right != null)
                    {
                        if (q.peek().right.val == x)
                        {
                            left_tamp = q.peek();
                        }

                        if(q.peek().right.val == y )
                        {
                            right_tamp = q.peek();
                        }
                        q.add(q.peek().right);
                    }


                    q.remove();
                }
                if(left_tamp != null && right_tamp == null || left_tamp == null && right_tamp != null )
                {
                    return false;
                }

                if(left_tamp != right_tamp)
                {
                    return true;
                }
            }

            return false;
        }
    }

    class Solution_02_kunal {
        public boolean isCousins(TreeNode root, int x, int y)
        {
            if(root == null)
            {
                return false;
            }
            TreeNode x_node = findNode(root,x);
            TreeNode y_node = findNode(root,y);

            return ((isNotsibling(root,x_node,y_node)) && (level(root,x_node,0) == level(root,y_node,0)));
        }

        private int level(TreeNode root, TreeNode Node, int i)
        {
            if(root == null)
            {
                return 0;
            }

            if(root == Node)
            {
                return i;
            }

            return Math.max(level(root.left,Node,i+1),level(root.right,Node,i+1));
        }

        private boolean isNotsibling(TreeNode root, TreeNode xNode, TreeNode yNode)
        {
            if(root == null)
            {
                return true;
            }
            if(root.left == xNode && root.right == yNode || root.left == yNode && root.right == xNode)
            {
                return false;
            }

            return (isNotsibling(root.left,xNode,yNode) && isNotsibling(root.right,xNode,yNode));
        }

        private TreeNode findNode(TreeNode root, int val)
        {
            if(root == null)
            {
                return null;
            }
            if(root.val == val)
            {
                return root;
            }
            TreeNode tamp = findNode(root.left,val);

            return tamp == null ? findNode(root.right,val) : tamp;
        }
    }
}
