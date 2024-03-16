package JAVA.Permutation;

import java.util.ArrayList;

public class permutation_StringWithSubset {
    public static void main(String[] args) {
        String str = "abcd";
        permut(str);
    }

    private static void permut(String str) {
        String right = ""+str.charAt(0);
        String left = str.substring(1);
        permutation(right,left);
        System.out.println(permutations(right,left));
        System.out.println(permutation_count(right,left));
            }

    private static void permutation(String right, String left) {
        if(left.isEmpty())
        {
            System.out.println(right);
            return;
        }
        for (int i = 0; i < right.length()+1 ; i++) {

            String temp = right.substring(0,right.length()-i) + left.charAt(0)+right.substring(right.length()-i);

            permutation( temp,left.substring(1));

        }
    }
    private static ArrayList<String> permutations(String right, String left) {
        ArrayList<String> ans = new ArrayList<>();
        if(left.isEmpty())
        {
            ans.add(right);
            return ans;
        }
        for (int i = 0; i < right.length()+1 ; i++) {

            String temp = right.substring(0,right.length()-i) + left.charAt(0)+right.substring(right.length()-i);

            ans.addAll(permutations( temp,left.substring(1)));
        }
        return ans;

    }
    private static int permutation_count(String right, String left) {
        int count = 0;
        if(left.isEmpty())
        {

            return 1;
        }
        for (int i = 0; i < right.length()+1 ; i++) {

            String temp = right.substring(0,right.length()-i) + left.charAt(0)+right.substring(right.length()-i);

            count = count + permutation_count( temp,left.substring(1));

        }
        return count;
    }
}
