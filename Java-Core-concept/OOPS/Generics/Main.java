package OOPS.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        CustemArrayList<Integer> carraylist = new CustemArrayList<>();

        for (int i = 1; i <=5; i++) {
            arraylist.add(i);
            carraylist.set(i);
        }

        System.out.println(arraylist);
        System.out.println(carraylist);

        carraylist.set(5,6);
     //   arraylist.add(8,6);
        System.out.println(carraylist);
        System.out.println(arraylist);

    }
}
