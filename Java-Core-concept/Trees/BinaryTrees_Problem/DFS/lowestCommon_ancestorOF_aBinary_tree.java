package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class lowestCommon_ancestorOF_aBinary_tree
{
    
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
        {
            if(root == null)
            {
                return null;
            }
            Queue <TreeNode> ans = new LinkedList<>();
            return lowestCommonAncestor(root,p,q,ans);
        }

        private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q, Queue<TreeNode> ans)
        {
            if(root == null)
            {
                return null;
            }

            if(!ans.isEmpty())
            {
                return ans.peek();
            }

            if(p == root)
            {
                if(q != null && p == lowestCommonAncestor(root, null, q,ans))
                {
                    ans.add(p);
                }
                return root;
            }
            if(q == root)
            {
                if(p != null && q == lowestCommonAncestor(root, p, null,ans))
                {
                    ans.add(q);
                }
                return root;
            }
            TreeNode left  = lowestCommonAncestor(root.left,p,q,ans);
            TreeNode right = lowestCommonAncestor(root.right,p,q,ans);

            if(!ans.isEmpty())
            {
                return ans.peek();
            }
            if( left != null && right != null)
            {
                if(left == right)
                {
                    ans.add(left);
                    return left;
                }
                ans.add(root);
                return root;
            }


            if(left != null || right != null) return root;

            return null;
        }
    }
}
