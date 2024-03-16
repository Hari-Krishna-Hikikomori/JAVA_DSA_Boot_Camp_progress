package Stack_And_Queues.LeetCode_andOther_Questions;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class GameOFtwoStacks
{
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        int[] a1 =
                // {19, 9, 8, 13, 1, 7, 18, 0, 19, 19, 10, 5, 15, 19, 0, 0, 16, 12, 5, 10};
                   {4,2,4,6,1};
        int[] b1 = //{11, 17, 1, 18, 14, 12, 9, 18, 14, 3, 4, 13, 4, 12, 6, 5, 12, 16, 5, 11, 16, 8, 16, 3, 7, 8, 3, 3, 0, 1, 13, 4, 10, 7, 14
//        };
                   {2,1,8,5};
        for (int j : a1) {
            a.push(j);
        }
        for (int j : b1) {
            b.push(j);
        }

//        System.out.println(Score(a, b, 64));
        System.out.println(ScoreRecursion(10,a,b,0,0) - 1);

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int[] arr_a = new int[n];
            int[] arr_b = new int[m];
            for (int j = 0; j < n; j++) {
                arr_a[j] = s.nextInt();
            }
            for (int j = 0; j < m; j++) {
                arr_b[j] = s.nextInt();
            }
            System.out.println(twoStacks(x, arr_a, arr_b));
        }
    }


    private static int Score(Stack<Integer> stack_a, Stack<Integer> stack_b, int max)
    {
        int count  = 0;
        int small  = 0;
        int second = stack_a.peek();
        int total = 0;

        Stack<Integer> tamp_a = new Stack<>();
        Stack<Integer> tamp_b = new Stack<>();

        while(total <= max)
        {
            while(!stack_a.empty())
            {
                second = second > stack_a.peek() && stack_a.peek() > small ? stack_a.peek() : second;

                if(small >= stack_a.peek())
                {
                    if(total + stack_a.peek() > max) return count + 1;
                    total += stack_a.pop();
                    count++;
                }else {
                    tamp_a.push(stack_a.pop());
                }
            }
            while(!stack_b.empty())
            {
                second = second > stack_b.peek() && stack_b.peek() > small? stack_b.peek() : second;

                if(small >= stack_b.peek())
                {
                    if(count + stack_b.peek() > max) return count + 1;
                    total += stack_b.pop();
                    count++;
                }else {
                    tamp_b.push(stack_b.pop());
                }
            }
            small = second;
            second = tamp_b.peek();
            while(!tamp_b.empty())
            {
                second = second > tamp_b.peek() && tamp_b.peek() > small ? tamp_b.peek() : second;

                if(small >= tamp_b.peek())
                {
                    if(count + tamp_b.peek() > max) return count + 1;
                    total += tamp_b.pop();
                    count++;
                }else {
                    stack_b.push(tamp_b.pop());
                }
            }
            while(!tamp_a.empty())
            {
                second = second > tamp_a.peek() && tamp_a.peek() > small? tamp_a.peek() : second;

                if(small >= tamp_a.peek())
                {
                    if(count + tamp_a.peek() > max) return count + 1;
                    total += tamp_a.pop();
                    count++;
                }else {
                    stack_a.push(tamp_a.pop());
                }
            }
            small = second;
            second = stack_a.peek();

        }

        return count;
    }
    private static int ScoreRecursion(int max,Stack<Integer> stack_a, Stack<Integer> stack_b,int total,int count)
    {
        if(total > max )
        {
            return count;
        }
        if(stack_a.empty() || stack_b.empty())
        {
            return count;
        }

            int tamp = stack_a.pop();
            int returnval1 = ScoreRecursion(max, stack_a, stack_b, total + stack_a.peek(), count + 1);
            stack_a.push(tamp);

            tamp = stack_b.pop();
            int returnval2 = ScoreRecursion(max, stack_a, stack_b, total + stack_a.peek(), count + 1);
            stack_b.push(tamp);
        return Math.max(returnval2, returnval1);
    }
    static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

}
