package Linklist;

import java.util.Arrays;

// Definition for singly-linked list.
   class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {
    public static ListNode sortList(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        ListNode tail = head;
        while(tail != null && tail.next != null)
        {
            tail = tail.next.next;
        }
        return split(head,tail);
    }
    private static ListNode split(ListNode start, ListNode end)
    {

        if(start == null) return null;
        if(start == end) return new ListNode(start.val);

        ListNode tamp = start;
        ListNode mid = start;
        while(tamp != null && tamp.next != null && tamp != end && mid.next != end)
        {
            tamp = tamp.next.next;
            mid = mid.next;
        }
        ListNode s = start.next == end && end != null? new ListNode(start.val) : split(start, mid);
        ListNode e = start.next == end && end != null? new ListNode(end.val) : split(mid.next, end);

        start.next = sort(s,e);

        return start.next;
    }

    private static ListNode sort(ListNode s, ListNode e)
    {
        ListNode ans = new ListNode();
        ListNode tamp = ans;
        ListNode left = s;
        ListNode righ = e;

       while(left != null && righ !=null)
       {

           if (left.val < righ.val) {
               tamp.next = new ListNode(left.val);
               left = left.next;
               tamp = tamp.next;
           } else {
               tamp.next = new ListNode(righ.val);
               righ = righ.next;
               tamp = tamp.next;
           }
       }
       while (left != null)
       {
              tamp.next = new ListNode(left.val);
              left = left.next;
              tamp = tamp.next;
       }
       while (righ != null)
       {
              tamp.next = new ListNode(righ.val);
              righ = righ.next;
              tamp = tamp.next;
       }

       return ans.next;
    }
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1); // Sort left sub-array
            quickSort(array, pivotIndex + 1, high); // Sort right sub-array
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Choose the pivot (in this case, the last element)
        int pivot = array[high];
        int i = low - 1; // Index of the smaller element

        // Iterate through the array and move elements less than the pivot to the left
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot (array[high]) with the element at index i + 1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index of the pivot
        return i + 1;
    }
        public static void main(String[] args)
    {
      ListNode head = new ListNode(4,new ListNode(2,new ListNode(1,new ListNode(3,new ListNode(5,null)))));
      ListNode head2 = new ListNode(1,new ListNode(2));
      ListNode tamp = Solution.rotateRight(head2,1);

      Solution.reorderList(head2);
//      tamp = head2;
      while (tamp != null)
      {
          System.out.print(tamp.val+"->");
          tamp = tamp.next;
      }
        System.out.println("NUll");

        int[] array = {6, 2, 8, 5, 3, 9, 1};
         quickSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static ListNode reverseList(ListNode head)
    {
        ListNode curr = head;
        ListNode prv ;
        ListNode next = null;

        while(curr != null)
        {
            prv = curr;
            curr = curr.next;
            prv.next = next;
            next = prv;
        }
        return next;
    }
    public static ListNode reverseBetween(ListNode head, int left, int right)
    {
        if(left == right)
        {
            return head;
        }
        ListNode curr = head;
        ListNode Next = new ListNode();
        ListNode prev = null;
        ListNode revtail = new ListNode();
        ListNode revhead = null;
        int pos = 1;

        while(curr != null)
        {
            if(pos == right)
            {
                prev = curr;
                curr = curr.next;
                prev.next = Next;
                Next = prev;
                revtail.next = curr;
                if(revhead == null)
                {
                    return Next;
                }
                else
                {
                    revhead.next = Next;
                }
                break;
            }
            if(pos >= left)
            {
                if(pos == left)
                {
                    revtail = curr;
                    Next = revtail;
                    curr = curr.next;
                    revtail.next = null;
                }else
                {
                    prev = curr;
                    curr = curr.next;
                    prev.next = Next;
                    Next = prev;

                }


            }else
            {
                revhead = curr;
                curr = curr.next;
            }
            pos ++;
        }
        return head;
    }
    public static boolean isPalindrome(ListNode head)
    {
        if(head == null || head.next == null) return true;
        ListNode curr = head;
        ListNode tamp = head;
        ListNode prv ;
        ListNode next = null;
        while (curr != null)
        {
            if(tamp != null && tamp.next != null)
            {
                tamp = tamp.next.next;

                prv = curr;
                curr = curr.next;
                prv.next = next;
                next = prv;
            }
            else
            {
                if(tamp != null)
                {
                    curr = curr.next;
                    tamp = tamp.next;
                }

                if(next.val != curr.val)
                {
                    return false;
                }

                next = next.next;
                curr = curr.next;
            }
        }

        return true;
    }
    public static void reorderList(ListNode head)
    {
        if(head == null) return ;

        ListNode curr = head;
        ListNode tamp = head;
        ListNode prv ;
        ListNode next = null;
        ListNode next2 = head;
        ListNode prv2 = head;
        ListNode curr2 = head.next;
        while (curr2 != null && next2 != null)
        {
            if(tamp != null && tamp.next != null && curr != null && curr.next != null)
            {
                tamp = tamp.next.next;
                curr = curr.next;
            }else if(curr != null)
            {
                prv = curr;
                curr = curr.next;
                prv.next = next;
                next = prv;
                next2 = next;
            }
            else
            {

                prv2.next = next2;
                next2 = next2.next;
                prv2 = prv2.next;
                prv2.next = curr2;
                curr2 = curr2.next;
                prv2 = prv2.next;
            }
        }
     }
    public static ListNode reverseKGroup(ListNode head, int k)
    {
        if( k == 0 || head == null||head.next == null)return head;

//        ListNode tamp =  head;
//        int total = 0;
//        while(tamp != null && tamp.next != null)
//        {
//            tamp = tamp.next.next;
//            total += 2;
//        }
//        if(tamp != null)
//        {
//            total += 1;
//        }
//        total = total / k;
//
//        for (int i = 0; i < total; i++)
//        {
//            head = reverseBetween(head,k*i+1,k*(i+1));
//        }
        ListNode check = head;
        ListNode cur = head;
        ListNode tamp = null;
        ListNode tamptail = null;
        while (cur != null)
        {
            ListNode tail = null;
            ListNode prv = null;
            ListNode next = null;

            for (int i = 0; i < k; i++)
            {
                if(check == null)
                {
                    return head;
                }
                check = check.next;
            }
            while(cur != check)
            {
                    tail = tail == null ? cur : tail;

                    prv = cur;
                    cur = cur.next;
                    prv.next = next;
                    next = prv;
            }
            tamptail = tamptail == null ? tail : tamptail;
            tamp = tamp == null ? next : tamp;
            tail.next = cur;
            tamptail.next = next == tamp ? cur : next;
            tamptail = tail;
            head = tamp;

        }
        return head;
    }
    public  static ListNode rotateRight(ListNode head, int k)
    {
        if(k == 0 || head == null || head.next == null)
        {
            return head;
        }

        int size = 0;
        ListNode Oldhead = head;
        ListNode last = head;
        while(Oldhead != null && Oldhead.next != null)
        {
            size += 2;
            if(Oldhead.next.next == null)
            {
                last = Oldhead.next;
            }else {last = Oldhead;}

            Oldhead = Oldhead.next.next;
        }
        if(Oldhead != null)
        {
            size += 1;
        }

        int times = k - ((k / size) * size);

        ListNode newhead = head;
        ListNode newend = head;
        int pos = 1;
        while(pos < size - times)
        {
            pos++;
            newend = newend.next;
        }
        last.next = head;
        newhead = newend.next;
        newend.next = null;
        head = newhead;

//        for (int i = 0; i < times; i++)
//        {
//
//            while (newhead != null && newhead.next != null)
//            {
//                if(newhead.next.next == null)
//                {
//                    newend = newhead;
//                    newhead = newhead.next;
//                }else if(newhead.next.next.next == null)
//                {
//                    newend  = newhead.next;
//                    newhead = newhead.next.next;
//                }else{
//                    newhead = newhead.next.next;
//                }
//            }
//                newend.next = null;
//                newhead.next = head;
//                head = newhead;
//        }
        return head;
    }
   }



