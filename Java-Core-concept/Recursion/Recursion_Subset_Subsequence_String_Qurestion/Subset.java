package JAVA.Recursion_Subset_Subsequence_String_Qurestion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        String emt = new String();

        sub(emt,str);
        subAscii(emt,str);
        System.out.println(sub1(emt,str));
        System.out.println(sub1Ascii(emt,str));

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    System.out.println(str.charAt(i));
                }
                else
                {
                    System.out.println(""+str.charAt(i) + str.charAt(j));
                }
            }
        }
    }


    private static void sub(String str,String skip)
    {
      if(skip.isEmpty())
      {
          System.out.println(str);
          return;
      }

      sub(str+skip.charAt(0),skip.substring(1));
      sub(str,skip.substring(1));
    }
    private static ArrayList<String> sub1(String str, String skip)
    {
        ArrayList<String> sub = new ArrayList<>();
        if(skip.isEmpty())
        {
            sub.add(str);
            return sub;
        }

        sub.addAll(sub1(str+skip.charAt(0),skip.substring(1)));
        sub.addAll(sub1(str,skip.substring(1)));

        return sub;
    }
    private static void subAscii(String str,String skip)
    {
        if(skip.isEmpty())
        {
            System.out.println(str);
            return;
        }

        subAscii(str+skip.charAt(0),skip.substring(1));
        subAscii(str,skip.substring(1));
        subAscii(str+(skip.charAt(0)+0),skip.substring(1));
    }
    private static ArrayList<String> sub1Ascii(String str, String skip)
    {
        ArrayList<String> sub = new ArrayList<>();
        if(skip.isEmpty())
        {
            sub.add(str);
            return sub;
        }

        sub.addAll(sub1Ascii(str+skip.charAt(0),skip.substring(1)));
        sub.addAll(sub1Ascii(str,skip.substring(1)));
        sub.addAll(sub1Ascii(str+(skip.charAt(0)+0),skip.substring(1)));

        return sub;
    }
}
