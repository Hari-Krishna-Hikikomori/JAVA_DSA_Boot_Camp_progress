package JAVA;

import java.util.ArrayList;


public class Array_LinearSearch_And_Arraylist{
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,2,42,1,7};
        linearSearch(arr,7);
    }

    private static void linearSearch(int[] arr,int tar)
    {

        search(arr,tar,0);
        ArrayList<Integer> list = arrlist(arr,tar,0, new ArrayList<>());      // this is right way if return clone value index in  Arraylist.
        ArrayList<Integer> arrlist = new ArrayList<>(Kunnal_arrlist(arr,tar,0));// this
        ArrayList<Integer> Array = new ArrayList<>(MY_arrlist2(arr,tar,0));// and this two are to test the thought process

        System.out.println(list);
        System.out.println(arrlist);
        System.out.println(Array);
    }

    private static ArrayList<Integer> arrlist(int[] arr, int tar, int i,ArrayList<Integer> list)
    {
        if(i==arr.length)
        {
            return list;
        }
        if (arr[i]==tar)
        {
            list.add(i+1);
        }
        return arrlist(arr, tar, ++i,list);
    }
    private static ArrayList<Integer> MY_arrlist2(int[] arr, int tar, int i)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length)
        {
            return list;
        }
        if (arr[i]==tar)
        {
            list.add(i+1);
            list.addAll(MY_arrlist2(arr, tar, ++i));
            return list;
        }
        return MY_arrlist2(arr, tar, ++i);
    }
    private static ArrayList<Integer> Kunnal_arrlist(int[] arr, int tar, int i)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length)
        {
            return list;
        }
        if (arr[i]==tar)
        {
            list.add(i+1);
        }
        ArrayList <Integer> Store = new ArrayList<>(Kunnal_arrlist(arr, tar, ++i));
        list.addAll(Store);
        return list;
    }

    private static void search(int[] arr, int tar, int i)
    {
        if (i == arr.length-1 && arr[i] != tar)
        {
            System.out.println("Searching number not in the Array");
            return;
        }
        if(arr[i]== tar)
        {
            System.out.println("Target value "+tar+" at the inDex number "+(i+1));
            return;
        }

        search(arr,tar,++i);
    }
}
