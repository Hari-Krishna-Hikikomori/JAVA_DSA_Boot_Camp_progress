package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;

import java.util.Stack;

public class flattenThe_binaryTree_toLinklist
{

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution test = new Solution();

        test.flatten(root);

        while(root != null)
        {
            System.out.print(root.val+"--->");
            root = root.right;
        }

        System.out.println("null");
    }
    public static class Solution {
        public void flatten(TreeNode root)
        {
            if(root == null)
            {
                return;
            }

            TreeNode tamp = new TreeNode();
            flat(root,tamp);

            root = tamp;

        }

        private TreeNode flat(TreeNode root,TreeNode right)
        {
            if(root == null) return right;

            TreeNode leftside  = root.left;
            TreeNode rightside = root.right;

            right.right = root;
            right.left = null;
            TreeNode tamp = flat(leftside, right.right);

            return flat(rightside, tamp);
        }
    }

    public static class Solution_Kunal {
        public void flatten(TreeNode root)
        {
            TreeNode current = root;

            while(current != null)
            {

                if(current.left != null)
                {
                    TreeNode tamp = current.left;
                    while(tamp != null)
                    {
                        tamp = tamp.right;
                    }

                    tamp = current.right;
                    current.right = current.left;
                    current.left = null;
                }


                current = current.right;
            }

        }
    }
}
