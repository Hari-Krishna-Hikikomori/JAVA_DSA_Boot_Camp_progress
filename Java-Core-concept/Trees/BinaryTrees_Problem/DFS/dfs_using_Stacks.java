package Trees.BinaryTrees_Problem.DFS;
import Trees.BinaryTrees_Problem.BFS.TreeNode;

import java.util.Stack;

public class dfs_using_Stacks
{
    void stackNode(TreeNode node){
        if(node == null)
        {
            return;
        }

        Stack<TreeNode> s = new Stack<>();
        s.push(node);

        while (!s.empty())
        {
         TreeNode remove = s.pop();
            System.out.println(remove.val+" ");

            if(remove.right != null) s.push(remove.right);
            if(remove.left != null) s.push(remove.left);
        }

    }
}
