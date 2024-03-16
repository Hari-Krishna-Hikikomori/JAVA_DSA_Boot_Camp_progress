package OOPS.Generics;

public class vari <T>
{
    protected Object [] arr;
    public int size = 0;
    protected void ExtendSize(T [] value, T tar, int index)
    {
        Object [] temp;
        if(index >value.length * 2)
        {
            temp = new Object[index];
        }
        else
        {
            temp = new Object [value.length * 2];
        }
        for (int i = 0; i <value.length; i++) {
            temp[i] = value[i];
        }
        temp[index] = tar;
        arr = temp;
    }

    private String diplay()
    {
        System.out.print("[");
        if(arr[0] != null)
        {
            System.out.print(arr[0]+",");
        }
        else
        {
            System.out.print("Null");
        }
        for (int i = 1; i < arr.length-1; i++)
        {
          if(arr[i] != null)
          {
              System.out.print(" "+arr[i]+",");
          }
          else
          {
              System.out.print(" NULL,");
          }

        }
        if(arr[arr.length-1]!= null)
        {
            return " "+arr[arr.length-1]+"]";
        }
        else
        {
            return " NULL]";
        }
    }
    private boolean check(Object[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] != null)
            {
                return true;
            }
        }
        return false;
    }
    protected String show()
    {
        return check(arr) ? diplay() : "[]";
    }

}
