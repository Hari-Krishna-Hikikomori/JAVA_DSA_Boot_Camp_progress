package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;
public class maximumDepth_ofBinarytree
{
    class Solution {
        public int maxDepth(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }

            return Depth(root);
        }

        private int Depth(TreeNode root)
        {
            if(root == null)
            {
                return 0;
            }

            int l = Depth(root.left)+1;
            int r = Depth(root.right)+1;

            return Math.max(l,r);
        }
    }
}
