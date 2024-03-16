package OOPS.ObjectCloning;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;

public class Student implements Cloneable
{
    private int age;
    private String name;

    private int[] mark = new int[5];
    int count = 5;

    Student()
    {
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setMark(int num)
    {
       mark[5-count] = num;
       --count;
    }
    void setMark(int index,int num)
    {
        mark[index-1] = num;
    }

    Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    void getDetail()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(Arrays.toString(mark));
    }
    int getMark(int index)
    {
        return this.mark[index];
    }

    void reset()
    {
        mark = new int[5];
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
      Student obj = (Student)super.clone();  // Shallow copy

      obj.reset();  // deep copy
        for (int i = 0; i < obj.mark.length ; i++)
        {
          obj.mark[i] = getMark(i);
        }
        return obj;
    }
}
