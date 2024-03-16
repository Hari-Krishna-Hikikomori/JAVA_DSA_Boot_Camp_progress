package Assignment;

public class Armstrong 
{
  public static void main(String[] args) 
  {
      int a   = 163;
      int b   = 1634;
     checkArmstorng(a,b);
      

     
  }

private static void checkArmstorng(int a, int b)
{
    
   
    if(findArmstorng(a)==1)
    {
        System.out.println("a is the armstrong number");
    }
    else if(findArmstorng(b)==1)
    {
        System.out.println("b is the armstrong number");
    }
    else System.out.println("no...! not a armstrong number");
}

private static int findArmstorng(int a) 
{
    int l  = (int) Math.log10(a) + 1;
    int com = a;
    int aws = 0;
    
    while(a>0)
    {
       int temp = a % 10;
           a = a/10; 
       int s = 0;
       for (int i = 2; i < l; i++) 
       {
          s =+(temp*temp);
          temp = s;
       }
       aws = aws+ s;
    }
    if(com==aws)return a = 1;
    else return a-1;

}    
}
