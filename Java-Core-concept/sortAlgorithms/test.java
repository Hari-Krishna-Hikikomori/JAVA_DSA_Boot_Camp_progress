import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        int[] arr1 = {99,23,34,567,0,-1};
        int[] arr2 = {1,0,1,0,1,0,1,0,-1};
        int[] arr3 = {-1,-1,-1,1,1,1,0};
        int[] arr4 = {5,4,3,2,1,0};
        int[] arr5 = {5,4,3,2,1};
        SortAlgorithms obj = new SortAlgorithms();
        System.out.println("selectionSort test");
        System.out.println();
        obj.selectionSort(arr);
        obj.selectionSort(arr1);
        obj.selectionSort(arr2);
        obj.selectionSort(arr3);
        obj.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println();
        System.out.println("insertSort test");
        System.out.println();
        obj.insertSort(arr1);
        obj.insertSort(arr2);
        obj.insertSort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println();
        System.out.println("bubbleSort test");
        System.out.println();
        obj.bubbleSort(arr);
        obj.bubbleSort(arr1);
        obj.bubbleSort(arr2);
        obj.bubbleSort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println();
        System.out.println("cycleSort test");
        System.out.println(); 
        obj.cycleSort(arr4);
        obj.cycleSort_One(arr5);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
    }
}
