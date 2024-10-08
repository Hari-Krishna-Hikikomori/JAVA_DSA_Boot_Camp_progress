package Trees.BinaryTrees_Problem.DFS;

import Trees.BinaryTrees_Problem.BFS.TreeNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class constructBInary_treeFrome_preOrder_andInorder_traversal
{
    public static void main(String[] args)
    {

        String str = 123+"-";
        System.out.println(str.length());
        int index = 0;
        int s = str.trim().charAt(index);
        int ans = 0;
        while(s!= '-' && s!= 'N')
        {
            ans = (ans*10)+(s-48);
            s = str.trim().charAt(++index);
        }

        System.out.println(ans);
        int[] pre = {1, 2, 4, 5, 3, 2, 4, 5};
        int[] iro = {4, 2, 5, 1, 4, 2, 5, 3};

        TreeNode node = new Solution().buildTree(pre,iro);


    }
    static class Solution {

        private int i = 0;
        private int p = 0;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return build(preorder, inorder, Integer.MIN_VALUE);
        }

        private TreeNode build(int[] preorder, int[] inorder, int stop) {
            if (p >= preorder.length) {
                return null;
            }
            if (inorder[i] == stop) {
                ++i;
                return null;
            }

            TreeNode node = new TreeNode(preorder[p++]);
            node.left = build(preorder, inorder, node.val);
            node.right = build(preorder, inorder, stop);
            return node;
        }

//        public TreeNode buildTree(int[] preorder, int[] inorder)
//        {
//            return buildTree(preorder,inorder,0,preorder.length-1);
//        }
//
//        static int pre = 0;
//        private TreeNode buildTree(int[] preorder, int[] inorder,int s, int e)
//        {
//            if(pre >= preorder.length || s > e)
//            {
//                return null;
//            }
//
//            int tamp = s;
//
//            while(inorder[s] != preorder[pre] && s < e)
//            {
//                s += 1;
//            }
//
//            TreeNode head = new TreeNode(preorder[pre]);
//            pre += 1;
//
//            head.left = buildTree(preorder,inorder,tamp,s-1);
//            head.right = buildTree(preorder,inorder,s+1,e);
//
//            return head;
//        }

    }
}
