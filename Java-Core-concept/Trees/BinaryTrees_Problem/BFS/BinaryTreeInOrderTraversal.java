package Trees.BinaryTrees_Problem.BFS;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal
{
    class Solution {
            public List<Integer> inorderTraversal(TreeNode root)
            {
                List<Integer> arr = new ArrayList<>();
                if(root == null)
                {
                    return arr;
                }

                return recur(root,arr);
            }

            public List<Integer> recur(TreeNode node, List<Integer> arr)
            {
                if(node == null)
                {
                    return arr;
                }


                recur(node.left,arr);
                arr.add(node.val);
                recur(node.right,arr);

                return arr;
            }
        }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    }
