package BitwiseOperator;

public class NoOfdigitsBinary 
{
  public static void main(String[] args) {
    int n = 10;
    int base = 2;
    System.out.println("Numer of digits in "+n+" Base "+base+" is "+NoOfDigits(n,base));
  }

private static int NoOfDigits(int n,int b) 
{
    
    System.out.println((Math.log(n)/Math.log(b)));
    n = (int) ((Math.log(n)/Math.log(b))+1);
    return n;
}   
}
