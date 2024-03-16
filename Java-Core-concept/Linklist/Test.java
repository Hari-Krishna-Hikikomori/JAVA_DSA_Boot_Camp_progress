package Linklist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Single_LinkedList link = new Single_LinkedList();
        Doubly_LinkedList lnk = new Doubly_LinkedList();
        Doubly_LinkedList lnk2 = new Doubly_LinkedList();
        Cycle_LinkList ln = new Cycle_LinkList();

        System.out.println(2/5);
//        for (int i = 0; i < 5; i++) {
//            link.set(i);
//        }
//        link.getall();
//        for (int i = 4; i >= 0; i--) {
//            System.out.print("["+i*10+" at "+i+" index]");
//            link.set(i*10,i);
//        }
//        System.out.println();
//        link.Size();
//        link.getall();
//        for (int i = 4; i >= 0; i--)
//        {
//            link.get(i);
//            link.remove(i);
//        }
//        link.Size();
//        link.getall();
//
//        System.out.println("--------------");
//        for (int i = 0; i < 5; i++) {
//            lnk.set(i);
//        }
//        lnk.getall();
//        for (int i = 4; i >= 0; i--) {
//            System.out.print("["+i*10+" at "+i+" index]");
//            lnk.set(i*10,i);
//        }
//        System.out.println();
//        lnk.Size();
//        lnk.getall();
//        for (int i = 4; i >= 0; i--)
//        {
//            System.out.print("remove - ");
//            lnk.get(i);
//            lnk.remove(i);
//        }
//
//        lnk.Size();
//        lnk.getall();
//        lnk.getallrev();
//        System.out.println("--------------");
//        for (int i = 0; i < 5; i++) {
//            ln.set(i);
//        }
//        lnk.getall();
//        for (int i = 4; i >= 0; i--) {
//            System.out.print("["+i*10+" at "+i+" index]");
//            ln.set(i*10,i);
//        }
//        System.out.println();
//        ln.Size();
//        ln.getall();
//        for (int i = 4; i >= 0; i--)
//        {
//            System.out.print("remove - ");
//            ln.get(i);
//            ln.remove(i);
//        }
//
//        ln.Size();
//        ln.getall();
//        ln.getallrev();
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <= i ; j++)
//            {
//                lnk.set(i);
//                lnk2.set(i+2);
//            }
//        }
//        lnk.removeDupl(lnk.gethead());
//        lnk2.removeDupl(lnk2.gethead());
//        lnk.getall();
// //       lnk.getallrev();
//        lnk2.getall();
// //       lnk2.getallrev();
//
//        Doubly_LinkedList temp = new Doubly_LinkedList(new Doubly_LinkedList().mergeSorted_list(lnk.gethead(),lnk2.gethead()));
//        temp.setTail(temp.gethead());
//        temp.getall();
//        temp.getallrev();
//        temp.removeDupl(temp.gethead());
//        temp.setTail(temp.gethead());
//        temp.getall();
//        temp.getallrev();
//        double i = Math.pow(10,4);
//        System.out.println(i);
//        System.out.println();
        link.set(4);
        link.set(2);
        link.set(1);
        link.set(3);
//        link.set(0);
        System.out.println();
        //link.getall();
        link.reversRecurs(link.headNode());
        Node head =csh(link.headNode());
        while (head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
        link.reversRecurs(link.headNode());
    }


    private static Node csh(Node node)
    {
        if(node == null)
        {
            return null;
        }
        Node tamp = node;
        while(tamp != null && tamp.next != null)
        {
            tamp = tamp.next.next;
        }
        return split(node,tamp);
    }

    private static Node split(Node start, Node end)
    {
        if(start == null)return null;
        if(start == end)
        {
            Node tamp = new Node();
            tamp.val = start.val;
            return tamp;
        }
        Node tamp = start;
        Node mid = start;
        while(tamp != null && tamp.next != null && tamp != end && mid.next != end)
        {
            tamp = tamp.next.next;
            mid = mid.next;
        }
        Node s = new Node();
        Node e = new Node();
        if(start.next == end)
        {
            s = split(start,start);
            e = split(end,end);
        }else {
            s = split(start, mid);
            e = split(mid.next, end);
        }

        start.next = sort(s,e);

        return start.next;
    }

    private static Node sort(Node s, Node e)
    {
        Node tamp = new Node();
        if(s == null)
        {
            return e;
        }
        if(e == null)
        {
            return s;
        }

        if(s.val < e.val)
        {
            tamp.val = s.val;
            tamp.next = sort(s.next,e);
            return tamp;
        }
        else
        {
            tamp.val = e.val;
            tamp.next = sort(s,e.next);
            return tamp;
        }
    }

}
