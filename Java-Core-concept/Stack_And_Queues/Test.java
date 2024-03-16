package Stack_And_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test
{
    public static void main(String[] args) throws Exception {

        CoustemStack test = new CoustemStack(5);
        Circule_Queues queue = new Circule_Queues(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.remove());
        queue.add(5);
        System.out.println(queue.removeLast());
        queue.add(6);
        System.out.println(queue.peek());
        queue.add(7);
        queue.add(8);
        queue.getall();

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        test.push(6);
        test.removeFirst();

        test.getall();
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        test.push(6);
        test.getall();

    }
}
