package String;

public class stringbuilder
{
    public static void main(String[] args) 
    {
     
        StringBuilder name = new StringBuilder();
        name.append("hari");
        name.append("rama");
        name.append("krishnan");
        System.out.println(name);
        System.out.println(name.capacity());
        System.out.println(name.codePointAt(0));
        int b = 'h';
        System.out.println(b);
        name.delete(0,4);
        System.out.println(name);
        name.insert(0,"l");
        System.out.println(name);
        char a = (char)(1+2);
        int c = (int)('a'+'b');
         System.out.println(a);
        System.out.println(c);
        System.out.printf("%s  %s \n",a,c);
        System.out.printf("%c  %c",a,c);
    }
}