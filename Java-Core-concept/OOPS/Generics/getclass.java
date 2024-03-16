package OOPS.Generics;

public class getclass<T> extends Setclass
{
    public void get()
    {
        System.out.print("[");
        for (Object j : arr) {
            if(j != null) {
                System.out.print((T)(j) + ",");
            }
        }
        System.out.println("]");
    }
    public T get(int index)
    {
        return (T)(arr[index]);
    }



}
