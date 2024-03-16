package OOPS;

import java.util.List;
import java.util.Vector;

public class VectorClass
{
    public static void main(String[] args) {

        // it formats look like Arraylist
        // but it functionality is synchronized
        // it will only use one thread at time
        List<Integer> vector = new Vector<>();

        vector.add(23);
        vector.add(22);
        vector.add(21);
        vector.add(20);

        System.out.println(vector);
    }
}
