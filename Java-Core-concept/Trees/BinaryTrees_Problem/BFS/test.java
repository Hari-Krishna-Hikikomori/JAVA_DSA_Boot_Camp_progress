package Trees.BinaryTrees_Problem.BFS;

import Trees.BST_Mark2_selfBalc_clean;
import Trees.node;

import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        System.out.println(1/2);
        BST_Mark2_selfBalc_clean bs = new BST_Mark2_selfBalc_clean(3);


        bs.insertion(4);
        bs.insertion(2);
        bs.insertion(1);
        bs.insertion(5);

        bs.Display();

        node n = new node(1);
        n.l = new node(2);
        n.r = new node(2);
        n.r.l = new node(2);
        n.r.r = new node(2);
        n.r.r.l = new node(2);
        n.r.l.l = new node(2);
        n.r.l.l.l = new node(2);
        n.r.l.l.l.l = new node(2);
        n.r.l.l.l.l.r = new node(2);
        n.r.l.l.l.r = new node(2);
        n.r.l.l.l.r.l = new node(2);
        n.r.l.r = new node(2);
        n.r.l.r.l = new node(2);
        n.r.l.r.l.l = new node(2);
        n.r.l.r.l.l.l = new node(2);
        n.r.l.r.r = new node(2);
        n.r.l.r.r.l = new node(2);
        n.r.l.r.r.l.l = new node(2);
       
        test t = new test();
        System.out.println(t.diameterOfBinaryTree(n));

    }


    public int diameterOfBinaryTree(node root)
    {
        return longPath(root,0,0);
    }

    private int longPath(node node, int l,int r)
    {
        if(node == null)
        {
            return l + r;
        }
        int left  = Path(node.l , 0);
        int rigth = Path(node.r,0);

        if(l + r < left + rigth)
        {
            l = left;
            r = rigth;
        }

        if(l >= left && r >= rigth)
        {
            return l + r;
        }

        int ans = Math.max(longPath(node.l,l,r),longPath(node.r,l,r));
        ans = Math.max(ans,left+rigth);

        return ans;
    }

    private  int Path(node node , int max)
    {
        if(node == null)
        {
            return max;
        }

        return Math.max(Path(node.l,max+1),Path(node.r,max+1));
    }

    public boolean isSymmetric(node root)
    {
        if(root == null)
        {
            return true;
        }
        Queue<node> q = new LinkedList<>();

        if(root.l != null)
        {
            q.add(root.l);
        }
        if(root.r != null)
        {
            q.add(root.r);
        }

        return isSymmetric(q);
    }

    private boolean isSymmetric(Queue<node> q)
    {
        if(q.isEmpty())
        {
            return true;
        }

        Deque<node> tamp = new LinkedList<>();

        int lim = q.size();

        if(lim % 2 != 0)
        {
            return false;
        }
        for (int i = 0; i < lim / 2 ; i++)
        {
            if( q.peek() == null)
            {
                tamp.addFirst(q.remove());
            }else{
                if(q.peek().l != null)
                {
                    q.add(q.peek().l);
                }
                else q.add(null);

                if(q.peek().r != null)
                {
                    q.add(q.peek().r);
                }else q.add(null);

                tamp.addFirst(q.remove());
            }
        }

        for (int i = lim / 2; i < lim; i++)
        {

            if(q.peek() == tamp.peek())
            {
                q.remove();
                tamp.remove();
            }else{
            if(q.peek().val != tamp.remove().val)
            {
                return false;
            }
            if(q.peek().l != null)
            {
                q.add(q.peek().l);
            }
            if(q.peek().r != null)
            {
                q.add(q.peek().r);
            }

            q.remove();}
        }

        return isSymmetric(q);
    }
    public boolean isCousins(node root, int x, int y)
    {
        if(root == null)
        {
            return false;
        }
        node x_node = findNode(root,x);
        node y_node = findNode(root,y);

        return ((isSibling(root,x_node,y_node)) && (level(root,x_node,0) == level(root,y_node,0)));
    }

    private int level(node root, node Node, int i)
    {
        if(root == null)
        {
            return 0;
        }

        if(root == Node)
        {
            return i;
        }

        return Math.max(level(root.l,Node,i+1),level(root.r,Node,i+1));
    }

    private boolean isSibling(node root, node xNode, node yNode)
    {
        if(root == null)
        {
            return false;
        }
        if(root.l == xNode && root.r == yNode || root.l == yNode && root.r == xNode)
        {
            return true;
        }

        return (!isSibling(root.l,xNode,yNode) && !isSibling(root.r,xNode,yNode));
    }

    private node findNode(node root, int val)
    {
        if(root == null)
        {
            return null;
        }
        if(root.val == val)
        {
            return root;
        }
        node tamp = findNode(root.l,val);

        return tamp == null ? findNode(root.r,val) : tamp;
    }

        public List<Integer> rightSideView(node root) {
            if (root == null) {
                return new ArrayList<>();
            }


            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);

            rightSideView(root, arr,0,0);
            return arr;
        }

        private int rightSideView(node root, List<Integer> arr,int level,int right)
        {
            if(root == null)
            {
                return level;
            }
            if(right > level)
            {
                arr.add(root.val);
                ++level;
            }
            if(root.r != null)
            {
                level = rightSideView(root.r,arr,level,right+1);
            }

            return rightSideView(root.l,arr,level,right+1);
        }


    private static int SuccessorOfnode_test(node head,int find)
    {
        if(head == null)
        {
            return -1;
        }

        Queue<node> q = new LinkedList<>();
        q.add(head);

        return SuccessorOfnode_test(find,q);
    }

    private static int SuccessorOfnode_test(int find, Queue<node> q)
    {
        if(!q.isEmpty() && q.peek().val == find)
        {
            if(q.peek().l != null)
            {
                q.add(q.peek().l);
            }
            q.remove();
            return q.isEmpty() ? -1 : q.remove().val;
        }

        if(q.peek().l != null)
        {
            q.add(q.peek().l);
        }

        if(q.peek().r != null)
        {
            q.add(q.peek().r);
        }

        q.remove();

        return SuccessorOfnode_test(find,q);
    }


}
