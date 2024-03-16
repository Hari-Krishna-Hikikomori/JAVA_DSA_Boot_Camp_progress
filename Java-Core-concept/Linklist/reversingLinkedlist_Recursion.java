package Linklist;

public class reversingLinkedlist_Recursion
{
    public static Node recur(Node head)
    {

        if(head.next == null)
        {
            return head;
        }

        Node tamp = recur(head.next);
        Node ans = tamp;
        head.next = null;
        while(tamp.next != null)
        {
            tamp = tamp.next;
        }
        tamp.next = head;

        return ans;
    }

    public static void main(String[] args) {
        Single_LinkedList link = new Single_LinkedList();
        link.set(4);
        link.set(2);
        link.set(1);
        link.set(3);
//        link.set(0);
        System.out.println();
        Node head = recur(link.headNode());
        while (head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
