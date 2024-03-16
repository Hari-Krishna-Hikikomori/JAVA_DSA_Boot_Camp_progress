import java.util.Scanner;

public class calculaterwithwhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("chose the math oprator to calculate");
            System.out.println("or press 'a' or 'A' to end");
            System.out.println(" '+'    '-'    '*'    '/'   '%' "); 
            char opp = in.next().charAt(0);
            if(opp =='a'|| opp=='A')
            {
                break;
            }
            System.out.print("enter fist the value    ");
            int x = in.nextInt();
            System.out.print("enter second the value  ");
            int y = in.nextInt();
            if(opp =='+')
            {
                System.out.println(x+y);
            }
            if(opp =='-')
            {
                System.out.println(x-y);
            }
            if(opp =='*')
            {
                System.out.println(x*y);
            }
            if(opp =='/')
            {
                if(x==0 || y==0)
                {
                    int i;
                    System.out.println(i=Math.max(x,y));
                }
                else
                {
                    System.out.println(x/y);
                }
            }
            if(opp =='%')
            {
                System.out.println(x%y);
            }
            
        }


    }
}
