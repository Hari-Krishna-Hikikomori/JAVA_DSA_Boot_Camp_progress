package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;
public class covertSorted_arrayTo_binarySearch_tree
{
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums)
        {
            if(nums.length == 0)
            {
                return new TreeNode();
            }

            return sortedArrayToBST(nums,0,nums.length-1);
        }

        private TreeNode sortedArrayToBST(int[] nums, int s, int e)
        {
            if(s == e)
            {
                return new TreeNode(nums[s]);
            }

            if(s > e)
            {
                return null;
            }
            int m = s + (e-s)/2;

            TreeNode node = new TreeNode(nums[m]);
            node.left = sortedArrayToBST(nums,s,m-1);
            node.right = sortedArrayToBST(nums,m+1,e);

            return node;
        }
    }
}
