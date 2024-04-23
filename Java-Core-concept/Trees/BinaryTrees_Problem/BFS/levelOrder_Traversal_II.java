package Trees.BinaryTrees_Problem.BFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder_Traversal_II
{

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<>();
            }

            List<List<Integer>> arr = new ArrayList<>();

            return levelOrderBottom(root,arr,0);
        }

        private List<List<Integer>> levelOrderBottom(TreeNode node, List<List<Integer>> arr, int level)
        {
            if(node == null)
            {
                return arr;
            }

            if(level == arr.size())
            {
                arr.addFirst(new ArrayList<>());
                arr.getFirst().add(node.val);
            }else
            {
                arr.get(arr.size() - level).add(node.val);
            }

            levelOrderBottom(node.left,arr,level+1);
            levelOrderBottom(node.right,arr,level+1);

            return arr;
        }
    }
    class Solution_01 {
        public List<List<Integer>> levelOrderBottom(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<>();
            }

            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> arr = new ArrayList<>();
            q.add(root);
            return levelOrderBottom(q,arr);
        }

        private List<List<Integer>> levelOrderBottom(Queue<TreeNode> q, List<List<Integer>> arr)
        {
            while (!q.isEmpty())
            {
                arr.addFirst(new ArrayList<>());
                int lim = q.size();
                for (int i = 0; i < lim; i++)
                {
                    arr.get(0).add(q.peek().val);

                    if(q.peek().left != null)
                    {
                        q.add(q.peek().left);
                    }
                    if(q.peek().right != null)
                    {
                        q.add(q.peek().right);
                    }

                    q.remove();
                }
            }

            return arr;
        }
    }
}
