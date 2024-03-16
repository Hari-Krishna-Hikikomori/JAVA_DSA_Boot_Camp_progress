package Stack_And_Queues.LeetCode_andOther_Questions;

import java.util.Stack;

public class Parantheses
{
    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        s = s.trim();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
            {
                stack.pop();
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
            {
                stack.pop();
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() != '[')
            {
                stack.pop();
            }else
            {
                return false;
            }
        }
        return true;

    }
    public static boolean isValid_kunal(String s)
    {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }else
            {
                if(ch == ')' )
                {
                    if (stack.isEmpty() || stack.pop() != '(')
                    {
                        return false;
                    }
                }
                if(ch == ']' )
                {
                    if (stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                }
                if(ch == '}' )
                {
                    if (stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                }

            }
        }


        return stack.isEmpty();
    }
    public static int minAddToMakeValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        s = s.trim();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == ')' )
            {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
            {
                stack.pop();
            }

        }

        return stack.size();
    }

    public static int minInsertions(String s)
    {

        Stack<Character> stack = new Stack<>();
        int open  = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ')' )
            {
               if(i+1 < s.length() && s.charAt(i+1) == ')')
               {
                   if(!stack.isEmpty() && stack.peek() == '(')
                   {
                       close -= 2;
                       stack.pop();
                   }
                   else
                   {
                       open += 1;
                       stack.push(s.charAt(i));
                       stack.push(s.charAt(i+1));
                   }
                   ++i;
               }
               else
               {
                   if(!stack.isEmpty() && stack.peek() == '(')
                   {
                       stack.pop();
                       open -= 1;
                       close = close == 0 ? 1 : close;
                   }
                   else
                   {
                       open += 1;
                       close += 1;
                   }
               }
            }
            else
            {
                stack.push(s.charAt(i));
                close += 2;
            }

        }

        return open + close;
    }

    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minInsertions(s));
    }
}
