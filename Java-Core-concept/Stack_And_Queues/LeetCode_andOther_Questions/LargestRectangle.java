package Stack_And_Queues.LeetCode_andOther_Questions;

import java.util.Stack;

public class LargestRectangle
{
        public static int largestRectangleArea(int[] heights)
        {
            int bignum = 0;
            int size   = 0;
            for (int i = 0; i < heights.length; i++)
            {
                size = heights[i] > 0 ? size+1 : 0;
                int tamp  = 0;
                int count = 1;
                int small = heights[i];
                for (int j = i; j >= 0; j--)
                {
                    if(heights[j] == 0)
                    {
                        break;
                    }
                       small = small > heights[j] ? heights[j] : small;
                       if(tamp <= small * count)
                       {
                           tamp = small * count;
                       }


                        count++;

                }
                bignum = Math.max(tamp,bignum);
            }
            return Math.max(bignum,size);
        }
    public static int largestRectangleArea_Mark_2(int[] heights)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int max = 0;

        for (int i = 1; i < heights.length; i++)
        {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()])
            {
                max = getMaxs(stack,heights,max,i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while(!stack.isEmpty())
        {
            max = getMaxs(stack,heights,max,i);
        }
        return max;
    }

    private static int getMaxs(Stack<Integer> stack, int[] arr, int max, int current)
    {
        int area = 0;
        int pop  = stack.pop();

        if(stack.isEmpty())
        {
            area = arr[pop] * current;
        }
        else
        {
            area = arr[pop] * (current - 1 - stack.peek());
        }

        return Math.max(max,area);
    }

    public static int largestRectangleArea_Kunal(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }


    public static void main(String[] args)
        {
            int[] arr = {2,1,5,6,2,3};
            System.out.println(largestRectangleArea_Mark_2(arr));
        }
}
