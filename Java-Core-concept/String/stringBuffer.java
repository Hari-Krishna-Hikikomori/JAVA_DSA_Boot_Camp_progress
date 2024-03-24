package String;

import java.util.Arrays;

public class stringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer(10);

        //add string
        str.append("Raghul");
        str.append("Gokhul");
        System.out.println(str);

        //total size of String not total Element
        //Note that the String buffer is like ArraysList if the storage limit is full it will take extra space automatically
        System.out.println(str.capacity());

        // delete certain Value between to index's
        str.delete(7,13);

        // return as String Type
        String str2 = str.toString();
        System.out.println(str2);

        // insert a full String or single char to Specific index
        str.insert(2,"________");
        str2 = str.toString();

        // replace a certain string to another
        str2 = str2.replace(" ","");

        // split and convent into an Array for certain condition or String
        String[] str3 = str2.split("",str2.length());
        System.out.println(Arrays.toString(str3));


        randomString r = new randomString();

        System.out.println(r.getRandom(10));
    }
}
