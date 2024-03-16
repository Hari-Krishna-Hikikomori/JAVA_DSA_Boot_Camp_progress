package JAVA.Permution_Sunset_Questions;

import java.util.ArrayList;
import java.util.List;

public class Dicethrow {
    public static void main(String[] args) {
        int dice = 5;
        ArrayList<String>  ans = new ArrayList<>(Dthrow(dice));
        System.out.println(ans);
    }

    private static List<String> Dthrow(int dice) {
        ArrayList<String> ans = new ArrayList<>(Throw("", dice));
        return ans;
    }

    private static List<String> Throw(String s, int dice) {
        ArrayList<String> ans = new ArrayList<>();
        if(dice == 0)
        {
            ans.add(s);
            return ans;
        }
        for (int i = 1; i <= dice; i++) {

            ans.addAll(Throw(s+i,dice -i));
        }
        return ans;
    }
}
