import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
         
            char a = in.next().trim().charAt(0);   

            
          
                if(a <='a'&& a >='z')
                {
                    System.out.println("lowwer case");
                }
                else
                {
                    System.out.println("upper case");
                }
            
         

        
        
    }
    
}
