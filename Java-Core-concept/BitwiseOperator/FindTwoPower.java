package BitwiseOperator;

public class FindTwoPower 
{
  public static void main(String[] args) {
    int n = 8;
    System.out.println(n+" Have Two Power - "+FindPower(n));
  }

private static boolean FindPower(int n) 
{
    if(n == 0) return false;
    n = (n-1)& n;
    if(n==0)
    {
        return true;
    }
    
    return false;
}    
}
