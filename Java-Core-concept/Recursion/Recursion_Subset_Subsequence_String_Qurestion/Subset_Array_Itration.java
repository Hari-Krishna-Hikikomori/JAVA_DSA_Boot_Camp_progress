package JAVA.Recursion_Subset_Subsequence_String_Qurestion;

import java.util.ArrayList;
import java.util.List;

public class Subset_Array_Itration {
    public static void main(String[] args) {
        int[] arr = {1, 2,2,3,3,4};

        Knulsubset(arr);
        MySubset(arr);

    }

    private static void MySubset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int i = 0; i < arr.length; i++) {

            int n = outer.size();
            int j = i > 0 ? i - 1 : arr.length - 1;
            int l = 0;
            if (arr[i] == arr[j] && i > 0) {
                l = n / 2 ;
            }
            for (l = l; l < n; l++) {
                List<Integer> inner = new ArrayList<>(outer.get(l));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        System.out.println(outer);
    }

    private static void Knulsubset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);

            }
        }
        System.out.println(outer);
    }
}
