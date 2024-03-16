class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void remove(int data) {
        if (this.head == null) {
            return;
        }
        System.out.println("head "+this.head.data);
        if (this.head.data == data) {
            this.head = this.head.next;
            System.out.println("new head "+this.head.data);
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            
                if(current.next.data==data){
                System.out.println("Current node: " + current.next.data);
                current.next = current.next.next;
            }
            
            
            current = current.next;
            System.out.println("new "+current.data);
            System.out.println("new "+current.next);
        }
    }

    void printList() {
        Node current = this.head;
        System.out.println(this.head.data);
        System.out.println("current "+current.data);
        System.out.println("current next "+current.next.data);
        System.out.println("current next "+current.next);
       
        while (current.next != null) {
            
            System.out.println(current+" "+current.data+" "+current.next+" "+current.next.data);
            current = current.next;
        }
        System.out.println("current "+current.next);
        current = current.next;
        System.out.println(current);
        
    }
}

public class LINK_LIST{ 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        list.printList();
    }
}
