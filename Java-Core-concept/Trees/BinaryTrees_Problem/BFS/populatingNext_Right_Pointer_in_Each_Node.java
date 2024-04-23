package Trees.BinaryTrees_Problem.BFS;

import OOPS.Enums;

import java.util.LinkedList;
import java.util.Queue;

public class populatingNext_Right_Pointer_in_Each_Node
{

    // leet code result 
    // solution 01 BFS(queues) with while loop - run time is 3ms
    // solution 02 BFS(queues) with Recursion and two helper class - run time is 1ms
    // solution 03 without BFS only using For loop - run time is 0ms
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

     // run time 3ms
    class Solution_01 {
        public Node connect(Node root)
        {
            if(root == null)
            {
                return root;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            connect(q);

            return root;
        }

        private void connect(Queue<Node> q)
        {
            while(!q.isEmpty())
            {
                int lim = q.size();

                for (int i = 1; i <=lim; i++)
                {

                  Node tamp = q.remove();

                  if(tamp.left != null) q.add(tamp.left);
                  if(tamp.right != null) q.add(tamp.right);

                  if(i == lim)
                  {
                   break;
                  }
                  tamp.next = q.peek();
                }
            }
        }
    }

    // run time 1ms
    class Solution_02{
        public Node connect(Node root)
        {
            if(root == null)
            {
                return root;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            connect(q);

            return root;
        }

        private void connect(Queue<Node> q)
        {
            if(q.isEmpty()) return;

            setNext(q);
            connect(q);
        }

        private void setNext(Queue<Node> q)
        {
                int lim = q.size();

                for (int i = 1; i <=lim; i++)
                {

                    Node tamp = q.remove();

                    if(tamp.left != null) q.add(tamp.left);
                    if(tamp.right != null) q.add(tamp.right);

                    if(i == lim)
                    {
                        break;
                    }
                    tamp.next = q.peek();
                }
        }
    }
    // whithout BFS run time is 0ms
    class Solution_03 {
        public Node connect(Node root) {
            for (Node tamp = root; tamp != null; tamp = tamp.left) {
                for (Node cur = tamp; cur != null; cur = cur.next) {
                    if (cur.left != null) {
                        cur.left.next = cur.right;

                        if (cur.next != null) {
                            cur.right.next = cur.next.left;
                        }
                    } else break;
                }
            }

            return root;
        }
    }
}
