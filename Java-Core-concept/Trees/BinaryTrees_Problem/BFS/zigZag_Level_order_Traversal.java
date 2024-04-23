package Trees.BinaryTrees_Problem.BFS;

import java.util.*;

public class zigZag_Level_order_Traversal
{
    class Solution_01 {

        public List<List<Integer>> zigzagLevelOrder(TreeNode root)
        {
            if(root == null)
            {
                return new ArrayList<>();
            }

            Queue<TreeNode> q =  new LinkedList<>();
            List<List<Integer>> arr =  new ArrayList<>();
            q.add(root);
            return zigzagLevelOrder(q,arr,0);
        }

        private List<List<Integer>> zigzagLevelOrder(Queue<TreeNode> q, List<List<Integer>> arr, int level)
        {
            if(q.isEmpty())
            {
                return arr;
            }

            antiClock(q,arr,level);
            Clock(q,arr,++level);

            zigzagLevelOrder(q,arr,level+1);
            return arr;
        }

        private void Clock(Queue<TreeNode> q, List<List<Integer>> arr, int level)
        {
            if(q.isEmpty())return;

            arr.add(new ArrayList<>());
            Stack<TreeNode> s = new Stack<>();

            while(!q.isEmpty())
            {
                arr.get(level).add(q.peek().val);
                s.add(q.remove());
            }
            while(!s.isEmpty())
            {

                if(s.peek().left != null)
                {
                    q.add(s.peek().left);
                }
                if(s.peek().right != null)
                {
                    q.add(s.peek().right);
                }

                s.pop();
            }
        }

        private void antiClock(Queue<TreeNode> q, List<List<Integer>> arr, int level) {
            if (q.isEmpty()) {
                return;
            }
            arr.add(new ArrayList<>());
            Stack<TreeNode> s = new Stack<>();

            while (!q.isEmpty()) {
                arr.get(level).add(q.peek().val);
                s.add(q.remove());
            }

            while (!s.isEmpty()) {
                if (s.peek().right != null) {
                    q.add(s.peek().right);
                }

                if (s.peek().left != null) {
                    q.add(s.peek().left);
                }

                s.pop();
            }
        }

        class Solution_02
        {
            public List<List<Integer>> zigzagLevelOrder(TreeNode root)
            {
                if(root == null)
                {
                    return new ArrayList<>();
                }

                Deque<TreeNode> dq =  new LinkedList<>();
                List<List<Integer>> arr =  new ArrayList<>();
                dq.add(root);

                return zigzagLevelOrder(dq,arr,0);
            }

            private List<List<Integer>> zigzagLevelOrder(Deque<TreeNode> dq, List<List<Integer>> arr, int level)
            {
                if(dq.isEmpty())
                {
                    return arr;
                }

                backward(dq,arr,level);
                forward(dq,arr,++level);

                return zigzagLevelOrder(dq,arr,level+1);
            }

            private void backward(Deque<TreeNode> dq, List<List<Integer>> arr, int level)
            {
                arr.add(new ArrayList<>());
                int lim = dq.size();
                for (int i = 0; i < lim; i++)
                {
                    TreeNode tamp = dq.removeLast();

                    arr.get(level).add(tamp.val);

                    if(tamp.right != null)
                    {
                        dq.addFirst(tamp.right);
                    }
                    if(tamp.left != null)
                    {
                        dq.addFirst(tamp.left);
                    }
                }
            }

            private void forward(Deque<TreeNode> dq, List<List<Integer>> arr, int level)
            {
                arr.add(new ArrayList<>());
                int lim = dq.size();
                for (int i = 0; i < lim; i++)
                {
                    TreeNode tamp = dq.remove();

                    arr.get(level).add(tamp.val);

                    if(tamp.left != null)
                    {
                        dq.add(tamp.left);
                    }
                    if(tamp.right != null)
                    {
                        dq.add(tamp.right);
                    }

                }
            }
        }
    }



}


