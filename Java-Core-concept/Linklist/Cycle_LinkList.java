package Linklist;

public class Cycle_LinkList implements LL
{
    private Node_Twoway head;
    private Node_Twoway temp = head;
    private Node_Twoway tail;
    private int size = 0;

    Cycle_LinkList()
    {
        head = new Node_Twoway();
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
            tail.next = head;
            head.prev = tail;
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
            temp.next = new Node_Twoway();
            temp.next.val = val;
            temp.next.prev = temp;
            ++size;
            tail = temp.next;
            tail.next = head;
            head.prev = tail;
            return;
        }
        if(index == 0)
        {
            temp = new Node_Twoway();
            temp.val = val;
            temp.next = head;
            head.prev = temp;
            head = temp;
            tail.next = head;
            head.prev = tail;
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
            tail.next = head;
            head.prev = tail;
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
        tail.next = head;
        head.prev = tail;
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
        head.prev = tail;
        tail.next = head;
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
        head.prev = tail;
        tail.next = head;
        ++size;
    }

    public void getall() {
        temp = head;
        System.out.print(tail.val+"<-End->");
        int i = 0;
        while (size + 1 != i) {
            System.out.print("<-"+ temp.val + "->");
            temp = temp.next;
            ++i;
        }
        System.out.println("<-Start->"+head.val);
    }

    public void getallrev()
    {
        temp = tail;
        System.out.print(head.val+"<-Start->");
        int i = 0;
        while (size + 1 != i) {
            System.out.print("<-"+ temp.val + "->");
            temp = temp.prev;
            ++i;
        }
        System.out.println("<-End->"+tail.val);

    }
}
