package Linklist;
class Single_LinkedList implements LL{
    private Node head;
    private Node temp = head;
    private Node tail;
    private int size = 0;

    Single_LinkedList()
    {

    }
    public  Node headNode()
    {
        return head;
    }
    public void set(int val) {
        if (head == null) {
            head = new Node();
            head.val = val;
            tail = head;
            size = 0;
        } else {
            temp = tail;
            temp.next = new Node();
            temp.next.val = val;
            ++size;
            tail = temp.next;
        }
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
            temp.next = new Node();
            temp.next.val = val;
            ++size;
            tail = temp.next;
            return;
        }
        if(index == 0)
        {
            temp = new Node();
            temp.val = val;
            temp.next = head;
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
            Node temp2 = new Node();
            temp2.val  = val;
            temp2.next = temp.next;
            temp.next = temp2;
            ++size;
    }

    public void reversRecurs(Node node)
    {
        if(node == tail)
        {
            head = node;

            return;
        }

        reversRecurs(node.next);
        tail.next = node;
        tail.next.next = null;
        tail = tail.next;
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
        temp = head;
        int pos = 0;
        while (pos != index)
        {
            ++pos;
            temp = temp.next;
        }
        if (pos == index)
        {
            System.out.println(temp.val);
        }
    }

    @Override
    public void Size() {
        System.out.println(size+1);
    }

    @Override
    public void insert(int index,int data)
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
        Recursion(head,index,data);
    }

    private void insertTail(int data)
    {
        tail.next = new Node();
        tail.next.val = data;
        tail = tail.next;
        ++size;
    }

    private void Recursion(Node head, int index, int data)
    {

        if(index == 1)
        {
            temp = new Node();
            temp.val = data;
            temp.next = head.next;
            head.next = temp;
            ++size;
            return;
        }
        Recursion(head.next,index - 1,data);
    }

    private void insertHead(int data)
    {
        temp = new Node();
        temp.val = data;
        temp.next = head;
        head = temp;
        ++size;
    }

    public void getall() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

}