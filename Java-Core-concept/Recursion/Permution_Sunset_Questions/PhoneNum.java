package JAVA.Permution_Sunset_Questions;

import java.util.ArrayList;
import java.util.Collection;

public class PhoneNum {
    public static void main(String[] args) {
        String digitis = "12345";
        ArrayList<String> ans = new ArrayList<>(Split(digitis));
        System.out.println(ans);
    }

    private static Collection<String> Split(String digitis) {
        return phoneN("",digitis);
    }

    private static Collection<String> phoneN(String right, String left) {
        ArrayList<String> ans = new ArrayList<>();
        if(left.isEmpty())
        {
            ans.add(right);
            return ans;
        }
        if(Character.getNumericValue(left.charAt(0)) == 1)
        {
          return phoneN(right,left.substring(1));
        }
        {}
        int count = (Character.getNumericValue(left.charAt(0))-2) *3;
        int end = count+3;
        if(Character.getNumericValue(left.charAt(0)) == 7)
        {
            end = count+4;
        }
        if(Character.getNumericValue(left.charAt(0)) == 8)
        {
           count = count+1;
           end = count +3;
        }
        if(Character.getNumericValue(left.charAt(0)) == 9)
        {
            count = count+1;
            end = count +4;
        }
        for (int i = count; i <end ; i++)
        {
             char a = (char) ('a'+i);
             ans.addAll(phoneN(right+a, left.substring(1)));

        }
        return ans;
    }
}
