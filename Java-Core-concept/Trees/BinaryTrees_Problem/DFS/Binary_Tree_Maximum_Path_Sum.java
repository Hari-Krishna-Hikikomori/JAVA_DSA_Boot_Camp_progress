package Trees.BinaryTrees_Problem.DFS;

import Trees.BinaryTrees_Problem.BFS.TreeNode;

public class Binary_Tree_Maximum_Path_Sum
{
    public static void main(String[] args) {
        My_Solution obj = new My_Solution();
    }



    // make it more complicating thing having  two issues
    // 1 return 0 make it negative value ignore it the zero is greater
    // when i zero to negative number if the tree full of negative this will return negative as answer
    // solve it by using arrays as a return type.

    // 2 if i return biggest value as return
    // this also ignore the path only returning the left + right + val or val or left or rigth
    // only returning the Max Path as return.
    static class My_Solution {
        public int maxPathSum(TreeNode root)
        {
            if(root ==  null)
            {
                return 0;
            }


            int[] val = new int[1];
            val[0] = root.val;
            maxPathSum(root,val);
            return val[0];
        }

        private int[] maxPathSum(TreeNode root, int[] val)
        {
            if(root == null)
            {
                return null;
            }

            int[] left  = maxPathSum(root.left, val);
            int[] right = maxPathSum(root.right, val);

            int mix;
            if(right == null && left == null)
            {
                val[0] = Math.max(val[0], root.val);
                int ans[] = {root.val};
                return ans;
            }
            if(left == null)
            {
                val[0] = Math.max(right[0],val[0]);
                val[0] = Math.max(right[0]+root.val, val[0]);
                val[0] = Math.max(root.val,val[0]);

                int[] max = {Math.max(root.val,right[0]+root.val)};
                return max;
            }

            if(right == null)
            {
                val[0] = Math.max(left[0],val[0]);
                val[0] = Math.max(left[0]+root.val, val[0]);
                val[0] = Math.max(root.val,val[0]);

                int[] max = {Math.max(root.val,left[0]+root.val)};
                return max;
            }

            mix = left[0] + root.val + right[0];
            val[0] = Math.max(left[0],val[0]);
            val[0] = Math.max(right[0],val[0]);
            left[0] += root.val;
            right[0] += root.val;
            val[0] = Math.max(left[0],val[0]);
            val[0] = Math.max(right[0],val[0]);

            val[0] = Math.max(val[0], mix);
            int[] ans = new int[1];
            ans[0] = Math.max(left[0], right[0]);
            ans[0] = Math.max(root.val, ans[0]);
            return ans;
        }
    }


    //make it simple
    //issues one returning 0
    //returning 0 affect the negative number but the fact is if tree fill with negative only one number is the
    //maxPath because adding the negative number to another negative will become more negative value os it was point less
    //if the negative number shows up make them as zero + negative number will be negative number

    //issues two unwanted comparisons
    //need only left,right and val as path because at point of time this three will connect eventually
    //only need to return the max path of that node plus itself
    static class Kunal_Solution {
        public int maxPathSum(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }
            int[] ans = new int[1];
            ans[0] = root.val;
            maxPathSum(root,ans);

            return ans[0];
        }

        private int maxPathSum(TreeNode root, int[] ans)
        {
            if(root == null)
            {
                return 0;
            }


            int left = Math.max(maxPathSum(root.left,ans),0);
            int right = Math.max(maxPathSum(root.right,ans),0);

            ans[0] = Math.max(left+right+root.val,ans[0]);

            return Math.max(left,right) + root.val;
        }
    }
}
