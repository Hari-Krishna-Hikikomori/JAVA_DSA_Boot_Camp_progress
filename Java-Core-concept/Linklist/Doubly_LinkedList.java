package Linklist;


public class Doubly_LinkedList implements LL
{
    private Node_Twoway head;
    private Node_Twoway temp = head;
    private Node_Twoway tail;
    private int size = 0;

    Doubly_LinkedList()
    {
        head = new Node_Twoway();
    }
    Doubly_LinkedList(Node_Twoway node)
    {
        head = node;
    }
    public void set(int val) {
        if (tail == null) {
            head.val = val;
            tail = head;
            size = 0;
        } else {
            temp = tail;
            temp.next = new Node_Twoway();
            temp.next.val = val;
            temp.next.prev = temp;
            ++size;
            tail = temp.next;
        }
    }
    public void setTail(Node_Twoway node)
    {
        while (node.next != null)
        {
            node = node.next;
        }
        tail = node;
    }

    public void set(int val,int index)
    {
        if(index > size)
        {
            System.out.println("Illegal Position");
            return;
        }
        if (index == size+1)
        {
            temp = tail;
            temp.next = new Node_Twoway();
            temp.next.val = val;
            temp.next.prev = temp;
            ++size;
            tail = temp.next;
            return;
        }
        if(index == 0)
        {
            temp = new Node_Twoway();
            temp.val = val;
            temp.next = head;
            head.prev = temp;
            head = temp;
            ++size;
            return;
        }
        temp = head;
        int pos = 0;
        while (pos + 1 != index && head.next != null)
        {
            ++pos;
            temp = temp.next;
        }
        Node_Twoway temp2 = new Node_Twoway();
        temp2.val  = val;
        temp2.next = temp.next;
        temp2.prev = temp;
        temp.next.prev = temp2;
        temp.next = temp2;
        ++size;
    }

    @Override
    public void remove(int index)
    {
        if(index > size || index < 0)
        {
            System.out.println("Node Doesn't Exist" );
            return;
        }

        if(index == 0)
        {
            head = head.next;
            head.prev = null;
            --size;
            return;
        }
        temp = head;
        int pos = 0;
        while (pos + 1 != index && head.next != null)
        {
            ++pos;
            temp = temp.next;
        }
        temp.next.prev = temp;
        temp.next = temp.next.next;
        --size;
    }


    @Override
    public void get(int index)
    {
        if(index > size || index < 0)
        {
            System.out.println("Illegal Position");
            return;
        }

        if(size - index < index){
            temp = tail;
            int pos = size;
            while (pos != index)
            {
                --pos;
                temp = temp.next;
            }
                System.out.println(temp.val);
        }else {
            temp = head;
            int pos = 0;
            while (pos != index) {
                ++pos;
                temp = temp.next;
            }
                System.out.println(temp.val);
        }
    }

    @Override
    public void Size() {
        System.out.println(size+1);
    }

    @Override
    public void insert(int index, int data)
    {
        if(index < 0 || index > size + 1)
        {
            System.out.println("invalid position");
            return;
        }
        if(index == 0)
        {
            insertHead(data);
            return;
        }
        if(index == size + 1)
        {
            insertTail(data);
            return;
        }
        if(index == size)
        {
            insertTail_Prev(data);
            return;
        }
        Recursion(head,index,data);
    }

    private void insertTail_Prev(int data)
    {
        temp = new Node_Twoway();
        temp.val = data;
        temp.next = tail;
        temp.prev = tail.prev;
        tail.prev.next = temp;
        ++size;
    }

    private void insertTail(int data)
    {
        tail.next = new Node_Twoway();
        tail.next.val = data;
        tail.next.prev = tail;
        tail = tail.next;
        ++size;
    }

    private void Recursion(Node_Twoway head, int index, int data)
    {
        if(size - index < index)
        {
            recursion(tail,index,data);
            return;
        }else
        {
            if (index == 1) {
                temp = new Node_Twoway();
                temp.val = data;
                temp.next = head.next;
                temp.prev = head;
                head.next.prev = temp;
                head.next = temp;
                ++size;
                return;
            }
            Recursion(head.next, index - 1, data);
        }
    }

    private void recursion(Node_Twoway tail, int index, int data)
    {
        if(index == size - 1)
        {
            temp = new Node_Twoway();
            temp.val = data;
            temp.next = tail.next;
            temp.prev = tail;
            tail.next.prev = temp;
            tail.next = temp;
            ++size;
            return;
        }
        recursion(tail.prev,index + 1,data);
    }


    public void insertHead(int data)
    {
        temp = new Node_Twoway();
        temp.val = data;
        temp.next = head;
        head.prev = temp;
        head = temp;
        ++size;
    }

    public void getall() {
        temp = head;
        System.out.print(temp.prev);
        while (temp != null) {
            System.out.print("<-"+ temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void getallrev()
    {
        temp = tail;
        System.out.print(temp.next);
        while (temp != null) {
            System.out.print("<-"+ temp.val + "->");
            temp = temp.prev;
        }
        System.out.println("null");

    }
    public void removeDupl(Node_Twoway node)
    {
        if(node.next == null)
        {
            return;
        }
        if(node.next.next == null && node.val == node.next.val)
        {
            node.next = null;
            tail = node;
            return;
        }
        if(node.val == node.next.val)
        {
            node.next.next.prev = node;
            node.next = node.next.next;
            removeDupl(node);
            return;
        }
        removeDupl(node.next);
    }

    public Node_Twoway gethead()
    {
        return head;
    }

    public Node_Twoway mergeSorted_list(Node_Twoway node1 , Node_Twoway node2)
    {
        Node_Twoway temp = new Node_Twoway();

        if(node1 == null)
        {
            return node2;
        }
        if(node2 == null)
        {
          return node1;
        }
        if(node1.val < node2.val)
        {
            temp.val = node1.val;
            temp.next = mergeSorted_list(node1.next,node2);
            temp.next.prev = temp;
            return temp;
        }
//        if(node1.val == node2.val)
//        {
//            temp.val = node1.val;
//            temp.next = new Node_Twoway();
//            temp.next.val = node2.val;
//            temp.next.next = mergeSorted_list(node1.next,node2.next);
//            temp.next.prev = temp;
//            temp.next.next.prev = temp.next;
//            return temp;
//        }
        temp.val = node2.val;
        temp.next = mergeSorted_list(node1,node2.next);
        temp.next.prev = temp;
        return temp;
    }
}
