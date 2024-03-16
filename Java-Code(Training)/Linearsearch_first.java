import java.util.Arrays;

public class Linearsearch_first {
    public static void main(String[] args) {

        int[] d ={-1,-2,-3,-22,-5,-478,-699};
        findmax(d);   
        int[] a ={1,2,3,22,0,-5,478,699};
        int target = -5;
        FindTarget(a,target);
        findmini(a);

        String[] b = {"rossi","hari"};
        char targetb = 'a';
        System.out.println(Arrays.toString(b));
        findchar(b,targetb);

        String[][] c = {{"hari","rama","KRISHNAN"},
                        {"money","power","knowlage"},
                        {"java","linux"}};  
       String x = "knowlage";
       findStr(c,x);                 
    }

    private static void findmax(int[] d) 
    {
      int b = Integer.MIN_VALUE;
      for (int i = 0; i < d.length; i++) 
      {
        if(b<d[i])
        {
          b = d[i];
        }
      }
      System.out.println(b+" is the beggest");
    }
    

    private static void findmini(int[] a) 
    {
      int b = Integer.MAX_VALUE;
      for (int i = 0; i < a.length; i++) 
      {
        if(b>a[i])
        {
          b = a[i];
        }
      }
      System.out.println(b+" is the smallest");
    }

    private static void findStr(String[][] c, String x) 
    { 
      
      for (int i = 0; i < c.length; i++) 
      {
       for (int j = 0; j < c[i].length; j++) 
       {
           if(c[i][j]==x)
           {
            System.out.println(x+" target in the index number of ["+i+"]["+j+"]");
            return;
           }
       } 
      }
      System.out.println("not found");

    }

    private static void findchar(String[] b, char targetb) 
    { 
      String a ;
      char y;

      for (int i = 0; i < b.length; i++) 
      {
        a = b[i];
      
      for (int j = 0; j <a.length(); j++) 
      {
        y = a.charAt(i);
        if(y==targetb)
        {
          System.out.println(targetb+" is available in the array ");
          return;
        }
           
      }
      System.out.println("not available "); 
      }

    }

    private static void FindTarget(int[] a, int target)
    {
      for (int i = 0; i < a.length; i++) 
      {
        if(a[i]==target)
        {
        System.out.println(target+" in the index number "+i);
        return ;
        }
        
      }
      System.out.println(" not found ");

    }
}
