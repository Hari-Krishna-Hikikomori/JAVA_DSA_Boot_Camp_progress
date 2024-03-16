package BitwiseOperator;

public class FindtheNthMagicNum {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(FindmMgicNum(n));
        System.out.println(KunalMagicNum(n));
    }

    private static int KunalMagicNum(int n) 
    {
        int ans  = 0;
        int base = 5;
        while (n > 0) 
        {
         int last = n & 1;
         n = n >> 1;
         ans += last * base;
         base = base * 5;   
        }
        return ans;
    }

    private static int FindmMgicNum(int i) 
    {

      int num = 0;
      
      for (int j = 1; j < 8; j++) 
      {
        if((i & 1) == 1) num = (int)(num + Math.pow(5, j));
        i = i >> 1;       
      }
        return num;
    }
}
