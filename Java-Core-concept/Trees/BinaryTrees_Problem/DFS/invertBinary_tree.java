package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;
public class invertBinary_tree
{
    class Solution {
        public TreeNode invertTree(TreeNode root)
        {
            if(root == null)
            {
                return root;
            }

            invert(root);
            return root;
        }

        private void invert(TreeNode root)
        {
            if(root == null)
            {
                return;
            }

            invert(root.left);
            invertTree(root.right);

            TreeNode tamp = root.left;
            root.left = root.right;
            root.right = tamp;

        }
    }
}
