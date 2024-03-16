import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    
    public static void main(String[] args) 
    { 
        System.out.println("wellcome to arraylist");
        ArrayList<Integer> arr = new ArrayList<>(10);
        
        Scanner in = new Scanner(System.in);
       
       out:
       
        while(true)
        {
        System.out.println("Enter 'create' to new arraylist" ); 
        System.out.println("Enter 'set' to replace new value in given index" );
        System.out.println("Enter 'add' to add new value in arraylist" );
        System.out.println("Enter 'get' to get the all value of arraylist" );
        System.out.println("Enter 'remove' to remove value from give index number" );
        System.out.println("Enter 'swap' to swap this number to that number and that to this number" );
        System.out.println("Enter 'max' to find biggest number in Arraylist" );
        System.out.println("Enter 'clarall' to clar all  value that you been assign arraylist" );
        System.out.println("Enter 'stop' to end the process" );
        String a = in.nextLine();
        int[] arr2 = {12,3454,22,62,7896};
            
        
          
          switch (a) {
            
            case "create":
            int num;
            System.out.println("enter the value");
            System.out.println("if want stop entering value press '0'");
            while (true) 
            {
            num = in.nextInt();
            if(num>0)
            {
            arr.add(num);
            }
            else
            {
                break;
            }      
            }
            
            break;   
            

            case "add":
            System.out.println("enter the value");
            System.out.println("if want stop entering value press '0'");
            while (true) 
            {
            num = in.nextInt();
            if(num>0)
            {
            arr.add(num);
            }
            else
            {
                break;
            }      
            }   
            break;

            case "set":

            System.out.println("enter the index number");
            num = in.nextInt();
            System.out.println("now enter the value");
            int set = in.nextInt();
            try 
            {
                arr.set(num, set);
            } catch (Exception e) {
                System.out.println("give valid index number"+e);
            }       
            break;

            case "remove":

            num = in.nextInt();
            System.out.println("enter the index number to remove");
            try 
            {
                arr.remove(num);
            } catch (Exception e) {
                System.out.println("give valid index number"+e);
            }  
            break;

            case "get":

            for (int i = 0; i < arr.size(); i++) 
            {
                try {
                    System.out.println(arr.get(i));
                    
                } catch (IndexOutOfBoundsException e) {
                    break;
                }
                    
            }
            break;
            case "swap":
            System.out.println(arr.toString());
            System.out.println("Enter the first Index number to Swap");
            int temp1 = in.nextInt();
            System.out.println("Enter the second Index number to Swap");
            int temp2 = in.nextInt();
            int temp3 = arr.get(temp1);
            int temp4 = arr.get(temp2);
                arr.set(temp2, temp3);
                arr.set(temp1, temp4);
            System.out.println(arr.toString());
            break;

            case "max":
            int emp=0;
            for (int i = 0; i < arr.size(); i++) 
            {
              
                    System.out.println(arr.get(i));
                    if(emp<arr.get(i))
                    {
                        emp = arr.get(i);
                    }
                    
            }
            System.out.println("'"+emp+"' is the biggest value");
            break;

            case "revers":
            System.out.println(arr.toString());
            int start = 0;
            int end = arr.size()-1;
            while(start < end)
            {
                int templ;
                int tampa;
                tampa = arr.get(end);
                templ = arr.get(start);
                arr.set(start, tampa);
                start++;
                arr.set(end, templ);
                end--;
            }
            System.out.println(arr.toString());
            break;
            
            case "even":
            int result =0;
            for (int i = 0; i < arr2.length; i++) 
            {
                int eve =0; 
                int temp = 0;
                temp = arr2[i];
                while (temp>0)
                {
                    int rem = temp % 10;
                    if(rem>0)
                    {
                        
                        eve ++;
                    }
                    temp= temp/10;

                }
                if(eve%2==0)
                {
                   result ++;
                }
                eve = 0;
            }
            System.out.println(result);

            break;

            case "clarall":
            arr.removeAll(arr);    
            break;
            
            case "stop":
            break out;

            case "":
            System.out.println("");
            break;

            default:
            System.out.println("Enter Invalid Words or Number");
            break;
          }
          
        }
    }
    
    



}
