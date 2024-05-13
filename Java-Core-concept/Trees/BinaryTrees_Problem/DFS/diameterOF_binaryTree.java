package Trees.BinaryTrees_Problem.DFS;

import Trees.BinaryTrees_Problem.BFS.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class diameterOF_binaryTree
{
    //both sol 1 & sol 2 are solve by me;
    // solution_01 - use recursion to find long path for nodes left and right this will run repeatedly for each node
    //            run time is 256 ms worst of worst;

    // solution_02 - use recursion and Queues or Array (array is much faster and constant memory use) for store the
    //            long path --- run time in 0 ms
    class Solution_01 {
        public int diameterOfBinaryTree(TreeNode root)
        {
           return longPath(root,0,0);
        }

        private int longPath(TreeNode node,int l , int r)
        {
            if(node == null)
            {
                return 0;
            }
            int left  = Path(node.left , 0);
            int rigth = Path(node.right,0);

            if(l + r < left + rigth)
            {
                l = left;
                r = rigth;
            }

            if(l >= left && r >= rigth)
            {
                return l + r;
            }
            int ans = Math.max(longPath(node.left,l,r),longPath(node.right,l,r));
            ans = Math.max(ans,left+rigth);

            return ans;
        }

        private  int Path(TreeNode node , int max)
        {
            if(node == null)
            {
                return max;
            }

            return Math.max(Path(node.left,max+1),Path(node.right,max+1));
        }
    }
    class Solution_02 {
        public int diameterOfBinaryTree(TreeNode root)
        {
            int[] arr = new int[1];
            longPath(root,arr);
            return arr[0];
        }

        private int longPath(TreeNode root,int[] arr)
        {
            if(root == null)
            {
                return -1;
            }

            int l = 1 + longPath(root.left,arr);
            int r = 1 + longPath(root.right,arr);

            if(arr[0] < l+r)
            {
                arr[0] = l + r;
            }
            return Math.max(l,r);
        }
    }
}
