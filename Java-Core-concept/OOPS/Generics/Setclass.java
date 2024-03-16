package OOPS.Generics;

public class Setclass<T> extends vari {

    public void set(int index,T value)
    {
        if(index < arr.length-1)
        {
            arr[index] = value;
        }
        else
        {
            ExtendSize(arr,value,index);
        }
    }
    public void set(T value)
    {
        if(arr.length > size)
        {
            arr[size] = value;
            ++size;
            return;
        }

        ExtendSize(arr,value,arr.length);
    }

}
