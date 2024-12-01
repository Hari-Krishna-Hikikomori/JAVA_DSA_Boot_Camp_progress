package Trees.BinaryTrees_Problem.DFS;

import Trees.BinaryTrees_Problem.BFS.TreeNode;

public class Sum_Root_To_Leaf_Number
{
    class Solution {


        public int sumNumbers(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }

            int[] arr = new int[2];
            return sumNumbers(root,arr);
        }

        public int sumNumbers(TreeNode root, int[]arr)
        {
            if(root == null)
            {
                return 0;
            }

            arr[0] = arr[0]*10 + root.val;

            if(root.left == null && root.right == null)
            {
                arr[1] = arr[0];
                arr[0] = (arr[0] - root.val)/10;
                return arr[1];
            }

            arr[1] = sumNumbers(root.left,arr) + sumNumbers(root.right,arr);

            arr[0] = (arr[0] - root.val)/10;

            return arr[1];
        }
    }
}
