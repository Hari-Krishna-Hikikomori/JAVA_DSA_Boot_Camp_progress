package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int num = 36;
        factorsNum(num);
    }

    private static void factorsNum(int num) 
    {
        ArrayList <Integer> arr = new ArrayList<>();
        int n = 1;
        while(n <=Math.sqrt(num))
        {
            if(num % n == 0)
            { 
                if(num/ n == n)
                { 
                     System.out.print(n+",");
                }
                else
                {
                    System.out.print(n+",");
                    arr.add(num/n);
                }
                
            } 
            n++;
        }
        for (int i = arr.size()-1; i >= 0; i--) 
        { 
         if(i==0) System.out.println(arr.get(i)+".");
         else   System.out.print(arr.get(i)+",");   
        }
    }
}
