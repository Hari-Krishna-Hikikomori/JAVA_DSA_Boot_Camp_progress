package Maths;

public class PrimeNumbers 
{
    public static void main(String[] args) {
        int num = 40;
        for (int i = 1; i <= 40; i++) {
            PrimeOrNot(i);
        }
        boolean []arr = new boolean[num+1];
        seive(num,arr);
    }

    private static void seive(int num, boolean[] arr) 
    {
                    // (i*i <= num) basically (sqt root of num)
        for (int i = 2; i*i <= num  ; i++) 
        {
            if(!arr[i-1]){
             // turn non prime into to True by multiplying prime num from 2 to (sqt root of num) 
               for (int j = i*i; j <=num; j += i)
               {
                 
                  arr[j-1] = true;
                  
               }
            }
        }
        for (int i = 1; i < num; i++) {
            
            // print False index as FOR - i
            if(!arr[i])
            {
               System.out.print(i+1+" ");
            }
        }
    }

    private static void PrimeOrNot(int num) 
    {
        if(num <= 1)
        {
            System.out.println(num+" Not a prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            
            if ( num % i==0) 
            {
                System.out.println(num+" Not a prime");
                return;
            }
            // else System.out.println("Not divisable by "+i);
        }
        System.out.println(num+" Prime Number ------- ");
    }
    
}
