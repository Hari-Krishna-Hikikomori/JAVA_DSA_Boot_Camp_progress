package Stack_And_Queues.LeetCode_andOther_Questions;

import java.util.Stack;
class MyQueue
{
    private Stack<Integer> helper;
    MyQueue()
    {
        helper = new Stack<>();
    }
    public void push(int x)
    {
        if(helper.empty())
        {
            helper.push(x);
            return;
        }
        Stack<Integer> tamp = new Stack<>();
        while(!helper.empty())
        {
            tamp.push(helper.pop());
        }
        tamp.push(x);
        while(!tamp.empty())
        {
            helper.push(tamp.pop());
        }
    }

    public int pop()
    {
        return helper.pop();
    }

    public int peek()
    {
        return helper.peek();
    }

    public boolean empty()
    {
        return helper.empty();
    }
}
public class Implement_Queue_using_Stacks
{


    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
    }
}
