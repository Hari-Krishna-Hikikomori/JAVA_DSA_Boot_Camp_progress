package Trees.BinaryTrees_Problem.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_levels_in_Binary_tree
{
    class Solution {
        public List<Double> averageOfLevels(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<>();
            }

            List<Double> arr = new ArrayList<>();
            Queue<TreeNode> node = new LinkedList<>();
            node.add(root);
            return averageOfLevels(arr,node);
        }

        private List<Double> averageOfLevels(List<Double> arr, Queue<TreeNode> q)
        {
            if(q.isEmpty())
            {
                return arr;
            }

            int size = q.size();
            Double sum = sumOf(q);
            arr.add(sum/size);

            averageOfLevels(arr,q);
            return arr;
        }

        private Double sumOf(Queue<TreeNode> q)
        {
            Double sum = 0.0;
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
                TreeNode tamp = q.remove();
                sum += tamp.val;
            }

            return sum;
        }
    }


}
