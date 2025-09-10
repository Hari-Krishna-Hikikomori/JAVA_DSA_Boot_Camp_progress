package HEAPs;

import java.util.ArrayList;

public class Heap_Structure
{
    ArrayList<Integer> arr = new ArrayList<>();

    void heap(int val) {
        arr.add(val);
    }

    void heap_add(int val) {
        if (arr.isEmpty()) {
            arr.add(val);
            return;
        }

        heap_check(val);
    }

    void remove(int index)
    {
        int last = arr.getLast();
        arr.remove(arr.size()-1);
        arr.set(index,last);

        heap_revcheck(index);
    }

    private void heap_revcheck(int index)
    {
        while ((index * 2)+2 < arr.size())
        {
            int bigindex  = arr.get((index * 2)+1) > arr.get((index * 2)+2) ? (index * 2)+1 : (index * 2)+2;

            swap(bigindex,index);
            index = bigindex;
        }
    }

    private void heap_check(int val) {
        arr.addLast(val);
        int child = arr.size()-1;
        while (child > 0) {
            if ((child%2!=0) && (arr.get(child) > arr.get(child / 2)))
            {
                swap(child, child / 2);
            }
            if ((child%2==0) && (arr.get(child) > arr.get((child / 2)-1)))
            {
                swap(child, (child / 2)-1);
            }

            child = (child%2==0)  ? (child / 2)-1 : child / 2;
        }
    }

    private void swap(int child, int par) {
        int tamp = arr.get(child);
        arr.set(child,arr.get(par));
        arr.set(par,tamp);
    }

    void heap_print()
    {
        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i)+"    ");
        }
    }
}
