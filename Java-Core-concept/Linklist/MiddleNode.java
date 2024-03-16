package Linklist;

public class MiddleNode
{
    MiddleNode(Node head)
    {
        Node fast = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            head = head.next;
        }
        System.out.println(head.val);
    }
    static Node middleNode(Node head)
    {
        Node fast = head;
        int i = 0;
        int count = 0;

        while(head != null)
        {
            if(fast != null && fast.next != null)
            {
                fast = fast.next.next;
                count += 2;
            }
            if(i == (count + 1) / 2)
            {
                if((count + 1) % 2 == 1)
                {
                    return head.next == null ? head : head.next;
                }
                else
                {
                    return head;
                }
            }

            i++;
            head = head.next;
        }
        return head;
    }
}
