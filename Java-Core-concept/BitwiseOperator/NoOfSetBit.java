package BitwiseOperator;

public class NoOfSetBit {
   public static void main(String[] args) 
   {
      int num = 5;
      System.out.println(Count(num)); 
   }

private static int Count(int num) {
    int count = 0;
    while (num > 0) 
    {
       num = num - (num & ((~num)+1));
       count++;    
    }
    return count;
} 
   
}
