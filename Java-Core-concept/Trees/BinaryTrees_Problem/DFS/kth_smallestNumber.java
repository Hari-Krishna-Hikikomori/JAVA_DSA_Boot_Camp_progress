package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class kth_smallestNumber
{

    public static void main(String[] args)
    {
        kth_smallestNumber.Solution test =  new kth_smallestNumber.Solution();

        TreeNode node = new TreeNode(5);

        node.right = new TreeNode(8);
        node.left  = new TreeNode(3);
        node.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(2);
        node.right.right = new TreeNode(9);

        System.out.println(test.kthSmallest(node,4));


    }
    static class Solution{
        public int kthSmallest(TreeNode root, int k)
        {
            if(root == null)
            {
                return 0;
            }

            List<Integer> list = new ArrayList<>();
            return kthSmallest(root,k,list);
        }

        private int kthSmallest(TreeNode root, int k, List<Integer> ans)
        {
            if(root == null) return k;



            k = kthSmallest(root.left,k,ans)-1;
            if(k == 0)
            {
                ans.add(root.val);
                return ans.getFirst();
            }

            return !ans.isEmpty() ? ans.getFirst() : kthSmallest(root.right,k,ans);
        }
    }
    static class Solution_02 {
        public int kthSmallest(TreeNode root, int k)
        {
            if(root == null)
            {
                return 0;
            }


            return kthSmallest(root,k,0);
        }

        private int ans;
        private int kthSmallest(TreeNode root, int k, int count)
        {
            if(root == null) return count;



            count = kthSmallest(root.left,k,ans)+1;
            if(k == count)
            {
                ans = root.val;
            }

            return ans != 0 ? ans : kthSmallest(root.right,k,ans);
        }
    }
}
