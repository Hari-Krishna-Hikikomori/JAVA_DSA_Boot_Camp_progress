package Maths;

public class HCF_And_GCD {
    public static void main(String[] args) {
        
        int a = 12;
        int b = 18;



        greatestCommonfactor_HCF(a,b);
        System.out.println("GCD of ("+a+","+b+") is "+greatestCommondivisor_GCF(a, b));
        LCM(a,b);
    }

    

    private static void LCM(int a, int b) 
    {
        int lac = a*b / greatestCommondivisor_GCF(a, b);
        System.out.println("LCM of ("+a+","+b+") is "+lac );
    }



    private static int greatestCommondivisor_GCF(int a, int b) 
    {
         if(a==0)
         {
            return b;
         }
    
        return greatestCommondivisor_GCF(b%a,a);
    }



    private static void greatestCommonfactor_HCF(int a, int b) 
    {
        int common = 1;
        int small = (a > b) ? b:a;
              
            for (int i = 1; i <= small; i++) 
            {
                   if( a % i == 0 && b % i == 0)
                   {
                     common = i;
                   } 
            }
       System.out.println("common factors of "+a+" and "+b+" is "+common);
    }
}
