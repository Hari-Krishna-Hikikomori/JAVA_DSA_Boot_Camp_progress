package Trees.BinaryTrees_Problem.DFS;

import Trees.BinaryTrees_Problem.BFS.TreeNode;

public class Path_sum
{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(1);

        Solution a = new Solution();
        System.out.println(a.hasPathSum(root,5));
    }
    static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum)
        {
            if(root == null)
            {
                return false;
            }

            int[]arr = new int[1];
            arr[0] = targetSum;
            return hasPathSum(root,arr);
        }

        int i = 0;
        private boolean hasPathSum(TreeNode root, int[] targetSum)
        {

            if(root == null)
            {
                return false;
            }

            i = root.val + i;

            if(i == targetSum[0] && root.left == null && root.right == null)
            {
                return true;
            }

            boolean check = hasPathSum(root.left,targetSum);
            if(check != false)
            {
                i = i - root.val;
                check = hasPathSum(root.right,targetSum);
            }

            return check;
        }
    }
}
