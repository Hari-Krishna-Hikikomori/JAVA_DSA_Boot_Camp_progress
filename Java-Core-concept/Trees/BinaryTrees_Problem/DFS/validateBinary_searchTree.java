package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;
public class validateBinary_searchTree
{

    public static void main(String[] args)
    {
        validateBinary_searchTree.Solution_mark test =  new Solution_mark();

        TreeNode node = new TreeNode(32);

        node.right = new TreeNode(47);
        node.left  = new TreeNode(26);
        node.left.left = new TreeNode(19);
        node.left.left.right = new TreeNode(27);
        node.right.right = new TreeNode(56);

        System.out.println(test.isValidBST(node));


    }
    class Solution {
        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }

            return leftCheck(root.left, root.val) && rightCheck(root.right, root.val);
        }

        private boolean rightCheck(TreeNode root, int val) {
            if (root == null) {
                return true;
            }

            if (root.val <= val) {
                return false;
            }
            if (root.left != null && root.left.val > root.val) {
                return false;
            }

            if (root.right != null && root.right.val < root.val) {
                return false;
            }

            return rightCheck(root.left, root.val) && rightCheck(root.right, root.val);
        }

        private boolean leftCheck(TreeNode root, int val) {
            if (root == null) {
                return true;
            }

            if (root.val >= val) {
                return false;
            }
            if (root.left != null && root.left.val > root.val) {
                return false;
            }

            if (root.right != null && root.right.val < root.val) {
                return false;
            }

            return leftCheck(root.left, root.val) && leftCheck(root.right, root.val);
        }
    }

   public static class Solution_mark {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, null, null);
        }

        private boolean isValidBST(TreeNode root, Integer minValue, Integer maxValue) {
            if (root == null) {
                return true;
            }

            // Check if current node value is within the valid range
            if ((minValue != null && root.val <= minValue) || (maxValue != null && root.val >= maxValue)) {
                return false;
            }

            // Recursively check left and right subtrees
            return isValidBST(root.left, minValue, root.val) && isValidBST(root.right, root.val, maxValue);
        }
    }

}
