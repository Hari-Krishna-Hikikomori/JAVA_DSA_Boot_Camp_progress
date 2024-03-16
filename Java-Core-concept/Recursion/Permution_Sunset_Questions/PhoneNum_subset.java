package JAVA.Permution_Sunset_Questions;

import java.util.ArrayList;
import java.util.List;

public class PhoneNum_subset {
    static List<List<String>> outer = new ArrayList<>();
    public static void main(String[] args) {


        String num = "23";
        int numb = Character.getNumericValue(num.charAt(0)) -1;
        System.out.println(numb);
        String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for (String s : arr) {
            List<String> inner = new ArrayList<>();
            inner.add(s);
            outer.add(inner);
        }
        System.out.println(outer.get(1));
        split("23");
    }
    static void split(String digits)
    {
        ArrayList<String> store = new ArrayList<>();
        if(digits.isEmpty())
        {
            return ;
        }

        for (int i = 0; i < digits.length() ; i++){

            store.add(outer.get(Character.getNumericValue(digits.charAt(i))-1).get(0));
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < store.get(0).length() ; i++) {
            ans.addAll(letterCombinations("",store.get(0).charAt(i)+""));
        }
        if(store.size() > 1)
        {
            ArrayList<String> ans1 = new ArrayList<>(3^ ans.size());
            for (int i = 0; i <= store.size(); i++) {
                ans1.addAll(letterCombinations(ans.get(i),store.get(1)));
            }
            ans = ans1;
        }
        System.out.println(ans);
    }
    static List<String> letterCombinations(String right,String left)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(left.isEmpty())
        {
            return ans;
        }

        ans.add(right+left.charAt(0));
        ans.addAll(letterCombinations(right,left.substring(1)));
        return ans;
    }


}
