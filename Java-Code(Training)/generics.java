class FINDmax<T extends Comparable<T> > {
    public T find(T[] arr) {
        
        T max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class generics {
    public static void main(String[] args) {
        FINDmax<Integer> a = new FINDmax<>();
        Integer arrs [] = {1, 2, 3, 4, 5, 11, 7, 8, 9, 10};
        
        System.out.println(a.find(arrs));
    }
}
