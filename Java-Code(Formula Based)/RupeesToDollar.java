package Assignment;
import java.util.Scanner;

public class RupeesToDollar
{
   public static void main(String[] args) 
   {
      double amt = 0;
      boolean s = true; 
     while(s)
     {
        System.out.println("To Convert to Rupees To USD  - Enter ('USD')");
        System.out.println("To Convert to USD To Rupees  - Enter ('Rupees')");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
     switch (a) {
        case "USD":

        System.out.println("enter the Rupees");
        amt = in.nextInt();
        amt = amt / 81.99;
        System.out.println(amt+".USD");

        break;

        case "Rupees":

        System.out.println("enter the Dollar");
        amt = in.nextDouble();
        amt = amt * 81.99;
        System.out.println(amt+".rs");
            
        break;
        
        case "stop":
        s = false;
        break;

        case "":
        break;

        default:
          System.out.println("type wrong Word ");
        break;
          }
          System.out.println("TO STOP LOOP ENTER(stop)");
    }    
     }
      
       
   }