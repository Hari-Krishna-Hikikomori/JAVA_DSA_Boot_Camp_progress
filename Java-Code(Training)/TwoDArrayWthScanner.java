import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayWthScanner
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) 
        {
            
            label:
            for (int j = 0; j <5; j++) 
            {
               String a;
               a = in.next(); 
               
               

                if( a.charAt(0) =='c')
                {
                 ++i;
                 break label;
                }
                try {
                    int number = Integer.parseInt(a);
                    arr[i][j] = number;
                } catch (Exception e) {
                    System.out.println("invalid input");
                    j--;
                }
               
            }
            
        }

        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {

              System.out.print(arr[i][j]);
            }

            System.out.println();
        }
        
    }
    
}
