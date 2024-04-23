package Trees.BinaryTrees_Problem.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal
{

    class Solution_2   // without Queues and compile time is 0ms in leet code
    {
        public List<List<Integer>> levelOrder(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<>();
            }

            List<List<Integer>> ans = new ArrayList<>();
            return levelOrder(root,0,ans);
        }

        private List<List<Integer>> levelOrder(TreeNode node, int level, List<List<Integer>> ans)
        {
            if(node == null)
            {
                return ans;
            }

            if(ans.size() == level) ans.add(new ArrayList<>());

            ans.get(level).add(node.val);

            levelOrder(node.left,level+1,ans);
            levelOrder(node.right,level+1,ans);

            return ans;
        }
    }
    class Solution {

        public List<List<Integer>> levelOrder(TreeNode root)
        {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            List<List<Integer>> list = new ArrayList<>();

            return levelOrder(list,q);
        }

        private List<List<Integer>> levelOrder( List<List<Integer>> arr, Queue<TreeNode> q)
        {
            if(q.isEmpty())
            {
                return arr;
            }

            arr.add(levelValue(q));
            return arr;
        }

        private List<Integer> levelValue(Queue<TreeNode> q)
        {
            List<Integer> tamp = new ArrayList<>();
            int lim = q.size();
            for (int i = 0; i < lim; i++)
            {
                if(q.peek().left != null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right != null)
                {
                    q.add(q.peek().right);
                }
                tamp.add(q.remove().val);
            }

            return tamp;
        }

    }
}
