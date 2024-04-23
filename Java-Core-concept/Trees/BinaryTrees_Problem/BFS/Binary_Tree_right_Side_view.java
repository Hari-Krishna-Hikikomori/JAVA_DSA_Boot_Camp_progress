package Trees.BinaryTrees_Problem.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_right_Side_view
{

    // leet code test;
    // solution 01 - BFS(queues) and helper recursive class  -- run time is 1ms
    // solution 02 - without BFS use only level int as view point -- run time is 0ms
    class Solution_01 {
        public List<Integer> rightSideView(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<>();
            }

            Queue<TreeNode> q = new LinkedList<>();
            List<Integer> arr = new ArrayList<>();
            q.add(root);
            arr.add(root.val);

            return rightSideView(q,arr);
        }

        private List<Integer> rightSideView(Queue<TreeNode> q, List<Integer> arr)
        {
            if(q.isEmpty())
            {
                return arr;
            }

            addRight(q,arr);

            return rightSideView(q,arr);
        }

        private void addRight(Queue<TreeNode> q, List<Integer> arr)
        {
            int lim = q.size();

            for (int i = 0; i < lim - 1; i++)
            {
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

            if(q.peek().left != null)
            {
                q.add(q.peek().left);
            }
            if(q.peek().right != null)
            {
                q.add(q.peek().right);
            }
            arr.add(q.remove().val);
        }
    }
    class Solution_02 {
        public List<Integer> rightSideView(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }


            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);

            rightSideView(root, arr,0,0);
            return arr;
        }

        private int rightSideView(TreeNode root, List<Integer> arr,int level,int right)
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
            if(root.right != null)
            {
                level = rightSideView(root.right,arr,level,right+1);
            }

            if(root.left != null) level = rightSideView(root.left,arr,level,right+1);

            return level;
        }
    }
}
