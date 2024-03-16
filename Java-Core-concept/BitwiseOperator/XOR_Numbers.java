package BitwiseOperator;

public class XOR_Numbers 
{ 
  public static void main(String[] args) {
    int from = 3;
    int to = 9;
    int b = count(from,to) ^ count(0, from -1);
    int a =  XorCount(from,to);
    System.out.println("XOR Method "+a);
    System.out.println("XOR "+b);
  }

private static int XorCount(int from, int to) 
{
    int ans = 0;
    while(from <=to)
    {
      ans = ans ^ from;
      System.out.println("XOR Method "+from+" = "+ans);
      from++;
    }
    return ans;
}

private static int count(int from, int to) 
{
    int ans =0;
    while (from <= to)
    {
        switch (from%4) {
            case 0:
                System.out.println("XOR "+from+" = "+from);
                ans = from;
                from++;
                break;
            case 1:
                System.out.println("XOR "+from+" = 1");
                ans = 1;
                from++;
                break;
            case 2:
                System.out.println("XOR "+from+" = "+(from+1));
                ans = from +1;
                from++;
                break;
            case 3:
                System.out.println("XOR "+from+" = 0");
                ans = 0;
                from++;
                break;            
        
            default:
                break;
        }
        
    }
    return ans;
}  
}
