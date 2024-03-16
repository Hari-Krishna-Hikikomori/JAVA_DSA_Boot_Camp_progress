package Maths;
public class Sqrt {
    public static void main(String[] args) {
        int num = 20;
        int p   = 15;
        sqrt(num,p);

    }

    private static void sqrt(int num, int p) 
    {
        int st = 0;
        int end = num;

        
        while (st <= end) {
          
            int mid = st + (end - st) /2;

            if(mid *  mid == num)System.out.println("Square of root "+num+" = "+mid);
            
            if(mid * mid < num) st = mid +1;
            else end = mid -1;                 
        }
        double root = end;
        double dble = 0.1;

        for (int i = 1; i <= p; i++) 
        {
           while (root * root <= num) 
           {
               root += dble; 
           }
           
        //    if(i == p) break;

           root -=dble;
           dble = dble/10;      
        }
        System.out.println(root);
    }
    
}
